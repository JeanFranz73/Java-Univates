package br.univates.java.poo;

import java.util.Scanner;

public class CalculaMediaNumeros {
    public static void main(String[] args) {

        /**
         * @date 18/02/2021
         *
         * Questão 5.
         * Crie um programa que recebe do usuário vários números,
         * até que o número zero seja digitado para finalizar o processo.
         * Ao finalizar o processo o sistema deve exibir a média
         * de todos os números positivos.
         */

        Scanner scanner = new Scanner(System.in);

        int x, valores = 0, total = 0;
        boolean i = false;

        while(!i) {
            System.out.println("Digite um número inteiro:");
            x = scanner.nextInt();

            if (x > 0) {
                valores += x;
                total++;
            } else if (x == 0) {
                System.out.println("Média geral dos números positivos: " + valores / total);
                i = true;
            }
        }
    }
}
