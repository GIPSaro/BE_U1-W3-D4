package giorgiaipsaropassione.dao;

import giorgiaipsaropassione.entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.sql.Connection;

public class PersonaDAO {
    static Connection conn = null;
    private final EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Persona p) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(p);
        transaction.commit();
    }

    public Persona getById(long id) {
        Persona found = em.find(Persona.class, id);

        if (found != null) {
            System.out.println("Evento" + " " + id + " " + "trovato");
        } else {
            System.out.println("Non abbiamo trovato niente");
        }
        return found;

    }

}