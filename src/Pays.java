import java.util.ArrayList;

/**
 * 
 * @author Rosebeef
 *
 */
public class Pays {
	private String nom;
	private String langue;
	private String monnaie;
	private static int compteurPays = 0;
	private Capitale saCapitale;
	private ArrayList<Ville> lesVilles;
	
	
	
	/**
	 * Constructeur de la class Pays
	 * 
	 * @param nom 
	 * @param langue
	 * @param monnaie
	 * @param capitale
	 * 
	 * 
	 */
	public Pays(String nom, String langue, String monnaie, String nomCapitale, int nbHCapitale, float superficieCapitale) {
		this.nom = nom;
		this.langue = langue;
		this.monnaie = monnaie;
		compteurPays++;
		this.saCapitale = new Capitale(nomCapitale, nbHCapitale, superficieCapitale, this);
		this.lesVilles = new ArrayList<Ville>();
	}
	
	/**
	 * 
	 * @return Le nom du pays.
	 * 
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * 
	 * @return Le nom du pays en majuscule.
	 * 
	 */
	public String getNomMaj() {
		return this.nom.toUpperCase();
	}
	
	/**
	 * 
	 * @return Le nom du pays avec une majuscule en première lettre.
	 * 
	 */
	public String getNomCap() {
		String text = "" + this.nom.toUpperCase().charAt(0) + this.nom.substring(1,this.nom.length());
		return text;
	}
	
	/**
	 * 
	 * @param unNom
	 * 
	 */
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	/**
	 * 
	 * @return le nombre d'objet Pays créé.
	 */
	public static int getCompteurPays() {
		return compteurPays;
	}
	
	public Capitale getSaCapitale() {
		return this.saCapitale;
	}
	
	public void ajouterUneVille(Ville ville) {
		this.lesVilles.add(ville);
	}
	
	public boolean rechercherUneVille(String nom) {
		int i = 0;
		while(i < this.lesVilles.size() && !nom.equals(this.lesVilles.get(i).getNom())) {
			i++;
		}
		if(i < this.lesVilles.size() && nom.equals(this.lesVilles.get(i).getNom())) return true;
		else return false;
	}
	
	public int getIndexVille(String nom) {
		int i = 0;
		while(i < this.lesVilles.size() && !nom.equals(this.lesVilles.get(i).getNom())) {
			i++;
		}
		if(i < this.lesVilles.size() && nom.equals(this.lesVilles.get(i).getNom())) return i;
		else return -1;
	}
	
	public void supprimerUneVille(int index) {
		if(index < this.lesVilles.size()) {
			this.lesVilles.remove(index);
		}
			
	}
	
	public void supprimerUneVille(String nom) {
		int i = getIndexVille(nom);
		if(i < this.lesVilles.size()) {
			this.lesVilles.remove(i);
		}
	}
	
	public ArrayList<Ville> getLesVilles() {
		return this.lesVilles;
	}

	public String toString() {
		String text = "-- "+ this.nom +" --\n" + 
				"\nLangue : " + this.langue +
				"\nMonnaie : " + this.monnaie +
				"\n\n" + this.saCapitale.toString() +
				"\n\n*** Les Villes ***\n" ;
		for(int i = 0; i < this.lesVilles.size(); i++) {
			text += "\n" + lesVilles.get(i).toString();
		}
		return text;
	}

}
