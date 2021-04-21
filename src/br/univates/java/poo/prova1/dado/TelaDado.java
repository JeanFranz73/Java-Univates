package br.univates.java.poo.prova1.dado;

import java.util.Scanner;

public class TelaDado {
    /**
     * @date 20/04/2021
     * @author jean.franz
     **/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dado dado = new Dado();
        while (true){
            scanner.nextLine();
            System.out.println("E o resultado é: " + dado.lancar() + "!");

            System.out.println("Total de lançamentos: " + dado.getLancamentos()[0]);
            for (int i = 1; i < dado.getLancamentos().length; i++) {
                System.out.println("Lançamentos de resultado " + i + ": '" + dado.getLancamentos()[i] + "'");
            }
        }
    }
}
