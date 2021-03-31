package br.univates.java.poo.pratica10;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class TelaMenu {

    private Alambique alambique;

    public TelaMenu(Alambique alambique) {
        this.alambique = alambique;
    }

    public void show() {

        Scanner scanner = new Scanner(System.in);

        int x;
        boolean acao;

        String menu = """
                ----------------------
                1. Iniciar produção
                2. Adicionar caldo de cana
                3. Engarrafar cachaça pronta
                4. Limpar reservatório de resíduos
                5. Status atual do alambique
                0. Voltar à seleção de alambique""";

        while (true) {
            System.out.println(menu);
            x = scanner.nextInt();
            scanner.nextLine();
            if (x == 1) {
                if (getAlambique().iniciaProducao()) {
                    System.out.println("----------------------\nProdução completa!");
                } else {
                    System.out.println("----------------------\nVerifique o espaço nos reservatórios e a quantidade de caldo de cana disponível.");
                }
            } else if (x == 2) {
                acao = true;
                while (acao) {
                    System.out.println("----------------------\n[0] para voltar\nDigite a quantidade desejada:");
                    x = scanner.nextInt();
                    scanner.nextLine();
                    if (getAlambique().getReservaCana().addQtde(x * 1000)) {
                        System.out.println("----------------------\nCaldo adicionado!");
                        acao = false;
                    } else if (x == 0) {
                        acao = false;
                    } else {
                        System.out.println("----------------------\nValor indisponível! Adicione outro valor.");
                    }
                }
            } else if (x == 3) {
                if (getAlambique().encheGarrafas()) {
                    System.out.println("----------------------\nGarrafas preenchidas!");
                } else {
                    System.out.println("----------------------\nQuantidade insuficiente para encher uma garrafa!");
                }
            } else if (x == 4) {
                getAlambique().getReservaIntermediario().zeraQtde();
                System.out.println("----------------------\nReservatório de resíduos limpo!");
            } else if (x == 5) {
                System.out.println("----------------------");
                System.out.println("Reservatório de cana:           " + (getAlambique().getReservaCana().getQuantidade() / 1000) + "/" + (getAlambique().getReservaCana().getLimite() / 1000) + " litros");
                System.out.println("Reservatório de cachaça:        " + (getAlambique().getReservaCachaca().getQuantidade() / 1000) + "/" + (getAlambique().getReservaCachaca().getLimite() / 1000) + " litros");
                System.out.println("Reservatório intermediário:     " + (getAlambique().getReservaIntermediario().getQuantidade() / 1000) + "/" + (getAlambique().getReservaIntermediario().getLimite() / 1000) + " litros");
                System.out.println("Garrafas prontas para despacho: " + getAlambique().getGarrafasCheias());
                System.out.println("A máquina foi utilizada " + getAlambique().getNumBateladas() + " vezes");
            } else if (x == 0) {
                break;
            } else {
                System.out.println("Valor inválido!");
            }
        }
    }
}
