package br.univates.java.poo.pratica9;

import java.util.Scanner;

public class Tela {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Alambique alambique = new Alambique(.75);

        int x;
        boolean acao;

        String menu = """
                ----------------------
                1. Iniciar produção
                2. Adicionar caldo de cana
                3. Engarrafar cachaça pronta
                4. Limpar reservatório de resíduos
                5. Status atual do alambiqu
                0. Finalizar""";

        while (true) {
            System.out.println(menu);
            x = scanner.nextInt();
            scanner.nextLine();
            if (x == 1) {
                if (alambique.iniciaProducao()) {
                    System.out.println("----------------------\nProdução completa!");
                } else {
                    System.out.println("----------------------\nVerifique o espaço nos reservatórios e a quantidade de caldo de cana disponível.");
                }
            } else if (x == 2) {
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
            } else if (x == 3) {
                if (alambique.encheGarrafas()) {
                    System.out.println("----------------------\nGarrafas preenchidas!");
                } else {
                    System.out.println("----------------------\nQuantidade insuficiente para encher uma garrafa!");
                }
            } else if (x == 4) {
                alambique.getReservaIntermediario().zeraQtde();
                System.out.println("----------------------\nReservatório de resíduos limpo!");
            } else if (x == 5) {
                System.out.println("----------------------");
                System.out.println("Reservatório de cana:           " + (alambique.getReservaCana().getQuantidade() / 1000) + "/" + (alambique.getReservaCana().getLimite() / 1000));
                System.out.println("Reservatório de cachaça:        " + (alambique.getReservaCachaca().getQuantidade() / 1000) + "/" + (alambique.getReservaCachaca().getLimite() / 1000));
                System.out.println("Reservatório intermediário:     " + (alambique.getReservaIntermediario().getQuantidade() / 1000) + "/" + (alambique.getReservaIntermediario().getLimite() / 1000));
                System.out.println("Garrafas prontas para despacho: " + alambique.getGarrafasCheias());
            } else if (x == 0) {
                break;
            } else {
                System.out.println("Valor inválido!");
            }
        }
    }
}
