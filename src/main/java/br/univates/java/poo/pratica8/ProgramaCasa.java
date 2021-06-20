package br.univates.java.poo.pratica8;

import java.util.Scanner;

public class ProgramaCasa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CasaShows casa = new CasaShows(200);

        int x;

        String erro = """
                -----------------
                Opção inválida! Tente novamente.""";

        String erroQtde = """
                -----------------
                Quantidade indisponível.""";

        String add = """
                -----------------
                Adicionado com sucesso!""";

        String addSaida = """
                -----------------
                Saída realizada com sucesso!""";

        String qtde = """
                -----------------
                Informe a quantidade:""";

        String menu = """
                -----------------
                1. Adicionar Eles
                2. Adicionar Elas
                3. Sair da casa
                4. Caixa
                5. Lotação atual
                0. Finalizar""";

        while (true) {
            System.out.println(menu);
            x = scanner.nextInt();
            if (x == 1) {
                System.out.println(qtde);
                x = scanner.nextInt();
                if (x > 0) {
                    if (casa.addEles(x)) {
                        System.out.println(add);
                    } else {
                        System.out.println(erroQtde);
                    }
                } else {
                    System.out.println(erro);
                }
            } else if (x == 2) {
                System.out.println(qtde);
                x = scanner.nextInt();
                if (x > 0) {
                    if (casa.addElas(x)) {
                        System.out.println(add);
                    } else {
                        System.out.println(erroQtde);
                    }
                } else {
                    System.out.println(erro);
                }
            } else if (x == 3) {
                System.out.println(qtde);
                x = scanner.nextInt();
                if (x > 0) {
                    if (casa.sair(x)) {
                        System.out.println(addSaida);
                    } else {
                        System.out.println(erroQtde);
                    }
                } else {
                    System.out.println(erro);
                }
            } else if (x == 4) {
                System.out.printf("-----------------\nCaixa atual: R$%.2f\n", casa.getValor());
            } else if (x == 5) {
                System.out.println("-----------------\nLotação atual: " + casa.getPessoas() + "/" + casa.getCapacidade() + " pessoas");
            } else if (x == 0) {
                break;
            } else {
                System.out.println(erro);
            }

        }
    }
}