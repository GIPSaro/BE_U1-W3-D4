package giorgiaipsaropassione.dao;

import giorgiaipsaropassione.entities.GaraDiAtletica;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class GaraDiAtleticaDAO {
    private final EntityManager em;

    public GaraDiAtleticaDAO(EntityManager em) {
        this.em = em;
    }

    public void saveGara(GaraDiAtletica g) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(g);
        transaction.commit();
    }

    public GaraDiAtletica getById(long id) {
        GaraDiAtletica found = em.find(GaraDiAtletica.class, id);

        if (found != null) {
            System.out.println("Evento" + " " + id + " " + "trovato");
        } else {
            System.out.println("Non abbiamo trovato niente");
        }
        return found;

    }
}