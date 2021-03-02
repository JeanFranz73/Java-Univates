package br.univates.java.poo;

import java.util.Scanner;

public class CalculoTrianguloComFuncao {
    public static void main(String[] args) {

        /**
         * @date 23/02/2021
         *
         * Questão 1.
         * Desenvolva um programa que tem como entradas os lados de um triângulo
         * e como saída a área e o perímetro desse triângulo, mas faça um módulo
         * para calcular o perímetro do triângulo e um módulo para calcular
         * a área do triângulo (e outros módulos que julgar necessários).
         */

        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.println("Digite o primeiro lado:");
        a = scanner.nextDouble();

        System.out.println("Agora, digite o segundo lado:");
        b = scanner.nextDouble();

        System.out.println("Por último, digite o terceiro lado:");
        c = scanner.nextDouble();

        System.out.println("Área: " + calculaArea(a, b, c));
        System.out.println("Perímetro: " + calculaPerimetro(a, b, c));
    }

    public static double calculaPerimetro(double a, double b, double c) {
        return a + b + c;
    }

    public static double calculaArea(double a, double b, double c) {
        double p = calculaPerimetro(a, b, c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
