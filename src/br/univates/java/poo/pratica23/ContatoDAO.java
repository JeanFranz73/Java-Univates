package br.univates.java.poo.pratica23;

import br.univates.pedro.Arquivo;

import java.util.ArrayList;

public class ContatoDAO extends ContatoDAOHelper {
    /**
     * @date 27/05/2021
     * @author jean.franz
     **/

    public boolean salvar(Contato novoContato) {
        boolean result = false;
        Arquivo arquivo = new Arquivo("C:\\contatos.csv");
        ArrayList<Contato> contatos = ler();
        contatos.add(novoContato);
        if (arquivo.abrirEscrita()) {
            for (Contato c : contatos) {
                arquivo.escreverLinha(c.getContatoFormatado());
            }
            result = true;
        }
        arquivo.fecharArquivo();
        return result;
    }

    public ArrayList<Contato> ler() {
        Arquivo arquivo = new Arquivo("C:\\contatos.csv");
        ArrayList<Contato> contatos = new ArrayList<>();

        if (arquivo.abrirLeitura()) {
            for (int i = 0; i < getQtdeContatos(); i++) {
                String[] infosContatoAtual = arquivo.lerLinha().split(";");
                Contato contatoAtual = new Contato(infosContatoAtual[0], infosContatoAtual[1], infosContatoAtual[2]);
                contatos.add(contatoAtual);
            }
        }
        arquivo.fecharArquivo();
        return contatos;
    }
}
