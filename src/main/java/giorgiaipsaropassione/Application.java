package giorgiaipsaropassione;

import giorgiaipsaropassione.dao.ConcertoDAO;
import giorgiaipsaropassione.dao.PersonaDAO;
import giorgiaipsaropassione.entities.Concerto;
import giorgiaipsaropassione.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        ConcertoDAO cd = new ConcertoDAO(em);

        PersonaDAO personad = new PersonaDAO(em);
        Location stadio = new Location("Stadio Olimpico", "Roma");
        Location teatro = new Location("Teatro alla Scala", "Milano");
        Location auditorium = new Location("Auditorium Parco della Musica", "Roma");

        // Salva le location
        em.getTransaction().begin();
        em.persist(stadio);
        em.persist(teatro);
        em.persist(auditorium);
        em.getTransaction().commit();

        // Crea i concerti e assegna una location a ciascuno
        Concerto c1 = new Concerto("Queen", LocalDate.now(), "Concerto dei Queen", "Pubblico", 2240,
                Concerto.GenereConcerto.ROCK, true, stadio);
        Concerto c2 = new Concerto("Black Eyed Peas", LocalDate.now(), "Concerto Bep", "Pubblico", 20000,
                Concerto.GenereConcerto.POP, false, auditorium);
        Concerto c3 = new Concerto("Beethoven", LocalDate.now(), "Concerto Beethoven", "Pubblico", 232321,
                Concerto.GenereConcerto.CLASSICO, true, teatro);


//        cd.save(c3);
//        cd.save(c2);
//        cd.save(c1);
        
    }
}