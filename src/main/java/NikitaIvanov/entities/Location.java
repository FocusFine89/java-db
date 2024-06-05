package NikitaIvanov.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "location")
public class Location {
    //Attributi
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "città")
    private String citta;

    @Column(name = "event_id")
    private long event_id;

    @OneToOne
    @JoinColumn(name = "id", nullable = false, unique = true)
    private Evento evento;

    //Costruttori
    public Location() {
    }

    public Location(String nome, String citta) {
        this.nome = nome;
        this.citta = citta;
    }

    //Metodi


    public long getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public long getEvent_id() {
        return event_id;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", citta='" + citta + '\'' +
                ", event_id=" + event_id +
                '}';
    }
}
