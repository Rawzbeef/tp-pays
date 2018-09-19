import java.util.ArrayList;


public class Continent {
	private String nom;
	private ArrayList<Pays> lesPays;
	
	public Continent(String nom) {
		this.setNom(nom);
		this.lesPays = new ArrayList<Pays>();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Pays getPays(String nom) {
		return this.lesPays.get(this.getIndexPays(nom));
	}
	
	public void ajouterPays(Pays pays) {
		this.lesPays.add(pays);
	}
	
	public boolean rechercherPays(String nom) {
		int i = 0;
		while(i < this.lesPays.size() && !nom.equals(this.lesPays.get(i).getNom())) {
			i++;
		}
		if(i < this.lesPays.size() && nom.equals(this.lesPays.get(i).getNom())) return true;
		else return false;
	}
	
	public int getIndexPays(String nom) {
		int i = 0;
		while(i < this.lesPays.size() && !nom.equals(this.lesPays.get(i).getNom())) {
			i++;
		}
		if(i < this.lesPays.size() && nom.equals(this.lesPays.get(i).getNom())) return i;
		else return -1;
	}
	
	public void supprimerUnPays(int index) {
		if(index < this.lesPays.size()) {
			this.lesPays.remove(index);
		}
			
	}
	
	public void supprimerUnPays(String nom) {
		int i = getIndexPays(nom);
		if(i < this.lesPays.size()) {
			this.lesPays.remove(i);
		}
	}
	
	public String toString() {
		String text = "*** Le Continent ***\n" +
				"\nNom : " + this.nom + 
				"\n\n*** Les Pays ***\n" ;
		for(int i = 0; i < this.lesPays.size(); i++) {
			text += "\n" + lesPays.get(i).toString();
		}
		return text;
	}

	
	
}
