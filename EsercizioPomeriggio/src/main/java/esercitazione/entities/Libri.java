package esercitazione.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "libri")
public class Libri extends Catalogo {

    private String autore;
    private String genere;

    public Libri() {
    }

    public Libri(String t, int anno, int numero_pagine, String author, String g) {
        super(t, anno, numero_pagine);
        this.autore = author;
        this.genere = g;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Libri." + "\n" +
               "autore: " + autore + "\n" +
               "genere: " + genere + "\n" +
               "titolo: " + getTitolo() + "\n" +
               "anno di uscita: " + getAnno_uscita() + "\n" +
               "numero di pagine: " + getNumero_pagine() + "\n" +
               "ISBN: " + getISBN();
    }
}
