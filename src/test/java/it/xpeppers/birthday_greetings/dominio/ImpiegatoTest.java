package it.xpeppers.birthday_greetings.dominio;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ImpiegatoTest {

    @Test
    public void controlla_se_compleanno_true() throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date dataOdierna = formatter.parse("2022/10/08");
        Date dataDiNascita = formatter.parse("1982/10/08");

        Impiegato impiegato = new Impiegato("Doe", "John", dataDiNascita, "john.doe@foobar.com");

        boolean isCompleanno = impiegato.isSuoCompleanno(dataOdierna);

        assertTrue(isCompleanno);
    }


}