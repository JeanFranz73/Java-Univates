package br.univates.java.poo;

import java.util.Scanner;

public class NomeABNT {
    public static void main(String[] args) {

        /**
         * @date 18/02/2021
         *
         * Você está com necessidade de fazer uma grana extra
         * e resolveu escrever trabalhos nas normas da ABNT para os colegas.
         * Segundo a norma a bibliografia deve iniciar pelo nome do autor, porém em um formato especial ou seja, primeiro o sobrenome, uma vírgula e então as iniciais do nome seguidas de um ponto. Exemplo: Se o autor se chamar José Augusto Silva o sistema deve exibir SILVA, J. A. Faça um programa que recebe o nome do autor e depois exibe o nome no formato ABNT.
         */


        Scanner scanner = new Scanner(System.in);

        int x;
        String nomeCompleto;
        String[] nomeSeparado = new String[3];

        System.out.println("Digite seu nome completo:");
        nomeCompleto = scanner.next();

        nomeSeparado = nomeCompleto.split(" ");
        x = nomeSeparado.length;

        System.out.println(nomeSeparado);

        System.out.println(x);


    }
}
