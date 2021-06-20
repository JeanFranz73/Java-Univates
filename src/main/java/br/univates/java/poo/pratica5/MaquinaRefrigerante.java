package br.univates.java.poo.pratica5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MaquinaRefrigerante {

    int xaropeCola = 100;
    int xaropeGuarana = 100;
    int xaropeLimao = 100;
    int limiteXarope = 300;
    int agua = 5000;
    int limiteAgua = 50000;
    int gas = 200;
    int limiteGas = 500;


    public boolean pegarRefri(int qtde, int sabor) {
        boolean ok = false;
        int tamanho = 0;

        if (qtde == 1) {
            tamanho = 5;
        } else if (qtde == 2) {
            tamanho = 7;
        } else if (qtde == 3) {
            tamanho = 10;
        }

        int aguaNecessaria = tamanho * 95;
        int xaropeNecessario = tamanho * 5;
        if (aguaNecessaria <= this.agua && tamanho <= this.gas) {
            this.agua -= aguaNecessaria;
            this.gas -= tamanho;

            if (sabor == 1 && xaropeNecessario <= this.xaropeCola) {
                this.xaropeCola -= xaropeNecessario;
                ok = true;
            } else if (sabor == 2 && xaropeNecessario <= this.xaropeGuarana) {
                this.xaropeGuarana -= xaropeNecessario;
                ok = true;
            } else if (sabor == 3 && xaropeNecessario <= this.xaropeLimao) {
                this.xaropeLimao -= xaropeNecessario;
                ok = true;
            }
        }
        return ok;
    }

    public void addIngrediente(int ingrediente, int val) {
        if (ingrediente == 1) {
            this.xaropeCola += val;
        }
        if (ingrediente == 2) {
            this.xaropeGuarana += val;
        }
        if (ingrediente == 3) {
            this.xaropeLimao += val;
        }
        if (ingrediente == 4) {
            this.agua += val;
        }
        if (ingrediente == 5) {
            this.gas += val;
        }
    }

    public int receberLimite(int ingrediente) {
        if (ingrediente == 1) return (this.xaropeCola + this.limiteXarope);
        else if (ingrediente == 2) return (this.xaropeGuarana + this.limiteXarope);
        else if (ingrediente == 3) return (this.xaropeLimao + this.limiteXarope);
        else if (ingrediente == 4) return (this.agua + this.limiteAgua);
        else if (ingrediente == 5) return (this.gas + this.limiteGas);
        else return 0;
    }
}
