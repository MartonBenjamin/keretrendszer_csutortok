package filmespelda.model;

import filmespelda.Exceptions.Unborn;

import java.time.LocalDate;
import java.util.UUID;

public class Ember {
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    private String vezeteknev;
    private String keresztnev;
    private LocalDate szuletesi_datum;

    public Ember(String vezeteknev, String keresztnev, LocalDate szuletesi_datum) throws Unborn {
        this.id = UUID.randomUUID();
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
        setSzuletesi_datum(szuletesi_datum);
    }

    public Ember() {
        this.id = UUID.randomUUID();
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public void setVezeteknev(String vezeteknev) {
        this.vezeteknev = vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public void setKeresztnev(String keresztnev) {
        this.keresztnev = keresztnev;
    }

    public LocalDate getSzuletesi_datum() {
        return szuletesi_datum;
    }

    public void setSzuletesi_datum(LocalDate szuletesi_datum) throws Unborn {
        if (!szuletesi_datum.isBefore(LocalDate.now()))
            throw new Unborn(szuletesi_datum.toString());
        this.szuletesi_datum = szuletesi_datum;

    }
}
