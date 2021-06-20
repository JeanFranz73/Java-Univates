package br.univates.java.poo.pratica20;

import br.univates.pedro.Arquivo;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;

@Getter
@Setter
public class ColegaUtils extends Arquivo {
    /**
     * @date 18/05/2021
     * @author jean.franz
     **/

    private int linhas, qtdeGrupos;
    private ArrayList<Colega> colegas;
    private ArrayList<ArrayList<Colega>> gruposColegas;

    public ColegaUtils(String nomeArquivo) {
        super(nomeArquivo);
        this.linhas = qtdeColegas();
        this.colegas = new ArrayList<>();
        this.gruposColegas = new ArrayList<>();
    }

    public int qtdeColegas() {
        int result = 0;
        abrirLeitura();
        while (lerLinha() != null) {
            result++;
        }
        fecharArquivo();
        return result;
    }

    public int qtdeGrupos(int qtdePorGrupo) {
        int qtdeGrupos = 0;
        int colegasRest = qtdeColegas();

        while (colegasRest >= qtdePorGrupo - 1) {
            qtdeGrupos++;
            colegasRest -= qtdePorGrupo;
        }
        return qtdeGrupos;
    }

    public boolean gerarColegas() {
        boolean result = false;

        abrirLeitura();

        for (int i = 0; i < linhas; i++) {
            String[] colega = lerLinha().split(";");
            colegas.add(new Colega(colega[0], colega[1]));
            result = true;
        }

        fecharArquivo();

        return result;
    }

    public void gerarGrupos(int qtdeColegas) {

        ArrayList<Colega> colegasRestantes = colegas;
        Collections.shuffle(colegasRestantes);

        for (int i = 0; i < qtdeGrupos(qtdeColegas); i++) {
            ArrayList<Colega> grupoColega = new ArrayList<>();
            if (i != qtdeGrupos(qtdeColegas) - 1) {
                for (int j = 0; j < qtdeColegas; j++) {
                    if (!colegasRestantes.isEmpty() || colegasRestantes.size() == 1) {
                        grupoColega.add(colegasRestantes.get(0));
                        colegasRestantes.remove(0);
                    }
                }
            } else {
                for (int j = 0; j < qtdeColegas + 1; j++) {
                    if (!colegasRestantes.isEmpty() || colegasRestantes.size() == 1) {
                        grupoColega.add(colegasRestantes.get(0));
                        colegasRestantes.remove(0);
                    }
                }
            }
            gruposColegas.add(grupoColega);
        }


    }
}