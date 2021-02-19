package br.univates.java.poo;

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {

        /**
         * @date 18/02/2021
         *
         * Questão 4.
         * Crie um programa que recebe do usuário vários números,
         * até que o número zero seja digitado para finalizar o processo.
         * Ao finalizar, o sistema deve exibir a soma de todos os números.
         */

        Scanner scanner = new Scanner(System.in);

        int x;
        int total = 0;
        boolean i = false;

        while(i == false) {
            System.out.println("Digite um número:");
            x = scanner.nextInt();

            if(x == 0) {
                System.out.println("Total: " + total);
                i = true;
            } else {
                total += x;
            }
        }
    }
}
