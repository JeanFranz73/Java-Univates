package br.univates.java.poo.pratica8;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CasaShows {

    private int pessoas, capacidade;
    double valor;

    public CasaShows(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean addEles(int qtde) {
        boolean result = false;
        if (qtde > 0 && getPessoas() + qtde <= getCapacidade()) {
            setPessoas(getPessoas() + qtde);
            setValor(getValor() + (qtde * 55));
            result = true;
        }
        return result;
    }

    public boolean addElas(int qtde) {
        boolean result = false;
        if (qtde > 0 && getPessoas() + qtde <= getCapacidade()) {
            setPessoas(getPessoas() + qtde);
            setValor(getValor() + (qtde * 40));
            result = true;
        }
        return result;
    }

    public boolean sair(int qtde) {
        boolean result = false;
        if (qtde > 0 && getPessoas() + qtde <= getCapacidade() && getPessoas() + qtde >= 0) {
            setPessoas(getPessoas() - qtde);
        }
        return result;
    }

    public int getTotal() {
        return getCapacidade() + getPessoas();
    }
}
