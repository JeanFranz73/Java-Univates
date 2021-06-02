package br.univates.java.poo.pratica23;

import br.univates.pedro.menu2.Menu;
import br.univates.pedro.menu2.MenuItem;
import br.univates.pedro.menu2.MenuProcesso;

import java.util.ArrayList;
import java.util.Scanner;

public class Tela {
    /**
     * @date 18/05/2021
     * @author jean.franz
     */

    Scanner scanner = new Scanner(System.in);

    public void show() {
        Menu menu = new Menu();
        menu.addItem(new MenuItem('1', "Listar contatos", new ListarContatos()));
        menu.addItem(new MenuItem('2', "Adicionar contato", new AdicionarContato()));
        menu.addItem(new MenuItem('3', "Editar contato", new EditarContato()));
        menu.addItem(new MenuItem('4', "Excluir contato", new ExcluirContato()));
        menu.gerar();
    }

    public class ListarContatos implements MenuProcesso {

        @Override
        public void executar() {
            ContatoDAO dao = new ContatoDAO();
            ArrayList<Contato> contatos = dao.ler();
            int id = 0;
            for (Contato c : contatos) {
                id++;

                System.out.println(id + ". Nome: " + c.getNome() + ", telefone: " + c.getTelefone() + ", e-mail: " + c.getEmail());
            }
            System.out.println("-------------");
        }
    }

    public class AdicionarContato implements MenuProcesso {

        Scanner scanner = new Scanner(System.in);

        @Override
        public void executar() {
            ContatoDAO dao = new ContatoDAO();
            System.out.print("Nome do contato: ");
            String nome = scanner.nextLine();
            System.out.print("Telefone do contato: ");
            String tel = scanner.nextLine();
            System.out.print("Email do contato: ");
            String email = scanner.nextLine();
            if (dao.salvar(new Contato(nome, tel, email))) {
                System.out.println("Contato salvo!");
            } else {
                System.out.println("Erro ao salvar, por favor tente novamente.");
            }
            System.out.println("-------------");
        }
    }

    public class EditarContato implements MenuProcesso {

        Scanner scanner = new Scanner(System.in);
        String info;
        int id, opc;

        @Override
        public void executar() {
            ContatoDAO dao = new ContatoDAO();
            System.out.println("Digite o ID do contato:");
            id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qual a informação que deseja alterar?");
            System.out.println("1. Nome");
            System.out.println("2. Telefone");
            System.out.println("3. Email");
            while (true) {
                opc = scanner.nextInt();
                scanner.nextLine();
                if (dao.isOpcaoValida(opc)) {
                    break;
                } else {
                    System.out.println("Opção inválida, tente novamente.");
                }
            }
            System.out.print("Novo valor do campo: ");
            info = scanner.nextLine();
            if (dao.editar(id, opc, info)) {
                System.out.println("Contato editado com sucesso!");
            } else {
                System.out.println("Erro ao editar, por favor tente novamente.");
            }
            System.out.println("-------------");
        }
    }

    public class ExcluirContato implements MenuProcesso {
        @Override
        public void executar() {
            ContatoDAO dao = new ContatoDAO();
            System.out.println("Digite o ID do contato a ser excluído: ");
            if (dao.excluir(Integer.parseInt(scanner.nextLine()))) {
                System.out.println("Contato deletado com sucesso!");
            } else {
                System.out.println("Erro ao excluir, por favor tente novamente.");
            }
        }
    }
}
