package br.univates.java.poo.pratica10;

import java.util.Scanner;

public class TelaPrincipal {
    /**
     * @date 30/03/2021
     * @author jean.franz
     **/
    private Alambique alambique1;
    private Alambique alambique2;
    private Alambique alambique3;

    public TelaPrincipal() {
        this.alambique1 = new Alambique(100000, 500000, 100000, .75);
        this.alambique2 = new Alambique(500000, 1200000, 200000, .75);
        this.alambique3 = new Alambique(500000, 1200000, 200000, .75);
    }

    public void select() {
        Scanner scanner = new Scanner(System.in);
        int x;
        while (true) {

            System.out.println("----------------------");
            System.out.println("Digite o alambique desejado: ");
            System.out.println("1. Alambique 1: comporta " + (alambique1.getReservaCachaca().getLimite() / 1000) + " litros de cachaça e " + (alambique1.getReservaCana().getLimite() / 1000) + " litros de cana");
            System.out.println("2. Alambique 2: comporta " + (alambique2.getReservaCachaca().getLimite() / 1000) + " litros de cachaça e " + (alambique2.getReservaCana().getLimite() / 1000) + " litros de cana");
            System.out.println("3. Alambique 3: comporta " + (alambique3.getReservaCachaca().getLimite() / 1000) + " litros de cachaça e " + (alambique3.getReservaCana().getLimite() / 1000) + " litros de cana");
            System.out.println("0. Finalizar expediente");

            x = scanner.nextInt();
            scanner.nextLine();
            if (x == 1) {
                TelaMenu tela = new TelaMenu(alambique1);
                tela.show();
            } else if (x == 2) {
                TelaMenu tela = new TelaMenu(alambique2);
                tela.show();
            } else if (x == 3) {
                TelaMenu tela = new TelaMenu(alambique3);
                tela.show();
            } else if (x == 0) {
                break;
            } else {
                System.out.println("----------------------");
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
