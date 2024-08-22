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

    public enum GenereConcerto {
        ROCK, POP, CLASSICO
    }

    // altri getter e setter
}
