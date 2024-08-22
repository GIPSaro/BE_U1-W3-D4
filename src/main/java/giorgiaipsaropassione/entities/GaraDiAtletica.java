package giorgiaipsaropassione.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "gara_di_atletica")

@NamedQuery(name = "GaraDiAtletica.getGareDiAtleticaPerVincitore", query = "SELECT g FROM GaraDiAtletica g WHERE g.vincitore = :vincitore")
public class GaraDiAtletica extends Evento {
    private String setAtleti;
    @OneToOne
    private Persona vincitore;

    public GaraDiAtletica(String titolo, LocalDate date, String descrizione, String tipoEvento,
                          int numeroMassimoPartecipanti, String setAtleti, Persona vincitore) {
        super(titolo, date, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.setAtleti = setAtleti;
        this.vincitore = vincitore;
    }

    public GaraDiAtletica(String titolo, LocalDate date, String descrizione, String tipoEvento,
                          int numeroMassimoPartecipanti, String setAtleti) {
        super(titolo, date, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.setAtleti = setAtleti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }

    public String getSetAtleti() {
        return setAtleti;
    }

    public void setSetAtleti(String setAtleti) {
        this.setAtleti = setAtleti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GaraDiAtletica{");
        sb.append("setAtleti='").append(setAtleti).append('\'');
        sb.append(", vincitore=").append(vincitore);
        sb.append('}');
        return sb.toString();
    }


}