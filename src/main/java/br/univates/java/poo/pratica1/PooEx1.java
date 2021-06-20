package br.univates.java.poo.pratica1;

import java.util.Random;
import java.util.Scanner;

public class PooEx1 {
    public static void main(String[] args) {

        /**
         * @date 18/01/2021
         *
         * Exercício 1.
         * Desenvolver um programa que receba e preencha uma matriz de 4 linhas
         * e 5 colunas com números inteiros. Depois solicite para o usuário o número
         * de uma linha e apresente a soma dos números que estão naquela linha.
         * Depois solicite para o usuário o número de uma coluna
         * e apresente a média (aritmética simples) dos números que estão naquela coluna.
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[4][5];
        int x = 0;
        int somaLinhas = 0;
        double somaColunas = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Digite o número de uma das linhas:");
        x = scanner.nextInt();

        for (int i = 0; i < 5; i++) {
            somaLinhas += matriz[x - 1][i];
        }

        System.out.println("Soma dos valores da linha " + x + ": " + somaLinhas);

        x = 0;

        System.out.println("Agora, digite o número de uma das colunas:");
        x = scanner.nextInt();

        for (int i = 0; i < 4; i++) {
            somaColunas += matriz[i][x - 1];
        }

        System.out.println("Média dos valores da coluna " + x + ": " + somaColunas / 5);
    }
}
