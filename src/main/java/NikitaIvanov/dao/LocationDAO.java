package NikitaIvanov.dao;

import NikitaIvanov.entities.Location;
import NikitaIvanov.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class LocationDAO {
    //Attributi
    private final EntityManager em;

    //Costruttori
    public LocationDAO(EntityManager em) {
        this.em = em;
    }

    //Metodi
    public void save(Location location) {
        //qui si chiede all'Entity Manager di creare una nuova transazione
        EntityTransaction transaction = em.getTransaction();

        // qui si inizia la transazione
        transaction.begin();

        //ora si deve passare il dato da aggiungere al Persistence Context (che non lo aggiungerà ancora al Database)
        //lo mette solo in coda per essere aggiunto alla fine dell'operazione
        em.persist(location);

        //ora si deve concludere la transazione ed è in questo momento che verrà aggiunto al Database
        transaction.commit();
        System.out.println("La Location è stata aggiunta con Successo!");

    }

    public Location findById(long locationId) {
        //All'inizio prima di creare una transazione si deve cercare l'elemento che vogliamo tramite il suo id nel Database
        // e dobbiamo metterlo in un nuovo oggetto
        Location location = em.find(Location.class, locationId); //il primo paramentro è la classe dell'entity, il secondo invece è il suo id

        //Ora qui per non far crashare l'app ci inseriamo un controllo per verificare se effettivamente
        //Nel Database esiste quell'elemento
        if (location == null) throw new NotFoundException(locationId);
        return location;
    }

    public void findByIdAndDelete(long locationId) {
        // si cerca l'elemento nel database sfruttando la funzione di prima così che non dobbiamo riscrivere tutto inutilmente
        Location locationFound = this.findById(locationId);

        //Creiamo una nuova transazione con l'Entity Manager
        EntityTransaction transaction = em.getTransaction();

        //Iniziamo la transazione
        transaction.begin();

        //chiediamo al database di rimuovere l'elemento che però non verrà rimosso subito
        //ma verrà messo in coda peressere rimosso
        em.remove(locationFound);

        //Chiudiamo la transazione, ed è in questo momento che verrà rimosso l'elemento che abbiamo selezionato
        transaction.commit();
        System.out.println("La Location è stata rimossa con Successo!");
    }
}
