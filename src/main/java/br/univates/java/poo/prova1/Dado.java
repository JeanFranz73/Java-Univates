package br.univates.java.poo.prova1.dado;

public class Dado {
    /**
     * @date 20/04/2021
     * @author jean.franz
     * <p>
     * O total de lançamentos é salvo no primeiro valor do vetor (valor 0),
     * enquanto os outros valores são adicionados em seus respectivos números
     * (lançamentos de número 1 na coord 1, número 2 na coord 2...)
     **/

    private int[] lancamentos;

    public Dado() {
        this.lancamentos = new int[7];
    }

    public int lancar() {
        int result;
        result = (int) (Math.random() * 6) + 1;
        getLancamentos()[0]++;
        getLancamentos()[result]++;
        return result;
    }

    public int[] getLancamentos() {
        return lancamentos;
    }

    public int getLancDeterminadoNumero(int numero) { // Recebe a quantidade de lançamentos de um determinado número
        return getLancamentos()[numero];
    }

}
