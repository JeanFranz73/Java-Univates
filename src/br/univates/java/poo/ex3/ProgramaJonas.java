package br.univates.java.poo.ex3;

import java.util.Scanner;

public class ProgramaJonas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Planilha planilha = new Planilha();
        boolean acao;
        int x, y;

        String informe = """
                ------------------------
                Informe o atleta:""";
        String erro = """
                ------------------------
                Opção inválida! Tente novamente.""";
        String menu = """
                ------------------------
                |   Planilha de Jonas  |
                |  1. Adicionar tempo  |
                |  2. Resumo total     |
                |  3. Resumo de atleta |
                |  0. Sair             |
                ------------------------""";

        for (int i = 0; i < planilha.getAtleta().length; i++) {
            System.out.print("Informe o nome do atleta " + (i + 1) + ": ");
            planilha.getAtleta()[i].setNome(scanner.nextLine());

            System.out.print("Agora, informe o tempo da primeira volta de " + planilha.getAtleta()[i].getNome() + ": ");
            planilha.getAtleta()[i].addTempo(scanner.nextDouble());
            scanner.nextLine();
        }

        while (true) {
            System.out.println(menu);
            x = scanner.nextInt();
            if (x == 1) {
                System.out.println(informe);
                for (int i = 0; i < planilha.getAtleta().length; i++) {
                    System.out.println("- [" + (i + 1) + "] " + planilha.getAtleta()[i].getNome());
                }
                System.out.println("- [0] Voltar");
                acao = true;
                while (acao) {
                    x = scanner.nextInt();
                    if (x < 0 || x > planilha.getAtleta().length) {
                        System.out.println(erro);
                    } else if (x == 0) {
                        acao = false;
                    } else {
                        System.out.println("Agora, digite o tempo registrado:");
                        y = scanner.nextInt();
                        if (y > 0) {
                            planilha.getAtleta()[x - 1].addTempo(y);
                            System.out.println("Tempo registrado!");
                            acao = false;
                        } else if (y == 0) {
                            acao = false;
                        } else {
                            System.out.println(erro);
                        }
                    }
                }
            } else if (x == 2) {
                System.out.printf("Média geral dos atletas: %.3f segundos\n", planilha.getMediaTempoAtletas());
                System.out.printf("Volta mais rápida: de " + planilha.getAtletaComMenorTempo().getNome() + ", com %.3f segundos\n", planilha.getAtletaComMenorTempo().getMenorTempo());
                System.out.printf("Volta mais lenta: de " + planilha.getAtletaComMaiorTempo().getNome() + ", com %.3f segundos\n", planilha.getAtletaComMaiorTempo().getMenorTempo());
                System.out.println("------------------------");
                System.out.println("Atletas que fizeram a volta com menos de 10 segundos:");
                for (int i = 0; i < planilha.getAtletasComMenosDe10().length; i++) {
                    System.out.printf("- " + planilha.getAtletasComMenosDe10()[i].getNome() + ", com %.3f segundos\n", planilha.getAtletasComMenosDe10()[i].getMenorTempo());
                }

            } else if (x == 3) {
                System.out.println(informe);
                for (int i = 0; i < planilha.getAtleta().length; i++) {
                    System.out.println("- [" + (i + 1) + "] " + planilha.getAtleta()[i].getNome());
                }
                System.out.println("- [0] Voltar");
                acao = true;
                while (acao) {
                    x = scanner.nextInt();
                    if (x < 0 || x > planilha.getAtleta().length) {
                        System.out.println(erro);
                    } else if (x == 0) {
                        acao = false;
                    } else {
                        System.out.println("Resumo de " + planilha.getAtleta()[x - 1].getNome());
                        System.out.println("------------------------");
                        for (int i = 0; i < planilha.getAtleta()[x - 1].getTempo().length; i++) {
                            System.out.printf("Volta " + (i + 1) + ": %.3f segundos\n", planilha.getAtleta()[x - 1].getTempo()[i]);
                        }
                        System.out.println("------------------------");
                        System.out.printf("Média geral: %.3f segundos\n", planilha.getAtleta()[x - 1].getMediaTempo());
                        System.out.printf("Menor tempo: %.3f segundos\n", planilha.getAtleta()[x - 1].getMenorTempo());
                        System.out.printf("Maior tempo: %.3f segundos\n", planilha.getAtleta()[x - 1].getMaiorTempo());
                        acao = false;
                    }
                }
            }
        }
    }
}
