package br.univates.java.poo;

import java.util.Random;

public class MegaSennaComFuncao {
    public static void main(String[] args) {

        /**
         * @date 23/02/2021
         *
         * Questão 5.
         * Nossa turma adora jogar na Mega Senna, principalmente quando
         * o prêmio está acumulado. Faça um programa que produz
         * e exibe 10 jogos da Mega Senna. O programa deve conter
         * um módulo que para gerar os jogos
         * (preencher um vetor de 6 posições de forma aleatória).
         */

        System.out.println("MEGA SENNA");
        System.out.println("-----------------");

        megaSenna(10);

    }

    public static void megaSenna(int Sorteios) {

        Random random = new Random();
        int[][] jogo = new int[Sorteios][6];

        for (int i = 0; i < Sorteios; i++) {
            for (int j = 0; j < 6; j++) {
                jogo[i][j] = random.nextInt(60);
                System.out.print(jogo[i][j] + " ");
            }
            System.out.println();
        }
    }
}
