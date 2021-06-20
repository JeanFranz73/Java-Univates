package br.univates.java.poo.pratica3;

import java.util.Scanner;

public class ProgramaTriangulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();

        System.out.println("Digite o valor de A:");
        triangulo.a = scanner.nextDouble();
        System.out.println("Agora, o valor de B:");
        triangulo.b = scanner.nextDouble();
        System.out.println("Por último, o valor de C:");
        triangulo.c = scanner.nextDouble();

        System.out.println("Área do triângulo: " + triangulo.calculaAreaTriangulo());

    }
}
