package br.univates.java.poo.pratica4;

import java.util.Scanner;

public class ProgramaOnibus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Onibus onibus = new Onibus();

        while (true) {

            System.out.println("Insira a movimentação de passageiros na parada (0 para finalizar)");

            int x = scanner.nextInt();

            onibus.addPassageiros(x);

            if (x != 0) {
                if (onibus.getPassageiros() > onibus.getCapacidade()) {
                    System.out.println("Limite máximo é de: " + onibus.getCapacidade() + "pessoas");
                    onibus.setPassageiros(onibus.getCapacidade());
                } else if (onibus.getPassageiros() < 0) {
                    System.out.println("Impossivel sair mais pessoas do que entraram");
                    onibus.setPassageiros(0);
                }
                System.out.println("Passageiros: " + onibus.getPassageiros());
                System.out.println("Total Passageiros: " + onibus.getTotalPassageiros());
                System.out.println("Lugares vagos: " + (onibus.getCapacidade() - onibus.getPassageiros()));
            } else {
                System.out.print("Total: ");
                System.out.printf("%.2f", onibus.caixaExpediente());
                System.out.print(" reais em " + onibus.getParadas() + " paradas com o total de " + onibus.getTotalPassageiros() + " passageiros.");
                break;
            }
        }
    }
}