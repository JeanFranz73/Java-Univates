package br.univates.java.poo.pratica3;

public class Triangulo {

    double a, b, c;

    public double calculaAreaTriangulo() {

        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
