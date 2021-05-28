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
        menu.gerar();
    }

    public class ListarContatos implements MenuProcesso {

        @Override
        public void executar() {
            ContatoDAO dao = new ContatoDAO();
            ArrayList<Contato> contatos = dao.ler();
            for (Contato c : contatos) {
                System.out.println("Nome: " + c.getNome() + ", telefone: " + c.getTelefone() + ", e-mail: " + c.getEmail());
            }
            System.out.println("-------------");
        }
    }

    public class AdicionarContato implements MenuProcesso {

        Scanner scanner = new Scanner(System.in);

        @Override
        public void executar() {
            ContatoDAO dao = new ContatoDAO();
            System.out.print("Nome do contato:");
            String nome = scanner.nextLine();
            System.out.print("Telefone do contato:");
            String tel = scanner.nextLine();
            System.out.print("Email do contato:");
            String email = scanner.nextLine();
            if (dao.salvar(new Contato(nome, tel, email))) {
                System.out.println("Contato salvo!");
            } else {
                System.out.println("Erro ao salvar, por favor tente novamente.");
            }
            System.out.println("-------------");
        }
    }
}
