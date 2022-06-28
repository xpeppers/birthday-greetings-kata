package it.xpeppers.birthday_greetings.dominio;

import java.util.Calendar;
import java.util.Date;

public class Impiegato {
    private final Date dataNascita;

    public Impiegato(String cognome, String nome, Date dataNascita, String mail) {
        this.dataNascita = dataNascita;
    }

    public boolean isSuoCompleanno(Date dataOdierna) {

        Calendar dataOdiernaCalendar = Calendar.getInstance();
        dataOdiernaCalendar.setTime(dataOdierna);
        int dataOdiernaMese = dataOdiernaCalendar.get(Calendar.MONTH);
        int dataOdiernaGiorno = dataOdiernaCalendar.get(Calendar.DAY_OF_MONTH);

        Calendar dataNascitaCalendar = Calendar.getInstance();
        dataNascitaCalendar.setTime(this.dataNascita);
        int dataNascitaMese = dataNascitaCalendar.get(Calendar.MONTH);
        int dataNascitaGiorno = dataNascitaCalendar.get(Calendar.DAY_OF_MONTH);

        return (dataOdiernaMese == dataNascitaMese) && (dataOdiernaGiorno == dataNascitaGiorno);
    }


}
