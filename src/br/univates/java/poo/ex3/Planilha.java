package br.univates.java.poo.ex3;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Planilha {

    private Atleta[] atleta;

    public Planilha() {
        this.atleta = new Atleta[15];
        for (int i = 0; i < atleta.length; i++) {
            atleta[i] = new Atleta();
        }
    }

    public double getMediaTempoAtletas() {
        double soma = 0;
        for (int i = 0; i < atleta.length; i++) {
            soma += atleta[i].getMediaTempo();
        }
        return soma / atleta.length;
    }

    public double getMenorTempoTodos() {
        double result = Double.POSITIVE_INFINITY;
        for (int i = 0; i < atleta.length; i++) {
            for (int j = 0; j < atleta[i].getTempo().length; j++) {
                if (atleta[i].getTempo()[j] < result) {
                    result = atleta[i].getTempo()[j];
                }
            }
        }
        return result;
    }

    public double getMaiorTempoTodos() {
        double result = Double.NEGATIVE_INFINITY;
        Atleta atletaResult;
        for (int i = 0; i < atleta.length; i++) {
            for (int j = 0; j < atleta[i].getTempo().length; j++) {
                if (atleta[i].getTempo()[j] > result) {
                    result = atleta[i].getTempo()[j];
                }
            }
        }
        return result;
    }

    public Atleta[] getAtletasComMenosDe10() {
        Atleta[] result = new Atleta[0];
        for (int i = 0; i < atleta.length; i++) {
            for (int j = 0; j < atleta[i].getTempo().length; j++) {
                if (atleta[i].getTempo()[j] < 10 && checkDuplicate(result, atleta[i])) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = atleta[i];
                }
            }
        }
        return result;
    }

    public boolean checkDuplicate(Atleta[] atletas, Atleta atleta) {
        boolean result = true;
        for (int i = 0; i < atletas.length; i++) {
            if (atletas[i] == atleta) {
                result = false;
            }
        }
        return result;
    }
}
