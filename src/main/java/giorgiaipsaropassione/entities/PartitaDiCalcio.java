package giorgiaipsaropassione.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "partite_di_calcio")
@NamedQuery(name = "PartitaDiCalcio.getPartiteVinteInCasa", query = "SELECT p FROM PartitaDiCalcio p WHERE p.sqCasa = p.sqVincente")
@NamedQuery(name = "PartitaDiCalcio.getPartiteVinteInTrasferta", query = "SELECT p FROM PartitaDiCalcio p WHERE p.sqOspite = p.sqVincente")
@NamedQuery(name = "PartitaDiCalcio.getPartitePareggiate", query = "SELECT p FROM PartitaDiCalcio p WHERE p.sqVincente = null")
public class PartitaDiCalcio extends Evento {
    private String sqCasa;
    private String sqOspite;
    private String sqVincente;
    private int golSqCasa;
    private int golSqOspite;

    public PartitaDiCalcio(String titolo, LocalDate date, String descrizione, String tipoEvento,
                           int numeroMassimoPartecipanti, String sqCasa, String sqOspite, String sqVincente, int golSqCasa,
                           int golSqOspite) {
        super(titolo, date, descrizione, tipoEvento, numeroMassimoPartecipanti);
        this.sqCasa = sqCasa;
        this.sqOspite = sqOspite;
        this.sqVincente = sqVincente;
        this.golSqCasa = golSqCasa;
        this.golSqOspite = golSqOspite;
    }

    public String getSqCasa() {
        return sqCasa;
    }

    public void setSqCasa(String sqCasa) {
        this.sqCasa = sqCasa;
    }

    public String getSqOspite() {
        return sqOspite;
    }

    public void setSqOspite(String sqOspite) {
        this.sqOspite = sqOspite;
    }

    public String getSqVincente() {
        return sqVincente;
    }

    public void setSqVincente(String sqVincente) {
        this.sqVincente = sqVincente;
    }

    public int getGolSqCasa() {
        return golSqCasa;
    }

    public void setGolSqCasa(int golSqCasa) {
        this.golSqCasa = golSqCasa;
    }

    public int getGolSqOspite() {
        return golSqOspite;
    }

    public void setGolSqOspite(int golSqOspite) {
        this.golSqOspite = golSqOspite;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PartitaDiCalcio{");
        sb.append("sqCasa='").append(sqCasa).append('\'');
        sb.append(", sqOspite='").append(sqOspite).append('\'');
        sb.append(", sqVincente='").append(sqVincente).append('\'');
        sb.append(", golSqCasa=").append(golSqCasa);
        sb.append(", golSqOspite=").append(golSqOspite);
        sb.append('}');
        return sb.toString();
    }
}