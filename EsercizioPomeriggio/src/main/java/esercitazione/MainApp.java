package esercitazione;

import esercitazione.entities.Catalogo;
import esercitazione.entities.Libri;
import esercitazione.entities.Utente;

import java.time.LocalDate;

public class MainApp {

    public static void main(String[] args) {

        Utente utente = new Utente("Marcello", "Mastroianni", LocalDate.of(1924, 9, 26));

        Catalogo libro = new Libri("Star Wars", 1977, 150, "George Lucas", "Fantascienza");

        System.out.println(utente);
        System.out.println(libro);


    }

}
