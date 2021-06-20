package br.univates.java.poo.pratica4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CaixaDAgua {

    public double consumo = 0;
    public double limite = 25000;

    public void addConsumo(double valor) {
        consumo += valor;
    }

    public void zeraContador() {
        consumo = 0;
    }
}
