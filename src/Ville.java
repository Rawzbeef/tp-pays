
public class Ville {
	private String nom;
	private int nbHabitants;
	private float superficie;
	private Pays sonPays;
	
	public Ville(String nom, int nbHabitants, float superficie, Pays pays) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.superficie = superficie;
		this.sonPays = pays;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbHabitants() {
		return nbHabitants;
	}


	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}


	public float getSuperficie() {
		return superficie;
	}
	
	public void setSuperficie(float superficie) {
		this.superficie = superficie;
	}
	
	public Pays getSonPays() {
		return sonPays;
	}


	public void setSonPays(Pays pays) {
		this.sonPays = pays;
	}

	
	
	public String toString() {
		return "\nNom : " + this.getNom() +
			"\nNombre d'habitant : " + this.getNbHabitants() +
			"\nSuperficie : " + this.getSuperficie() + "\n";
	}
	
}
