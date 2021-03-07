package br.univates.java.poo.pratica4;

import java.util.Scanner;

public class ContadorCaixaDAgua {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CaixaDAgua caixa = new CaixaDAgua();
        boolean acao;

        while (true) {
            System.out.println("----------------------------");
            System.out.println("Caixa d'água (25 mil litros)");
            System.out.println("1. Adicionar valor");
            System.out.println("2. Zerar valor");
            System.out.println("0. Finalizar");
            double x = scanner.nextDouble();
            if (x == 1) {
                acao = true;
                while (acao) {
                    System.out.println("----------------------------");
                    System.out.println("Digite o valor a ser movimentado (0 para voltar):");
                    x = scanner.nextDouble();
                    if (x > 0) {
                        caixa.addConsumo(x);
                        if (caixa.getConsumo() > caixa.getLimite()) {
                            System.out.println("----------------------------");
                            System.out.println("!!! Operando acima da capacidade máxima !!!");
                        }
                        System.out.println("Valor adicionado!");
                    } else if (x == 0) {
                        acao = false;
                    } else {
                        System.out.println("Valor inválido! Tente novamente.");
                    }
                }
            } else if (x == 2) {
                caixa.zeraContador();
                System.out.println("Contador zerado!");
            } else if (x == 0) {
                System.out.println("Valor total: " + caixa.getConsumo() + " litros");
                break;
            } else {
                System.out.println("Valor inválido! Tente novamente.");
            }
        }
    }
}
