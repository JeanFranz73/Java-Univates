package br.univates.java.poo.pratica16;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Scanner;

@Getter
@Setter
@AllArgsConstructor
public class Menu implements MenuInterface {
    /**
     * @date 27/04/2021
     * @author jean.franz
     **/
    Scanner scanner = new Scanner(System.in);
    private ArrayList<String> menuItens;

    @Override
    public void start() {

    }

    @Override
    public int getQtdeMenuItens() {
        return menuItens.size();
    }

    public ArrayList<String> getMenuItens() {
        return menuItens;
    }

    public void setMenuItens(ArrayList<String> menuItens) {
        this.menuItens = menuItens;
    }

    public void generateInfos() {
        menuItens.add("Carbonara");
        menuItens.add("Al pesto");
        menuItens.add("Com guizado");
    }
}
