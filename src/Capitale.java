
public class Capitale extends Ville {
	
	public Capitale(String nom, int nbHabitants, float superficie, Pays pays) {
		super(nom, nbHabitants, superficie, pays);
	}
	
	public String toString() {
		return "*** La Capitale ***\n" +
			"\nNom : " + this.getNom() +
			"\nNombre d'habitant : " + this.getNbHabitants() +
			"\nSuperficie : " + this.getSuperficie();
	}
}
