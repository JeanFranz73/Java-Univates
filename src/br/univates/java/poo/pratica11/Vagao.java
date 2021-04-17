package br.univates.java.poo.pratica11;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vagao {
    /**
     * @date 08/04/2021
     * @author jean.franz
     **/

    private int limiteCarga, qtdeCarga;
    private String tipoCarga;

    public Vagao(){}

    public Vagao(int limiteCarga, int qtdeCarga, String tipoCarga) {
        this.limiteCarga = limiteCarga;
        this.qtdeCarga = qtdeCarga;
        this.tipoCarga = tipoCarga;
    }

    public void addCarga(int qtdeCarga) {
        this.qtdeCarga += qtdeCarga;
    }

    public void descarregarCarga() {
        setQtdeCarga(0);
    }

}