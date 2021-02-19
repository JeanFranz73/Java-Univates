package br.univates.java.poo;

import java.util.Scanner;

public class CalculoTriangulo {
    public static void main(String[] args) {

        /**
         * @date 18/02/2021
         *
         * Questão 1.
         * Desenvolva um programa que tem como entradas os lados de um triângulo
         * e como saída a área e o perímetro desse triângulo.
         */

        Scanner scanner = new Scanner(System.in);

        double a, b, c, p, area, perimetro;

        System.out.println("Digite o primeiro lado:");
        a = scanner.nextDouble();

        System.out.println("Digite o primeiro lado:");
        b = scanner.nextDouble();

        System.out.println("Digite o primeiro lado:");
        c = scanner.nextDouble();

        p = (a + b + c) / 2;

        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        perimetro = a + b + c;

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}
