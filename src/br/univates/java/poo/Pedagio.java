package br.univates.java.poo;

import java.util.Scanner;

public class Pedagio {
    public static void main(String[] args) {

        /**
         * @date 18/02/2021
         *
         * Questão 6.
         * Novos pedágios foram inaugurados na BR 386.
         * Crie um sistema para computar o tráfego.
         * Quando um veículo chega na cancela, o operador
         * vai digitar 1 para automóveis, 2 para motos,
         * 3 para finalizar o expediente. Ao final do expediente
         * o sistema deve exibir quantos carros passaram,
         * quantas motos passaram e quanto dinheiro foi arrecadado.
         * R$ 4,60 carro. R$ 2,30 moto.
         */

        Scanner scanner = new Scanner(System.in);

        int x;
        int qtyMotos = 0;
        int qtyCarros = 0;
        double total = 0;
        boolean i = false;

        while (!i) {
            System.out.println("Digite o número correspondente ao veículo:");
            x = scanner.nextInt();

            if (x == 1) {
                total += 4.6;
                qtyCarros++;
                System.out.println("Automóvel computado!");
            } else if (x == 2) {
                total += 2.3;
                qtyMotos++;
                System.out.println("Motocicleta computada!");
            } else if (x == 3) {
                System.out.println("Total de automóveis: " + qtyCarros);
                System.out.println("Total de motos: " + qtyMotos);
                System.out.print("Valor total: R$");
                System.out.printf("%.2f", total);
                i = true;
            } else {
                System.out.println("Valor inválido! Digite novamente.");
                System.out.println();
            }
        }
    }
}
