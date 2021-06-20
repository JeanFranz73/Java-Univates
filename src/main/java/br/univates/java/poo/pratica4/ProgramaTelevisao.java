package br.univates.java.poo.pratica4;

import java.util.Scanner;

public class ProgramaTelevisao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Televisao tv = new Televisao();

        int x;
        boolean acao;

        System.out.println("Televisão 50' 4K");
        while (true) {
            System.out.println("--------------------");
            System.out.print("Canal " + tv.getCanal() + ", com o volume em " + tv.getVolume() + "% e o mute ");
            if (tv.isMudo()) {
                System.out.println("ativado");
            } else {
                System.out.println("desativado");
            }
            System.out.println("1. Ajustar volume");
            System.out.println("2. Trocar de canal");
            System.out.println("0. Finalizar");

            x = scanner.nextInt();

            if (x == 1) {
                acao = true;
                while (acao) {
                    System.out.println("--------------------");
                    System.out.println("Volume atual: " + tv.getVolume() + "%");
                    System.out.println("1. Aumentar 10%");
                    System.out.println("2. Diminuir 10%");
                    System.out.println("3. Mudo");
                    System.out.println("0. Voltar");

                    x = scanner.nextInt();

                    if (x == 1) {
                        tv.mudaVolume(10);
                        if (tv.getVolume() > tv.getLimiteVolume()) {
                            System.out.println("--------------------");
                            System.out.println("Limite máximo do volume atingido!");
                            tv.setVolume(tv.getLimiteVolume());
                        } else {
                            System.out.println("--------------------");
                            System.out.println("Volume aumentado em 10%!");
                        }
                    } else if (x == 2) {
                        tv.mudaVolume(-10);
                        if (tv.getVolume() < 0) {
                            System.out.println("--------------------");
                            System.out.println("Não há como reduzir mais o volume!");
                            tv.setVolume(0);
                        } else {
                            System.out.println("--------------------");
                            System.out.println("Volume reduzido em 10%!");
                        }
                    } else if (x == 3) {
                        if (tv.isMudo()) {
                            tv.setMudo(false);
                            System.out.println("--------------------");
                            System.out.println("Mute desativado!");
                        } else {
                            tv.setMudo(true);
                        }
                    } else if (x == 0) {
                        acao = false;
                    } else {
                        System.out.println("--------------------");
                        System.out.println("Operação inválda! Tente novamente");
                    }
                    if (tv.isMudo()) {
                        System.out.println("--------------------");
                        System.out.println("Mute ativado!");
                    }
                }
            } else if (x == 2) {
                System.out.println("--------------------");
                System.out.println("Digite o canal que deseja assistir:");
                tv.setCanal(scanner.nextInt());
            } else if (x == 0) {
                break;
            } else {
                System.out.println("--------------------");
                System.out.println("Comando inválido! Tente novamente.");
            }
        }
    }
}
