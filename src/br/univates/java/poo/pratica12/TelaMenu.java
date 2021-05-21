package br.univates.java.poo.pratica12;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Scanner;

@Getter
@Setter
public class TelaMenu {
    /**
     * @date 11/04/2021
     * @author jean.franz
     **/

    private Scanner scanner = new Scanner(System.in);

    private ArrayList<Pedido> pedidos;

    private String menu = """
            --------------
            1. Adicionar pedido
            2. Preparar primeiro pedido
            3. Visualizar pedidos realizados
            0. Finalizar""";

    private String intErro = """
            --------------
            Valor inválido""";

    private int x;

    public TelaMenu() {
        this.pedidos = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.println(menu);
            x = scanInt();
            if (x == 1) {
                addPedido();
            } else if (x == 2) {
                prepararPedido();
            } else if (x == 3) {
                // verPedidos();
            } else if (x == 0) {
                break;
            } else {
                System.out.println(intErro);
            }
        }
    }

    public void addPedido() {
        Pedido pedido = new Pedido();
        boolean acao = true;
        pedido.setTipoPedido(selectTipoPedido());
        System.out.println("--------------\nDigite o nome do cliente:");
        pedido.setNomeCliente(scanner.nextLine());
        System.out.println("--------------\nAgora, digite o endereço do cliente:");
        pedido.setEnderecoCliente(scanner.nextLine());
        System.out.println("--------------\nPor último, digite o telefone do cliente (sem espaços ou caracteres especiais)");
        pedido.setTelefoneCliente(scanInt());

        pedidos.add(pedido);
        System.out.println("Pedido realizado!");
    }

    public String selectTipoPedido() {
        String result;

        while (true) {
            System.out.println("""
                    --------------
                    Por onde foi solicitado o pedido?
                    1. Site
                    2. App
                    3. Telefone""");

            x = scanInt();
            if (x == 1) {
                result = "Site";
                break;
            } else if (x == 2) {
                result = "App";
                break;
            } else if (x == 3) {
                result = "Telefone";
                break;
            } else {
                System.out.println(intErro);
            }

        }
        return result;
    }

    public Prato addPrato() {

        Prato prato = new Prato();

        prato.setNomePrato(selectNomePrato());
        System.out.println("Digite a quantidade desejada deste prato:");
        prato.setQtdePrato(scanInt());
        System.out.println("Alguma observação ao prato?");
        String obs = scanner.nextLine();
        if (obs.isBlank()) {
            obs = "Nenhuma";
        }
        prato.setObs(obs);


        return prato;
    }

    public String selectNomePrato() {
        String result;

        while (true) {
            System.out.println("""
                    --------------
                    Qual prato do cardápio será escolhido?
                    1. Pizza grande
                    2. Xis filé
                    3. Prato executivo
                    4. Ala minuta""");

            x = scanInt();
            if (x == 1) {
                result = "Pizza grande";
                break;
            } else if (x == 2) {
                result = "Xis filé";
                break;
            } else if (x == 3) {
                result = "Prato executivo";
                break;
            } else if (x == 4) {
                result = "Ala minuta";
                break;
            } else {
                System.out.println(intErro);
            }

        }
        return result;
    }

    public void prepararPedido() {
        pedidos.remove(0);
    }


    public int scanInt() {
        // Método criado para evitar problemas do nextInt() ignorados
        int result;
        result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }
}
