package br.univates.java.poo.pratica20;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class GrupoColegas {
    /**
     * @date 20/05/2021
     * @author jean.franz
     **/

    ArrayList<Colega> colegas;

    public GrupoColegas() {
        this.colegas = new ArrayList<Colega>();
    }
}
