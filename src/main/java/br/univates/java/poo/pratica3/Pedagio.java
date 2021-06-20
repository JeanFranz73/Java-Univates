package br.univates.java.poo.pratica3;

public class Pedagio {

    double valor = 0;
    int motos = 0;
    int carros = 0;

    public void addMoto(){
        valor += 2.30;
        motos++;
    }

    public void addCarro(){
        valor += 4.60;
        carros++;
    }

}
