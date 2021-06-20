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

    public boolean isOpcaoValida(int opc) {
        boolean result = false;

        if (opc == 1 || opc == 2 || opc == 3) {
            result = true;
        }

        return result;
    }

    public boolean excluirTodosContatos(Arquivo arquivo) {
        boolean result = false;
        if (arquivo.abrirEscrita()) {
            for (int i = 0; i < getQtdeContatos(); i++) {
                arquivo.escreverLinha(null);
            }
            result = true;
        }
        arquivo.fecharArquivo();

        return result;
    }
}
