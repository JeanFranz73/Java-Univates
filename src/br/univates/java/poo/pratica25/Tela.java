package br.univates.java.poo.pratica25;

public class Tela {
    /**
     * @author jean.franz
     * * @date 27/05/2021
     **/

    public static void main(String[] args) {
        ListaContatos tela = new ListaContatos();
        tela.setContentPane(tela.getPanel());
        tela.setTitle("Agenda de contatos");
        tela.pack();
        tela.setVisible(true);
    }
}
