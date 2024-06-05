package NikitaIvanov.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "eventi")
public class Evento {
    //Attributi
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "data_evento")
    private LocalDate dataEvento;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "tipo_evento")
    @Enumerated(EnumType.STRING)
    private EventType tipoEvento;

    @Column(name = "max_partecipanti")
    private int maxPartecipanti;

    @OneToOne(mappedBy = "evento")
    private Location location;


    //Costruttori

    public Evento() {
    }

    public Evento(String titolo, LocalDate dataEvento, String descrizione, EventType tipoEvento, int maxPartecipanti) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.maxPartecipanti = maxPartecipanti;
    }

    //Metodi


    public long getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public EventType getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(EventType tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getMaxPartecipanti() {
        return maxPartecipanti;
    }

    public void setMaxPartecipanti(int maxPartecipanti) {
        this.maxPartecipanti = maxPartecipanti;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", maxPartecipanti=" + maxPartecipanti +
                ", location=" + location +
                '}';
    }
}
