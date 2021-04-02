package br.univates.java.poo.pratica10;

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

    public Alambique(double limiteCana, double limiteCachaca, double limiteInterm, double limiteGarrafas) {
        this.reservaCana = new Reservatorio(limiteCana);
        this.reservaCachaca = new Reservatorio(limiteCachaca);
        this.reservaIntermediario = new Reservatorio(limiteInterm);
        this.tamanhoGarrafas = limiteGarrafas;
        this.garrafasCheias = 0;
    }

    public boolean iniciaProducao() {
        boolean result = false;
        while (true) {
            if (!reservaCana.removeQtde(1000) || !reservaCachaca.addQtde(400) || !reservaIntermediario.addQtde(200)) {
                break;
            }
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
