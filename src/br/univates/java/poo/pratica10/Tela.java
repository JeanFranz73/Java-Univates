package br.univates.java.poo.pratica10;

import java.util.Scanner;

public class Tela {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Alambique alambique1 = new Alambique(100000, 500000, 100000, .75);
        Alambique alambique2 = new Alambique(500000, 1200000, 200000, .75);
        Alambique alambique3 = new Alambique(500000, 1200000, 200000, .75);

        Alambique alambique = new Alambique();

        int x;
        boolean acao;

        String menu = """
                ----------------------
                1. Selecionar alambique
                2. Iniciar produção
                3. Adicionar caldo de cana
                4. Engarrafar cachaça pronta
                5. Limpar reservatório de resíduos
                6. Status atual do alambique
                0. Finalizar""";

        System.out.println("Digite o alambique desejado: ");
        System.out.println("1. Alambique 1: comporta " + (alambique1.getReservaCachaca().getLimite() / 1000) + " litros de cachaça e " + (alambique1.getReservaCana().getLimite() / 1000) + " litros de cana");
        System.out.println("2. Alambique 2: comporta " + (alambique2.getReservaCachaca().getLimite() / 1000) + " litros de cachaça e " + (alambique2.getReservaCana().getLimite() / 1000) + " litros de cana");
        System.out.println("3. Alambique 3: comporta " + (alambique3.getReservaCachaca().getLimite() / 1000) + " litros de cachaça e " + (alambique3.getReservaCana().getLimite() / 1000) + " litros de cana");
        x = scanner.nextInt();
        if (x == 1) {
            alambique = alambique1;
        } else if (x == 2) {
            alambique = alambique2;
        } else if (x == 3) {
            alambique = alambique3;
        } else {
            System.out.println("----------------------\nValor indisponível! Adicione outro valor.");
        }

        while (true) {
            System.out.println(menu);
            x = scanner.nextInt();
            scanner.nextLine();
            if (x == 1) {
                acao = true;
                while (acao) {
                    System.out.println("Digite o alambique desejado: ");
                    System.out.println("1. Alambique 1: comporta " + (alambique1.getReservaCachaca().getLimite() / 1000) + " litros de cachaça e " + (alambique1.getReservaCana().getLimite() / 1000) + " litros de cana");
                    System.out.println("2. Alambique 2: comporta " + (alambique2.getReservaCachaca().getLimite() / 1000) + " litros de cachaça e " + (alambique2.getReservaCana().getLimite() / 1000) + " litros de cana");
                    System.out.println("3. Alambique 3: comporta " + (alambique3.getReservaCachaca().getLimite() / 1000) + " litros de cachaça e " + (alambique3.getReservaCana().getLimite() / 1000) + " litros de cana");
                    System.out.println("0. Voltar");
                    x = scanner.nextInt();
                    if (x == 1) {
                        alambique = alambique1;
                        acao = false;
                    } else if (x == 2) {
                        alambique = alambique2;
                        acao = false;
                    } else if (x == 3) {
                        alambique = alambique3;
                        acao = false;
                    } else if (x == 0) {
                        acao = false;
                    } else {
                        System.out.println("----------------------\nValor indisponível! Adicione outro valor.");
                    }
                }
            } else if (x == 2) {
                if (alambique.iniciaProducao()) {
                    System.out.println("----------------------\nProdução completa!");
                } else {
                    System.out.println("----------------------\nVerifique o espaço nos reservatórios e a quantidade de caldo de cana disponível.");
                }
            } else if (x == 3) {
                acao = true;
                while (acao) {
                    System.out.println("----------------------\n[0] para voltar\nDigite a quantidade desejada:");
                    x = scanner.nextInt();
                    scanner.nextLine();
                    if (alambique.getReservaCana().addQtde(x * 1000)) {
                        System.out.println("----------------------\nCaldo adicionado!");
                        acao = false;
                    } else if (x == 0) {
                        acao = false;
                    } else {
                        System.out.println("----------------------\nValor indisponível! Adicione outro valor.");
                    }
                }
            } else if (x == 4) {
                if (alambique.encheGarrafas()) {
                    System.out.println("----------------------\nGarrafas preenchidas!");
                } else {
                    System.out.println("----------------------\nQuantidade insuficiente para encher uma garrafa!");
                }
            } else if (x == 5) {
                alambique.getReservaIntermediario().zeraQtde();
                System.out.println("----------------------\nReservatório de resíduos limpo!");
            } else if (x == 6) {
                System.out.println("----------------------");
                System.out.println("Reservatório de cana:           " + (alambique.getReservaCana().getQuantidade() / 1000) + "/" + (alambique.getReservaCana().getLimite() / 1000) + " litros");
                System.out.println("Reservatório de cachaça:        " + (alambique.getReservaCachaca().getQuantidade() / 1000) + "/" + (alambique.getReservaCachaca().getLimite() / 1000) + " litros");
                System.out.println("Reservatório intermediário:     " + (alambique.getReservaIntermediario().getQuantidade() / 1000) + "/" + (alambique.getReservaIntermediario().getLimite() / 1000) + " litros");
                System.out.println("Garrafas prontas para despacho: " + alambique1.getGarrafasCheias());
            } else if (x == 0) {
                break;
            } else {
                System.out.println("Valor inválido!");
            }
        }
    }
}
