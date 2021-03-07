package br.univates.java.poo.pratica4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Televisao {

    int canal = 1;
    int volume = 30;
    int limiteVolume = 100;
    boolean mudo = false;

    public void mudaVolume(int volume) {
        this.volume += volume;
    }

}
