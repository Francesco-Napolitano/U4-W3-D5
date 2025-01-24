package esercitazione.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "riviste")
public class Riviste extends Catalogo{

    @Enumerated (EnumType.STRING)
    private  Periodicita periodicita;

    public Riviste(){}

    public Riviste(String t, int anno, int numero_pagine,Periodicita p){
        super (t, anno, numero_pagine);
        this.periodicita = p;
    }


    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Override
    public String toString (){
        return "Riviste." +
               "Periodicità: " + periodicita + "\n  " +
               "titolo: " + getTitolo() + "\n " +
               "anno di uscita: " + getAnno_uscita() + "\n " +
               "numero di pagine: " + getNumero_pagine() + "\n " +
               "ISBN: " + getISBN();
    }

}
