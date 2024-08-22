package giorgiaipsaropassione.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Concerto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titolo;
    private LocalDate data;
    private String descrizione;
    private String tipoEvento;
    private int numeroMassimoPartecipanti;
    private GenereConcerto genere;
    private boolean accessibileDisabili;

    @ManyToOne
    private Location location;

    // Costruttore, getter e setter
    public Concerto(String titolo, LocalDate data, String descrizione, String tipoEvento,
                    int numeroMassimoPartecipanti, GenereConcerto genere, boolean accessibileDisabili, Location location) {
        this.titolo = titolo;
        this.data = data;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        this.genere = genere;
        this.accessibileDisabili = accessibileDisabili;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    // altri getter e setter

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public GenereConcerto getGenere() {
        return genere;
    }

    public void setGenere(GenereConcerto genere) {
        this.genere = genere;
    }

    public boolean isAccessibileDisabili() {
        return accessibileDisabili;
    }

    public void setAccessibileDisabili(boolean accessibileDisabili) {
        this.accessibileDisabili = accessibileDisabili;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public enum GenereConcerto {
        ROCK, POP, CLASSICO
    }
}
