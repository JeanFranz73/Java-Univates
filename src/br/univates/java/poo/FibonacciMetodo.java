package br.univates.java.poo;

import java.util.Scanner;

public class FibonacciMetodo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor:");
        int x = scanner.nextInt();

        System.out.println(geraFibonacci(x));
    }

    public static int geraFibonacci(int x) {
        int n1 = 0, n2 = 1, valor = 0;
        for (int i = 0; i < x; i++) {
            if (i == 0) {
                valor = 1;
                System.out.println(valor);
            } else {
                valor = n1 + n2;
                n1 = n2;
                n2 = valor;
                System.out.println(valor);
            }
        }
        return valor;
    }
}
