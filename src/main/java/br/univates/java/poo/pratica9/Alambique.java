package br.univates.java.poo.pratica9;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Alambique {

    private Reservatorio reservaCana;
    private Reservatorio reservaCachaca;
    private Reservatorio reservaIntermediario;

    private int garrafasCheias, numBateladas;
    private double tamanhoGarrafas;

    public Alambique(double limiteGarrafas) {
        this.reservaCana = new Reservatorio(100000);
        this.reservaCachaca = new Reservatorio(500000);
        this.reservaIntermediario = new Reservatorio(100000);
        this.tamanhoGarrafas = limiteGarrafas;
        this.garrafasCheias = 0;
    }

    public boolean iniciaProducao() {
        boolean result = false;
        while (true) {
            if (!reservaCana.removeQtde(1000) || !reservaCachaca.addQtde(400) || !reservaIntermediario.addQtde(200)) {
                break;
            }
            setNumBateladas(getNumBateladas() + 1);
            result = true;
        }
        return result;
    }

    public boolean encheGarrafas() {
        boolean result = false;
        while (reservaCachaca.getQuantidade() >= 750) {
            garrafasCheias++;
            reservaCachaca.setQuantidade(reservaCachaca.getQuantidade() - 750);
            result = true;
        }
        return result;
    }
}
