package br.univates.java.poo.pratica5;

import java.util.Scanner;

public class ProgramaRefill {
    public static void main(String[] args) {

        MaquinaRefrigerante refri = new MaquinaRefrigerante();

        Scanner scanner = new Scanner(System.in);
        int x, y;
        boolean acao;

        String menuPrincipal = """
                -----------------
                Máquina de Refill
                1. Pegar um copo
                2. Repor ingrediente
                3. Exibir informações
                0. Finalizar""";

        String menuSabores = """
                -----------------
                Selecione o sabor:
                1. Cola
                2. Guaraná
                3. Limão
                0. Voltar""";

        String menuTamanhos = """
                -----------------
                Selecione o tamanho:
                1. 500ml
                2. 700ml
                3. 1 litro
                0. Voltar""";

        String menuIngredientesRepor = """
                -----------------
                Selecione o ingrediente:
                1. Xarope de Cola
                2. Xarope de Guaraná
                3. Xarope de limão
                4. Água
                5. Gás
                0. Voltar""";

        String erro = """
                -----------------
                Opção inválida! Tente novamente.""";

        String erroExcedido = """
                -----------------
                Não há espaço suficiente na máquina!""";

        String erroFalta = """
                -----------------
                Não há ingredientes o suficiente!""";

        while (true) {
            acao = true;
            System.out.println(menuPrincipal);
            x = scanner.nextInt();

            if (x == 1) {
                while (acao) {
                    System.out.println(menuTamanhos);
                    x = scanner.nextInt();

                    if (x == 1 || x == 2 || x == 3) {
                        System.out.println(menuSabores);

                        y = scanner.nextInt();

                        if (y == 1 || y == 2 || y == 3) {
                            boolean situacao = refri.pegarRefri(x, y);
                            if (!situacao) {
                                System.out.println(erroFalta);
                            }
                            acao = false;
                        } else if (y == 0) {
                            acao = false;
                        } else {
                            System.out.println(erro);
                        }
                    } else if (x == 0) {
                        acao = false;
                    } else {
                        System.out.println(erro);
                    }
                }
            } else if (x == 2) {
                while (acao) {
                    System.out.println(menuIngredientesRepor);
                    x = scanner.nextInt();

                    if (x == 1 || x == 2 || x == 3 || x == 4 || x == 5) {
                        System.out.println("Informe a quantidade desejada (em mililitros):");
                        y = scanner.nextInt();
                        if (y <= refri.receberLimite(x)) {
                            refri.addIngrediente(x, y);
                        } else {
                            System.out.println(erroExcedido);
                        }
                        acao = false;
                    } else {
                        System.out.println(erro);
                    }
                }
            } else if (x == 3) {
                System.out.println("-----------------");
                System.out.println("Xarope de Cola: " + refri.getXaropeCola());
                System.out.println("Xarope de Guaraná: " + refri.getXaropeGuarana());
                System.out.println("Xarope de Limão: " + refri.getXaropeLimao());
                System.out.println("Água: " + refri.getAgua());
                System.out.println("Doses de Gás: " + refri.getGas());
            } else if (x == 0) {
                System.out.println("----- RESUMO -----");
                System.out.println("Xarope de Cola: " + refri.getXaropeCola());
                System.out.println("Xarope de Guaraná: " + refri.getXaropeGuarana());
                System.out.println("Xarope de Limão: " + refri.getXaropeLimao());
                System.out.println("Água: " + refri.getAgua());
                System.out.println("Doses de Gás: " + refri.getGas());
                System.out.println("------------------");
                break;
            } else {
                System.out.println(erro);
            }
        }
    }
}
