package esercitazione.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "utente")
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numero_tessera;

    private String nome;
    private String cognome;
    private LocalDate data_di_nascita;

    @ManyToMany
    @JoinTable(
            name = "utente_catalogo",
            joinColumns = @JoinColumn(name = "utente_id"),
            inverseJoinColumns = @JoinColumn(name = "catalogo_id")
    )
    private Set<Catalogo> catalogo;

    public Utente() {
    }

    public Utente(String n, String c, LocalDate data_di_nascita) {
        this.nome = n;
        this.cognome = c;
        this.data_di_nascita = data_di_nascita;
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

    public long getNumero_tessera() {
        return numero_tessera;
    }

    public Set<Catalogo> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(Set<Catalogo> catalogo) {
        this.catalogo = catalogo;
    }

    public LocalDate getData_di_nascita() {
        return data_di_nascita;
    }

    public void setData_di_nascita(LocalDate data_di_nascita) {
        this.data_di_nascita = data_di_nascita;
    }

    public String toString() {
        return "Utente." + "\n" +
               "id: " + getNumero_tessera() + "\n" +
               "nome: " + getNome() + "\n" +
               "cognome: " + getCognome() + "\n" +
               "nato il: " + getData_di_nascita();
    }

}
