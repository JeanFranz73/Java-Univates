package br.univates.java.poo.pratica4;

import lombok.Getter;
import lombok.Setter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


@Getter
@Setter
public class Data {

    SimpleDateFormat formatoSimples = new SimpleDateFormat("dd/MM/yyyy");
    DateFormat formatoCompleto = DateFormat.getDateInstance(DateFormat.FULL);
    Calendar calendario = Calendar.getInstance();
    Date data = calendario.getTime();

    public String getCustomData(int dia, int mes, int ano) {
        Calendar customCalendario = Calendar.getInstance();
        customCalendario.set(ano, mes - 1, dia);
        Date data = customCalendario.getTime();
        return formatoSimples.format(data);
    }

    public String getDataAtual() {
        return formatoSimples.format(data);
    }

    public String getDataCompletaAtual() {
        return formatoCompleto.format(data);
    }
}
