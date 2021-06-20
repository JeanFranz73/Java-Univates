package br.univates.java.poo.pratica6;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Triangulo {

    private double ladoA, ladoB, ladoC;

    public double getPerimetro() {
        double result = 0;
        if (validaTriangulo()) {
            result = getLadoA() + getLadoB() + getLadoC();
        }
        return result;
    }

    public double getArea() {
        double result = 0;
        if (validaTriangulo()) {
            double p = getPerimetro() / 2;
            result = Math.sqrt(p * (p - getLadoA()) * (p - getLadoB()) * (p - getLadoC()));
        }
        return result;
    }

    public boolean validaTriangulo() {
        boolean result = false;
        if (getLadoA() < getLadoB() + getLadoC())
            if (getLadoB() < getLadoA() + getLadoC())
                if (getLadoC() < getLadoA() + getLadoB())
                    if (diferenca(getLadoA(), getLadoC()) <= diferenca(getLadoA(), getLadoB()) + diferenca(getLadoB(), getLadoC()))
                        result = true;
        return result;
    }

    public double diferenca(double x, double y) {
        return Math.max(x, y) - (Math.min(x, y));
    }
}
