package NikitaIvanov.dao;

import NikitaIvanov.entities.Evento;
import NikitaIvanov.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventDAO {
    //Attributi
    private final EntityManager em;

    //Costruttori
    public EventDAO(EntityManager em) {
        this.em = em;
    }
    //Metodi

    public void save(Evento event) {
        //qui si chiede all'Entity Manager di creare una nuova transazione
        EntityTransaction transaction = em.getTransaction();

        // qui si inizia la transazione
        transaction.begin();

        //ora si deve passare il dato da aggiungere al Persistence Context (che non lo aggiungerà ancora al Database)
        //lo mette solo in coda per essere aggiunto alla fine dell'operazione
        em.persist(event);

        //ora si deve concludere la transazione ed è in questo momento che verrà aggiunto al Database
        transaction.commit();
        System.out.println("L'evento è stato aggiunto con Successo!");

    }

    public Evento findById(long eventId) {
        //All'inizio prima di creare una transazione si deve cercare l'elemento che vogliamo tramite il suo id nel Database
        // e dobbiamo metterlo in un nuovo oggetto
        Evento event = em.find(Evento.class, eventId); //il primo paramentro è la classe dell'entity, il secondo invece è il suo id

        //Ora qui per non far crashare l'app ci inseriamo un controllo per verificare se effettivamente
        //Nel Database esiste quell'elemento
        if (event == null) throw new NotFoundException(eventId);
        return event;
    }

    public void findByIdAndDelete(long eventId) {
        // si cerca l'elemento nel database sfruttando la funzione di prima così che non dobbiamo riscrivere tutto inutilmente
        Evento eventFound = this.findById(eventId);

        //Creiamo una nuova transazione con l'Entity Manager
        EntityTransaction transaction = em.getTransaction();

        //Iniziamo la transazione
        transaction.begin();

        //chiediamo al database di rimuovere l'elemento che però non verrà rimosso subito
        //ma verrà messo in coda peressere rimosso
        em.remove(eventFound);

        //Chiudiamo la transazione, ed è in questo momento che verrà rimosso l'elemento che abbiamo selezionato
        transaction.commit();
        System.out.println("L'elemento è stato rimosso con Successo!");
    }
}
