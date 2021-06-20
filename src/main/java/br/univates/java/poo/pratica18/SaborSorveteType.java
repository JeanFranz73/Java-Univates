package br.univates.java.poo.pratica18;

import lombok.Getter;

@Getter
public enum SaborSorveteType {

    CHOCOLATE(1, "Chocolate"),
    MORANGO(2, "Morango");

    Integer id;
    String nomeSabor;

    SaborSorveteType(Integer id, String nomeSabor) {
        this.id = id;
        this.nomeSabor = nomeSabor;
    }
}
