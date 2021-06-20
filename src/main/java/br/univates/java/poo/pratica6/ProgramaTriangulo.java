package br.univates.java.poo.pratica6;

public class ProgramaTriangulo {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(26, 26, 20);

        System.out.println("Perímetro: " + triangulo.getPerimetro());
        System.out.println("Área: " + triangulo.getArea());
    }
}
