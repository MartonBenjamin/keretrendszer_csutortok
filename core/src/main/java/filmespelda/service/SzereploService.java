package filmespelda.service;

import filmespelda.Exceptions.NoMatchingId;
import filmespelda.Exceptions.Unborn;
import filmespelda.model.Szereplo;
import org.omg.DynamicAny.DynAnyPackage.InvalidValue;

import java.time.LocalDate;
import java.util.Collection;
import java.util.UUID;

public interface SzereploService {
    public Collection<Szereplo> listAllSzereplo();

    public Szereplo getSzereplo(UUID id) throws NoMatchingId;

    public void addSzereplo(Szereplo szereplo) throws Unborn, InvalidValue;

    public void updateSzereplo(Szereplo szereplo) throws Unborn, InvalidValue;

    public void deleteSzereplo(UUID id) throws NoMatchingId;

    public void deleteSzereplo(Szereplo szereplo);
}
