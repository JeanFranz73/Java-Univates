package br.univates.java.poo.pratica11;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class TelaMenu {
    /**
     * @date 08/04/2021
     * @author jean.franz
     **/

    int x = 0, y = 0, z = 0, distanciaViagem;
    boolean acao;
    Scanner scanner = new Scanner(System.in);
    Trem trem;

    String menu = """
            --------------
            1. Iniciar viagem
            2. Definir distância de viagem
            3. Descarregar vagões
            4. Adicionar gasosa
            5. Status do trem
            0. Finalizar""";

    String qtdeErro = """
            --------------
            Quantidade insuficiente""";

    String erro = """
            --------------
            Opção inválida""";

    public void start() {
        System.out.println("Digite a quantidade de vagões que o trem possuirá (máx. 25 vagões):");
        while (true) {
            x = scanInt();
            if (x > 0 && x <= 25) {
                trem = new Trem(x);
                for (int i = 0; i < trem.getNumVagoes(); i++) {
                    System.out.print("--------------\nDigite o limite de carga do vagão " + (i + 1) + ": ");
                    trem.getVagoes()[i].setLimiteCarga(scanInt());
                    System.out.print("--------------\nAgora, digite a carga atual do vagão " + (i + 1) + ": ");
                    trem.getVagoes()[i].setQtdeCarga(scanInt());
                    System.out.println("--------------\nPor último, digite o tipo de carga do vagão " + (i + 1) + ": ");
                    acao = true;
                    while (acao) {
                        acao = false;
                        System.out.println("""
                                --------------
                                1. Grãos
                                2. Minério
                                3. Manufaturados""");

                        x = scanInt();

                        if (x == 1) {
                            trem.getVagoes()[i].setTipoCarga("Grãos");
                        } else if (x == 2) {
                            trem.getVagoes()[i].setTipoCarga("Minério");
                        } else if (x == 3) {
                            trem.getVagoes()[i].setTipoCarga("Manufaturados");
                        } else {
                            System.out.println(erro);
                            acao = true;
                        }
                    }
                }
                menu();
            } else {
                System.out.println(qtdeErro);
            }
        }
    }

    public void menu() {
        while (true) {
            System.out.println(menu);
            x = scanInt();
            acao = true;
            if (x == 1) {
                if (distanciaViagem > 0 && trem.iniciaViagem(distanciaViagem)) {
                    System.out.println("--------------\nViagem realizada com sucesso!");
                } else if (distanciaViagem <= 0) {
                    System.out.println("--------------\nDistância não definida corretamente");
                }
            } else if (x == 2) {
                acao = true;
                while (acao) {
                    System.out.println("--------------\nDefina a distância a ser percorrida");
                    setDistanciaViagem(scanInt());
                    if (getDistanciaViagem() > 0) {
                        acao = false;
                    }
                }
            } else if (x == 3) {
                for (int i = 0; i < trem.getNumVagoes(); i++) {
                    trem.getVagoes()[i].descarregarCarga();
                }
                System.out.println("--------------\nVagões descarregados com sucesso!");
            } else if (x == 4) {
                acao = true;
                while (acao) {
                    System.out.println("--------------\nDigite a quantidade de gasolina a ser adicionada:");
                    x = scanInt();
                    if (x > 0) {
                        trem.addGasosa(x);
                        System.out.println("--------------\nCombustível adicionado!");
                        acao = false;
                    }
                }
            } else if (x == 5) {
                statusTrem();
            } else if (x == 0) {
                break;
            }
        }
    }

    public int scanInt() {
        int result;
        while (true) {
            result = scanner.nextInt();
            scanner.nextLine();
            if (result < 0) {
                System.out.println(qtdeErro);
            }
            return result;
        }
    }

    public void statusTrem() {
        for (int i = 0; i < trem.getNumVagoes(); i++) {
            System.out.println("--------------");
            System.out.println("Vagão " + (i + 1));
            System.out.println("Carga: " + trem.getVagoes()[i].getQtdeCarga() + "kg");
            System.out.println("Limite: " + trem.getVagoes()[i].getLimiteCarga() + "kg");
            System.out.println("Tipo: " + trem.getVagoes()[i].getTipoCarga());
        }
        System.out.println("--------------");
        System.out.println("Combustível: " + trem.getCombustivel() + " litros");
        System.out.println("Número de vagões: " + trem.getNumVagoes());
        System.out.println("Odômetro: " + trem.getOdometro() + "km");
        System.out.println("Peso total em transporte: " + trem.getTotalPeso() + "kg");
    }
}
