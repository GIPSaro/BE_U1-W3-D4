package giorgiaipsaropassione.dao;

import giorgiaipsaropassione.entities.Evento;
import giorgiaipsaropassione.entities.PartitaDiCalcio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PartitaDiCalcioDAO {
    private final EntityManager em;

    public PartitaDiCalcioDAO(EntityManager em) {
        this.em = em;
    }

    public void savePartita(PartitaDiCalcio p) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(p);
        transaction.commit();
    }

    public Evento getById(long id) {
        Evento found = em.find(Evento.class, id);

        if (found != null) {
            System.out.println("Evento" + " " + id + " " + "trovato");
        } else {
            System.out.println("Non abbiamo trovato niente");
        }
        return found;

    }
}