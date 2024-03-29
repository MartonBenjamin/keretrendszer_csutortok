package filmespelda.model;

import filmespelda.Exceptions.Unborn;
import org.omg.CORBA.DynAnyPackage.InvalidValue;

import java.time.LocalDate;

public class Rendezo extends Ember {
    private int filmek_szama;

    public Rendezo(String vezeteknev, String keresztnev, LocalDate szuletesi_datum, int filmek_szama) throws Unborn, InvalidValue {
        super(vezeteknev, keresztnev, szuletesi_datum);
        setFilmek_szama(filmek_szama);
    }

    public Rendezo() {

    }

    public int getFilmek_szama() {
        return filmek_szama;
    }

    public void setFilmek_szama(int filmek_szama) throws InvalidValue {
        if(filmek_szama<1)
            throw new InvalidValue();
        this.filmek_szama = filmek_szama;
    }
}
