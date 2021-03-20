package br.univates.java.poo.ex3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
public class Atleta {

    private String nome;
    private double[] tempo = new double[0];

    public void addTempo(double x) {
        double[] result = Arrays.copyOf(getTempo(), getTempo().length + 1);
        result[result.length - 1] = x;
        setTempo(result);
    }

    public double getMediaTempo() {
        int soma = 0;
        for (int i = 0; i < getTempo().length; i++) {
            soma += getTempo()[i];
        }
        return (double) soma / getTempo().length;
    }
    
    public double getMenorTempo() {
        double result = Double.POSITIVE_INFINITY;
        for (int i = 0; i < getTempo().length; i++) {
            if (getTempo()[i] < result) {
                result = getTempo()[i];
            }
        }
        return result;
    }

    public double getMaiorTempo() {
        double result = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < getTempo().length; i++) {
            if (getTempo()[i] > result) {
                result = getTempo()[i];
            }
        }
        return result;
    }

}
