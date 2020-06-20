/**
 * 
 */
package net.xaviersala.porterdediscoteca.model;

/**
 * @author xavier
 *
 */
public class Persona {

	private String nom;
	private Sexe sexe;
	private float dinersQuePorta;
	private float preuAproximatDeLaRoba;
	private Calçat sabates;
	private boolean portaPantalonsCurts;
	private boolean semblaQueHaBegutMoltAlcohol;

	public Persona(String nom, Sexe sexe, float dinersQuePorta, float preuAproximatDeLaRoba, Calçat sabates,
			boolean portaPantalonsCurts, boolean semblaQueHaBegutMoltAlcohol) {
		super();
		this.nom = nom;
		this.sexe = sexe;
		this.dinersQuePorta = dinersQuePorta;
		this.preuAproximatDeLaRoba = preuAproximatDeLaRoba;
		this.sabates = sabates;
		this.portaPantalonsCurts = portaPantalonsCurts;
		this.semblaQueHaBegutMoltAlcohol = semblaQueHaBegutMoltAlcohol;
	}

	public String getNom() {
		return nom;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public float getDinersQuePorta() {
		return dinersQuePorta;
	}

	public float getPreuAproximatDeLaRoba() {
		return preuAproximatDeLaRoba;
	}

	public Calçat getSabates() {
		return sabates;
	}

	public boolean isPortaPantalonsCurts() {
		return portaPantalonsCurts;
	}

	public boolean isSemblaQueHaBegutMoltAlcohol() {
		return semblaQueHaBegutMoltAlcohol;
	}

}
