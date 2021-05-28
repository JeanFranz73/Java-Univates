package br.univates.java.poo.pratica23;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Contato {
    /**
     * @date 27/05/2021
     * @author jean.franz
     **/

    private String nome;
    private String telefone;
    private String email;

    public String getContatoFormatado() {
        return nome + ";" + telefone + ";" + email;
    }
}
