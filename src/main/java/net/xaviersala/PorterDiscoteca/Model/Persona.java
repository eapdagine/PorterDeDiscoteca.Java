/**
 * 
 */
package net.xaviersala.PorterDiscoteca.Model;

/**
 * @author xavier
 *
 */
public class Persona {

	private String Nom;
	private Sexe Sexe;
	private float DinersQuePorta;
	private float PreuAproximatDeLaRoba;
	private Calçat Sabates;
	private boolean PortaPantalonsCurts;
	private boolean SemblaQueHaBegutMoltAlcohol;

	public Persona(String nom, net.xaviersala.PorterDiscoteca.Model.Sexe sexe, float dinersQuePorta,
			float preuAproximatDeLaRoba, Calçat sabates, boolean portaPantalonsCurts,
			boolean semblaQueHaBegutMoltAlcohol) {
		super();
		Nom = nom;
		Sexe = sexe;
		DinersQuePorta = dinersQuePorta;
		PreuAproximatDeLaRoba = preuAproximatDeLaRoba;
		Sabates = sabates;
		PortaPantalonsCurts = portaPantalonsCurts;
		SemblaQueHaBegutMoltAlcohol = semblaQueHaBegutMoltAlcohol;
	}

	public String getNom() {
		return Nom;
	}

	public Sexe getSexe() {
		return Sexe;
	}

	public float getDinersQuePorta() {
		return DinersQuePorta;
	}

	public float getPreuAproximatDeLaRoba() {
		return PreuAproximatDeLaRoba;
	}

	public Calçat getSabates() {
		return Sabates;
	}

	public boolean isPortaPantalonsCurts() {
		return PortaPantalonsCurts;
	}

	public boolean isSemblaQueHaBegutMoltAlcohol() {
		return SemblaQueHaBegutMoltAlcohol;
	}

}
