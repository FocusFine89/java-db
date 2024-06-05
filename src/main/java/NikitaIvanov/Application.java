package NikitaIvanov;

import NikitaIvanov.dao.EventDAO;
import NikitaIvanov.entities.EventType;
import NikitaIvanov.entities.Evento;
import NikitaIvanov.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventDAO evDAO = new EventDAO(em);


        Evento evento1 = new Evento("titolo1", LocalDate.of(2024, 5, 20), "Descrizione 1", EventType.PRIVATO, 10);
        Evento evento2 = new Evento("titolo2", LocalDate.of(2022, 2, 9), "Descrizione 2", EventType.PUBBLICO, 100);

        Location location1 = new Location("qwerty", "roma");

        //Creazione
        /*evDAO.save(evento1);
        evDAO.save(evento2);*/

        //Find by ID
       /* try {
            Evento eventDB = evDAO.findById(1);
            System.out.println(eventDB.getTitolo());
        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        //Eliminazione tramide ID
        try {
            evDAO.findByIdAndDelete(2);
        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }*/

        //--------------parte 2-----------//


    }
}
