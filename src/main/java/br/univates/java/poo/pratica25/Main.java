package br.univates.java.poo.pratica25;

import javax.swing.*;

public class Main {
    /**
     * @author jean.franz
     * * @date 27/05/2021
     **/

    public static void main(String[] args) {

        ListaContatos tela = new ListaContatos();

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(tela, "Erro ao configurar Look and Feel recomendado, será utilizado a versão default.");
        }

        tela.setContentPane(tela.getPanel());
        tela.setTitle("Agenda de contatos");
        tela.pack();
        tela.setVisible(true);
    }
}
