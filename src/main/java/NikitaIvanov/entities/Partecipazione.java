/*package NikitaIvanov.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "partecipazione")
public class Partecipazione {
    //Attributi
    @Id
    @GeneratedValue
    private long id;


    private long persona_id;


    private long evento_id;


    private PartecipazioneType stato;

    @OneToOne
    @JoinColumn(name = "id", nullable = false, unique = true)
    private Evento evento;

    //Costruttori
    public Partecipazione() {
    }

    public Partecipazione(PartecipazioneType stato) {
        this.stato = stato;
    }

    //Metodi


    public long getId() {
        return id;
    }


    public long getPersona_id() {
        return persona_id;
    }


    public long getEvento_id() {
        return evento_id;
    }

    public void setEvento_id(long evento_id) {
        this.evento_id = evento_id;
    }

    public PartecipazioneType getStato() {
        return stato;
    }

    public void setStato(PartecipazioneType stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Partecipazione{" +
                "id=" + id +
                ", persona_id=" + persona_id +
                ", evento_id=" + evento_id +
                ", stato=" + stato +
                '}';
    }
}
*/