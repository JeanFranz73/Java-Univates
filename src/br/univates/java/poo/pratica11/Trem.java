package br.univates.java.poo.pratica11;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Trem {
    /**
     * @date 08/04/2021
     * @author jean.franz
     **/

    private int odometro, numVagoes;
    private double combustivel;
    private Vagao[] vagoes;

    public Trem(int numVagoes) {
        this.numVagoes = numVagoes;
        this.odometro = 0;
        this.combustivel = 0;
        this.vagoes = new Vagao[25];

        for (int i = 0; i < numVagoes; i++) {
            getVagoes()[i] = new Vagao();
        }
    }

    public void addGasosa(int qtdeGasosa) {
        setCombustivel(getCombustivel() + qtdeGasosa);
    }

    public boolean consomeGasosa() {
        boolean result = false;
        if (getCombustivel() > 0 && (1.2 + (0.4 * getNumVagoes())) <= getCombustivel()) {
            setCombustivel(getCombustivel() - (1.2 + (0.4 * getNumVagoes())));
            result = true;
        }
        return result;
    }

    public boolean iniciaViagem(int km) {
        boolean result = false;
        if (km > 0) {
            while (true) {
                if (km == 0 || !consomeGasosa()) {
                    break;
                }
                odometro++;
                km--;
                result = true;
            }
        }
        return result;
    }

    public int getTotalPeso() {
        int result = 0;
        for (int i = 0; i < numVagoes; i++) {
            result += getVagoes()[i].getQtdeCarga();
        }
        return result;
    }
}
