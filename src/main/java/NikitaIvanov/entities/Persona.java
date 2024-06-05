/*package NikitaIvanov.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "persona")
public class Persona {
    //Attributi
    @Id
    @GeneratedValue
    private long id;


    private String nome;


    private String cognome;


    private String email;


    private LocalDate dataNascita;


    private PersonType sesso;


    private List<Partecipazione> lista_partecipazioni;

    //Costruttori

    public Persona() {
    }

    public Persona(String nome, String cognome, String email, LocalDate dataNascita, PersonType sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataNascita = dataNascita;
        this.sesso = sesso;

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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public PersonType getSesso() {
        return sesso;
    }

    public void setSesso(PersonType sesso) {
        this.sesso = sesso;
    }

    public List<Partecipazione> getLista_partecipazioni() {
        return lista_partecipazioni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataNascita=" + dataNascita +
                ", sesso=" + sesso +
                ", lista_partecipazioni=" + lista_partecipazioni +
                '}';
    }
}
*/