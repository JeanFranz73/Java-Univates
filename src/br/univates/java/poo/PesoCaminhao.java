package br.univates.java.poo;

import java.util.Scanner;

public class PesoCaminhao {
    public static void main(String[] args) {

        /**
         * @date 18/02/2021
         *
         * Questão 2.
         * Uma rodovia tem limite de peso para tráfego de veículos pesados.
         * Crie um programa que solicita ao usuário o peso de um caminhão carregado
         * e se esse for superior a 40 mil kg, exiba uma mensagem informando
         * ao motorista que ele está multado e não deve prosseguir viajando.
         * Caso contrário, o sistema deve exibir “boa viagem”.
         */

        Scanner scanner = new Scanner(System.in);

        double peso;

        System.out.println("Digite o peso do seu caminhão:");
        peso = scanner.nextDouble();

        if (peso > 40000) {
            System.out.println("Você foi multado e não poderá prosseguir");
        } else {
            System.out.println("Peso nos conformes. Boa viajem!");
        }
    }
}
