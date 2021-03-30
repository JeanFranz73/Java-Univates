package br.univates.java.poo.pratica10;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reservatorio {

    private double quantidade, limite;

    public Reservatorio(double limite) {
        this.quantidade = 0;
        this.limite = limite;
    }

    public void zeraQtde() {
        setQuantidade(0);
    }

    public boolean addQtde(double qtde) {
        boolean result = false;
        if (qtde > 0 && getQuantidade() + qtde <= getLimite()) {
            setQuantidade(getQuantidade() + qtde);
            result = true;
        }
        return result;
    }

    public boolean removeQtde(double qtde) {
        boolean result = false;
        if (qtde > 0 && getQuantidade() - qtde >= 0) {
            setQuantidade(getQuantidade() - qtde);
            result = true;
        }
        return result;
    }
}
