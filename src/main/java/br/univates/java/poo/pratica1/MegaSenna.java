package br.univates.java.poo.pratica1;

import java.util.Random;

public class MegaSenna {
    public static void main(String[] args) {

        /**
         * @date 18/02/2021
         *
         * Questão 8.
         * Nossa turma adora jogar na Mega Senna, principalmente quando
         * o prêmio está acumulado. Faça um programa que preencha (automaticamente)
         * um vetor com 6 posições com os números da Mega Senna (um jogo feito pela máquina).
         * Finalize exibindo o vetor.
         */

        Random random = new Random();

        int[] jogo = new int[6];

        System.out.println("MEGA SENNA");
        System.out.println("-----------------");

        for (int i = 0; i < jogo.length; i++) {
            System.out.print(random.nextInt(60) + 1 + " ");
        }
    }
}
