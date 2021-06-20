package br.univates.java.poo.pratica20;

import java.util.Scanner;

public class Menu {
    /**
     * @date 18/05/2021
     * @author jean.franz
     */

    Scanner scanner = new Scanner(System.in);

    public void show() {

        ColegaUtils arquivo = new ColegaUtils("C:\\alunos-poo-2021a.csv");

        arquivo.gerarColegas();
        System.out.println("Quantos alunos terão em cada grupo?");
        arquivo.gerarGrupos(scanner.nextInt());
        for (int i = 0; i < arquivo.getGruposColegas().size(); i++) {
            System.out.println("Grupo " + (i + 1));
            for (int j = 0; j < arquivo.getGruposColegas().get(i).size(); j++) {

                System.out.println("Nome: " + arquivo.getGruposColegas().get(i).get(j).getNome() + ",\ne-mail: " + arquivo.getGruposColegas().get(i).get(j).getEmail() + "\n--");
            }
            System.out.println("---------------------");
        }

        System.out.println("Total: " + arquivo.qtdeColegas() + " alunos");

    }
}
