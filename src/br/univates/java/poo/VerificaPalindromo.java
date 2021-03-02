package br.univates.java.poo;

import java.util.Scanner;

public class VerificaPalindromo {
    public static void main(String[] args) {

        /**
         * @date 23/02/2021
         *
         * Questão 3.
         * Crie um programa que recebe do usuário uma palavra
         * e informe se essa palavra é ou não é um palíndromo
         * (faça um módulo para realizar esse processamento).
         */

        Scanner scanner = new Scanner(System.in);

        String x;

        System.out.println("Digite uma palavra:");
        x = scanner.nextLine();
        if (verificaPalindromo(x)) {
            System.out.println("Esta palavra é palíndroma");
        } else {
            System.out.println("Esta palavra não é palíndroma");
        }
    }

    public static String invertePalavra(String palavra) {
        String inversa = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {

            inversa += palavra.charAt(i);
        }
        return inversa;
    }

    public static boolean verificaPalindromo(String palavra) {
        boolean result = false;
        String inversa = invertePalavra(palavra.toLowerCase());
        if (inversa.equals(palavra.toLowerCase())) {
            result = true;
        }
        return result;
    }
}
