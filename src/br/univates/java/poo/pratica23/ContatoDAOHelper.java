package br.univates.java.poo.pratica23;

import br.univates.pedro.Arquivo;

public class ContatoDAOHelper {
    /**
     * @date 27/05/2021
     * @author jean.franz
     **/

    public int getQtdeContatos() {
        Arquivo arquivo = new Arquivo("C:\\contatos.csv");
        int linhas = 0;
        arquivo.abrirLeitura();
        while (arquivo.lerLinha() != null) {
            linhas++;
        }
        arquivo.fecharArquivo();
        return linhas;
    }
}
