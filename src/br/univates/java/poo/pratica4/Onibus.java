package br.univates.java.poo.pratica4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Onibus {

    double registro = 0;
    double passagem = 2.50;
    int passageiros = 0;
    int totalPassageiros = 0;
    int diferencaPassageiros = 0;
    int capacidade = 80;
    int paradas = 0;

    public void addPassageiros(int passageiros) {
        diferencaPassageiros = 0;
        if (passageiros > 0) {
            this.totalPassageiros += passageiros;
            diferencaPassageiros = passageiros;
        }
        if (passageiros != 0) {
            this.paradas++;
        }

        this.passageiros += passageiros;
    }

    public double caixaExpediente() {
        return this.totalPassageiros * this.passagem;
    }
}
