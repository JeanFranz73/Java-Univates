package br.univates.java.poo.prova1.geladeira;

import java.util.Scanner;

public class TelaMenu {
    /**
     * @date 20/04/2021
     * @author jean.franz
     **/

    Scanner scanner = new Scanner(System.in);
    private Geladeira geladeira;
    int x, y;

    public void start() {
        while (true) {
            System.out.println("""
                    -------------------
                    Informe a capacidade da geladeira (em kg):""");

            x = scanInt();
            if (x > 0) {
                geladeira = new Geladeira(x);
                break;
            } else {
                System.out.println("""
                        -------------------
                        Valor inválido! tente novamente.""");
            }
        }
        while (true) {
            System.out.println("""
                    -------------------
                    Selecione o seu tipo de usuário:
                    1. Colaborador
                    2. Administrador
                    0. Finalizar programa""");
            x = scanInt();
            if (x == 1) {
                startColaborador();
            } else if (x == 2) {
                startAdmin();
            } else if (x == 0) {
                break;
            } else {
                System.out.println("""
                        -------------------
                        Opção inválida! Tente novamente.""");
            }
        }
    }

    public void startColaborador() {
        while (true) {
            System.out.println("""
                    -------------------
                    1. Doar alimento
                    2. Retirar alimento
                    0. Voltar à seleção de usuário""");
            x = scanInt();
            if (x == 1) {
                doarAlimento();
            } else if (x == 2) {
                retirarAlimento();
            } else if (x == 0) {
                break;
            }
        }
    }

    public void startAdmin() {
        while (true) {
            System.out.println("""
                    -------------------
                    1. Doar alimento
                    2. Retirar alimento
                    3. Status da geladeira
                    4. Realizar degelo e limpar a geladeira
                    0. Voltar à seleção de usuário""");
            x = scanInt();
            if (x == 1) {
                doarAlimento();
            } else if (x == 2) {
                retirarAlimento();
            } else if (x == 3) {
                verificaGeladeira();
            } else if (x == 4) {
                degelo();
            } else if (x == 0) {
                break;
            }
        }
    }

    public void doarAlimento() {
        while (true) {
            System.out.println("""
                    -------------------
                    Quanto de alimento você irá doar?
                    0 para cancelar""");
            x = scanInt();
            if (x <= 0) {
                break;
            }
            System.out.println("""
                    -------------------
                    Qual tipo de alimento você deseja doar?
                    1. Perecível
                    2. Não perecível""");
            y = scanInt();
            if (y == 1) {
                if (geladeira.addPereciveis(x)) {
                    System.out.println("""
                            -------------------
                            Alimento doado com sucesso!""");
                } else {
                    System.out.println("""
                            -------------------
                            Espaço insuficiente!""");
                }
                break;
            } else if (y == 2) {
                if (geladeira.addNaoPereciveis(x)) {
                    System.out.println("""
                            -------------------
                            Alimento doado com sucesso!""");
                } else {
                    System.out.println("""
                            -------------------
                            Espaço insuficiente!""");
                }
                break;
            } else {
                System.out.println("""
                        -------------------
                        Opção inválida! tente novamente.""");
            }
        }
    }

    public void retirarAlimento() {
        while (true) {
            System.out.println("""
                    -------------------
                    Quanto de alimento você irá retirar?
                    0 para cancelar""");
            x = scanInt();
            if (x <= 0) {
                break;
            }
            System.out.println("""
                    -------------------
                    Qual tipo de alimento você deseja retirar?
                    1. Perecível
                    2. Não perecível""");
            y = scanInt();
            if (y == 1) {
                if (geladeira.removePereciveis(x)) {
                    System.out.println("""
                            -------------------
                            Alimento retirado com sucesso!""");
                } else {
                    System.out.println("""
                            -------------------
                            Não há alimento suficiente para retirar!""");
                }
                break;
            } else if (x == 2) {
                if (geladeira.addPereciveis(x)) {
                    System.out.println("""
                            -------------------
                            Alimento retirado com sucesso!""");
                } else {
                    System.out.println("""
                            -------------------
                            Não há alimento suficiente para retirar!""");
                }
                break;
            } else {
                System.out.println("""
                        -------------------
                        Opção inválida! tente novamente.""");
            }
        }
    }

    public void verificaGeladeira() {
        System.out.println("-------------------");
        System.out.println("Quantidade total: " + geladeira.getQtdeAtual() + "kg / " + geladeira.getCapacidade() + "kg");
        System.out.println("Alimentos perecíveis: " + geladeira.getPereciveis() + "kg");
        System.out.println("Alimentos não perecíveis: " + geladeira.getNaoPereciveis() + "kg");
    }

    public void degelo() {
        geladeira.setPereciveis(0);
        geladeira.setNaoPereciveis(0);
        System.out.println("""
                -------------------
                Degelo realizado com sucesso!""");
    }

    public int scanInt() {
        // Método criado para evitar problemas do nextInt() ignorados
        int result;
        result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }
}
