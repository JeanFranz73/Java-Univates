package br.univates.java.poo;

import java.util.Scanner;

public class CalculaVolumeLata {
    public static void main(String[] args) {

        /**
         * @date 25/02/2021
         *
         * Exercício 2
         * Marcão é um empresário que acaba de comprar uma planta industrial
         * para produzir óleo vegetal. Ele está precisando de ajuda para calcular
         * a capacidade de uma lata de azeite e o número de latas que precisa produzir
         * para atender cada um dos pedidos. As latas de azeite são cilíndricas,
         * ou seja, o fundo e a tampa redondas e de mesmo tamanho.
         * Faça um programa que recebe do usuário o raio da base (fundo ou tampa)
         * e a altura da lata. Então calcule o volume da lata e mostre na tela para ajudar
         * o Marcão a saber quanto cabe em cada lata
         * (o programa deve ter um módulo para calcular o volume da lata).
         */

        Scanner scanner = new Scanner(System.in);

        double x, y;
        System.out.println("Digite o raio do cilindro (em cm):");
        x = scanner.nextDouble();

        System.out.println("Agora digite a altura do cilindro (em cm):");
        y = scanner.nextDouble();

        System.out.printf("%.2f", (calculaVolume(x, y)));
        System.out.println("cm³");

    }

    public static double calculaVolume(double r, double h) {
        double volume;

        volume = Math.PI * Math.pow(r, 2) * h;

        return volume;
    }
}
