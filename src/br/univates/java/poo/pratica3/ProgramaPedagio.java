package br.univates.java.poo.pratica3;

import java.util.Scanner;

public class ProgramaPedagio {

    public static void main(String[] args) {

        boolean repetir = true;
        Scanner scanner = new Scanner(System.in);
        Pedagio pedagio = new Pedagio();

        while (repetir) {
            System.out.println("Digite o número correspondente ao veículo:");
            System.out.println("1. Automóveis");
            System.out.println("2. Motos");
            System.out.println("3. Finalizar expediente");
            int x = scanner.nextInt();

            if (x == 1) {
                pedagio.addCarro();
            } else if (x == 2) {
                pedagio.addMoto();
            } else if (x == 3) {
                repetir = false;
            } else {
                System.out.println("Comando inválido! Tente novamente.");
            }
        }
        System.out.println("Passaram " + pedagio.carros + " carros e " + pedagio.motos + " motos.");
        System.out.print("Valor total: R$");
        System.out.printf("%.2f", pedagio.valor);
    }
}
