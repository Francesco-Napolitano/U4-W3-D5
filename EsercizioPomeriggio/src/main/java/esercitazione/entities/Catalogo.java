package esercitazione.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Inheritance (strategy = InheritanceType.JOINED)
@Table (name = "catalogo")
public abstract class Catalogo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long ISBN;

    private String titolo;
    private int anno_uscita;
    private int numero_pagine;

    @ManyToMany (mappedBy = "catalogo")
    private Set <Utente> utente;


    public Catalogo (){}

    public Catalogo (String t, int anno, int numero_pagine){
        this.titolo = t;
        this.anno_uscita = anno;
        this.numero_pagine = numero_pagine;
    }


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnno_uscita() {
        return anno_uscita;
    }

    public void setAnno_uscita(int anno_uscita) {
        this.anno_uscita = anno_uscita;
    }

    public int getNumero_pagine() {
        return numero_pagine;
    }

    public void setNumero_pagine(int numero_pagine) {
        this.numero_pagine = numero_pagine;
    }


    public long getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
               "ISBN=" + ISBN +
               ", titolo='" + titolo + '\'' +
               ", anno_uscita=" + anno_uscita +
               ", numero_pagine=" + numero_pagine +
               '}';
    }

    public Set<Utente> getUtente() {
        return utente;
    }

    public void setUtente(Set<Utente> utente) {
        this.utente = utente;
    }
}
