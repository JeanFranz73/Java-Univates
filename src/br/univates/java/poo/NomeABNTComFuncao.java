package br.univates.java.poo;

import java.util.Scanner;

public class NomeABNTComFuncao {
    public static void main(String[] args) {

        /**
         * @date 23/02/2021
         *
         * Questão 4.
         * Você está com necessidade de fazer uma grana extra
         * e resolveu escrever trabalhos nas normas da ABNT
         * para os colegas. Segundo a norma a bibliografia
         * deve iniciar pelo nome do autor, porém em um formato especial
         * ou seja, primeiro o sobrenome, uma vírgula e então
         * as iniciais do nome seguidas de um ponto.
         * Exemplo: Se o autor se chamar José Augusto Silva
         * o sistema deve exibir SILVA, J. A.
         * Faça um programa que recebe o nome do autor e depois exibe
         * o nome no formato ABNT. Esse programa deve conter um módulo
         * que receba o nome e devolva o nome formatado.
         */

        Scanner scanner = new Scanner(System.in);

        String nomeCompleto;

        System.out.println("Digite seu nome completo:");
        nomeCompleto = scanner.nextLine();

        System.out.println(formataABNT(nomeCompleto));
    }

    public static String formataABNT(String nome) {
        String retorno = "";

        String[] nomeSeparado = nome.split(" ");

        retorno += (nomeSeparado[nomeSeparado.length - 1].toUpperCase() + ", ");

        for (int i = 0; i < nomeSeparado.length - 1; i++) {
            String letra = (nomeSeparado[i].toUpperCase().charAt(0) + ". ");
            retorno += letra;
        }

        return retorno;
    }
}
