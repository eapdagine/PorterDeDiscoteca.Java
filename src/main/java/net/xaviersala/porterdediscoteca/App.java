package net.xaviersala.porterdediscoteca;

import java.util.Arrays;
import java.util.List;

import net.xaviersala.porterdediscoteca.model.Calçat;
import net.xaviersala.porterdediscoteca.model.Persona;
import net.xaviersala.porterdediscoteca.model.Sexe;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        List<Persona> cua = Arrays.asList(new Persona("Pere Pi", Sexe.HOME, 120, 200, Calçat.VAMBES, false, true),
                new Persona("Filomeno Garcia", Sexe.HOME, 45, 123, Calçat.SABATESDEMUDAR, false, true),
                new Persona("Maria Fernandez", Sexe.DONA, 30, 120, Calçat.SANDALIES, false, true),
                new Persona("Frederico Puig", Sexe.HOME, 43, 500, Calçat.VAMBES, false, false),
                new Persona("Joni Soler", Sexe.HOME, 12, 30, Calçat.SANDALIES, true, true),
                new Persona("Emilia Magí", Sexe.DONA, 80, 240, Calçat.SABATESDEMUDAR, false, true),
                new Persona("Esther González", Sexe.DONA, 70, 120, Calçat.XANCLETES, false, false),
                new Persona("Nicolau Bonilla", Sexe.HOME, 40, 100, Calçat.SABATESDEMUDAR, false, false),
                new Persona("Irene Rosa", Sexe.DONA, 50, 75, Calçat.SABATESDEMUDAR, false, false),
                new Persona("Eugeni Perez", Sexe.HOME, 90, 310, Calçat.SANDALIES, false, true),
                new Persona("Bernat Ventura", Sexe.HOME, 48, 530, Calçat.SABATESDEMUDAR, false, false),
                new Persona("Melania Osuna", Sexe.DONA, 84, 90, Calçat.SANDALIES, false, true),
                new Persona("Maria Nevado", Sexe.DONA, 61, 160, Calçat.SABATESDEMUDAR, false, false),
                new Persona("Victoria Espasa", Sexe.DONA, 35, 150, Calçat.XANCLETES, false, false),
                new Persona("Andreu Valls", Sexe.HOME, 550, 230, Calçat.SABATESDEMUDAR, false, false),
                new Persona("Isabel Pi", Sexe.DONA, 42, 300, Calçat.XANCLETES, false, true),
                new Persona("Juan Carlos Matos", Sexe.HOME, 215, 350, Calçat.VAMBES, true, true),
                new Persona("Myriam Zhou", Sexe.DONA, 38, 190, Calçat.SANDALIES, false, false),
                new Persona("Julian Català", Sexe.HOME, 12, 100, Calçat.VAMBES, false, false));

        for (Persona persona : cua) {
            System.out.println(persona.getNom() + " no entra");
        }
    }
}
