package giorgiaipsaropassione.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "eventi")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Evento {
    @Id
    @GeneratedValue
    private long id;
    private String titolo;
    private LocalDate date;
    private String descrizione;
    private String tipoEvento;
    private int numeroMassimoPartecipanti;

    public Evento(String titolo, LocalDate date, String descrizione, String tipoEvento, int numeroMassimoPartecipanti) {
        super();
        this.titolo = titolo;
        this.date = date;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.setNumeroMassimoPartecipanti(numeroMassimoPartecipanti);
    }

    public Evento() {

    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Evento{");
        sb.append("id=").append(id);
        sb.append(", titolo='").append(titolo).append('\'');
        sb.append(", date=").append(date);
        sb.append(", descrizione='").append(descrizione).append('\'');
        sb.append(", tipoEvento='").append(tipoEvento).append('\'');
        sb.append(", numeroMassimoPartecipanti=").append(numeroMassimoPartecipanti);
        sb.append('}');
        return sb.toString();
    }
}
