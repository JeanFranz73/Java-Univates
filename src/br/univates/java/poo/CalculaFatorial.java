package br.univates.java.poo;

import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {

        /**
         * @date 23/02/2021
         *
         * Questão 2.
         * Crie um programa para receber um número inteiro e exibir o seu fatorial.
         * Faça, claro, um módulo para calcular o valor fatorial.
         */

        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Digite um valor: ");
        x = scanner.nextInt();

        System.out.println("O fatorial de " + x + " é " + calculaFatorial(x));
    }

    public static int calculaFatorial(int x) {
        int fatorial = 1;
        for (int i = 1; i <= x; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
