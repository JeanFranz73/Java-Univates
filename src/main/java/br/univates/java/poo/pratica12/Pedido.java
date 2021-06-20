package br.univates.java.poo.pratica12;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Pedido {
    /**
     * @date 11/04/2021
     * @author jean.franz
     **/

    private String tipoPedido, nomeCliente, enderecoCliente;
    private ArrayList<Prato> pratos;
    private int telefoneCliente;

    public void addPrato(String nomePrato, int qntd, String obs) {

        Prato prato = new Prato();

        prato.setNomePrato(nomePrato);
        prato.setQtdePrato(qntd);
        prato.setObs(obs);
        pratos.add(prato);
    }
}
