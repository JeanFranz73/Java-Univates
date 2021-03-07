package br.univates.java.poo.pratica4;

import java.util.Scanner;

public class ProgramaData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Data data = new Data();

        while (true) {
            System.out.println("----------------");
            System.out.println("DATAS");
            System.out.println("1. Digitar uma data");
            System.out.println("2. Receber data atual");
            System.out.println("3. Receber data atual por escrito");
            System.out.println("0. Finalizar");

            int x = scanner.nextInt();

            if (x == 1) {
                System.out.println("Digite o dia:");
                int dia = scanner.nextInt();
                System.out.println("Agora, digite o mês:");
                int mes = scanner.nextInt();
                System.out.println("Por último, digite o ano:");
                int ano = scanner.nextInt();
                System.out.println(data.getCustomData(dia, mes, ano));
            } else if (x == 2) {
                System.out.println(data.getDataAtual());
            } else if (x == 3) {
                System.out.println(data.getDataCompletaAtual());
            } else if (x == 0) {
                break;
            }
        }
    }
}
