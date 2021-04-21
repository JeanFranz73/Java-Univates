package br.univates.java.poo.prova1.geladeira;

public class Geladeira {
    /**
     * @date 20/04/2021
     * @author jean.franz
     **/

    private int pereciveis;
    private int naoPereciveis;
    private int capacidade;

    public Geladeira(int capacidade) {
        this.pereciveis = 0;
        this.naoPereciveis = 0;
        this.capacidade = capacidade;
    }

    public int getPereciveis() {
        return pereciveis;
    }

    public void setPereciveis(int pereciveis) {
        this.pereciveis = pereciveis;
    }

    public boolean addPereciveis(int qtde) {
        boolean result = false;
        if (qtde > 0 && getQtdeAtual() + qtde <= getCapacidade()) {
            setPereciveis(getPereciveis() + qtde);
            result = true;
        }
        return result;
    }

    public boolean removePereciveis(int qtde) {
        boolean result = false;
        if (getPereciveis() > 0 && getPereciveis() - qtde >= 0) {
            setPereciveis(getPereciveis() - qtde);
            result = true;
        }
        return result;
    }

    public int getNaoPereciveis() {
        return naoPereciveis;
    }

    public void setNaoPereciveis(int naoPereciveis) {
        this.naoPereciveis = naoPereciveis;
    }

    public boolean addNaoPereciveis(int qtde) {
        boolean result = false;
        if (qtde > 0 && getQtdeAtual() + qtde <= getCapacidade()) {
            setNaoPereciveis(getNaoPereciveis() + qtde);
            result = true;
        }
        return result;
    }

    public boolean removeNaoPereciveis(int qtde) {
        boolean result = false;
        if (getNaoPereciveis() > 0 && getNaoPereciveis() - qtde >= 0) {
            setNaoPereciveis(getNaoPereciveis() - qtde);
            result = true;
        }
        return result;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdeAtual() {
        return getPereciveis() + getNaoPereciveis();
    }
}
