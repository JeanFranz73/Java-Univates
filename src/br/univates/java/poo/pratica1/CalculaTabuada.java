package br.univates.java.poo.pratica1;

import java.util.Scanner;

public class CalculaTabuada {
    public static void main(String[] args) {

        /**
         * @date 18/02/2021
         *
         * Questão 3.
         * Crie um sistema que recebe do usuário UM número
         * e depois exibe a tabuada desse número.
         */

        Scanner scanner = new Scanner(System.in);

        int x;

        System.out.println("Digite um número inteiro: ");
        x = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(x + " x " + (i + 1) + ": " + x * (i + 1));
        }
    }
}
