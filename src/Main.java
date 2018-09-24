

public class Main {
	
	
	public static void main(String[] args) {
		
		Pays pays1 = new Pays("Salade", "Végétarien", "Feuille", "Herbe", 500, 50);
		Pays pays2 = new Pays("France", "Français", "Euro", "Paris", 500, 50);
		
		//System.out.println(pays.getSaCapitale().getNom());
		
		pays1.ajouterUneVille(new Ville("La Ferté-Alais", 4000, 45, pays1));
		pays1.ajouterUneVille(new Ville("TAAAAAAH", 74, 478, pays1));
		
		//System.out.println(pays.rechercherUneVille("La Ferté-Alais"));
		//System.out.println(pays.rechercherUneVille("TAAAAAAH"));
		//System.out.println(pays.rechercherUneVille("Ltezrgrger"));
		//pays.supprimerUneVille(1);
		//System.out.println(pays.rechercherUneVille("TAAAAAAH"));
		
		pays2.ajouterUneVille(new Ville("Cerny", 454, 15, pays2));
		pays2.ajouterUneVille(new Ville("AHHHH", 4577, 178, pays2));
		
		Continent continent = new Continent("EUROPE");
		continent.ajouterPays(pays2);
		continent.ajouterPays(pays1);
		
		//System.out.println(continent.toString());
		
		//J'AI MODIFIER ! et là aussi ! '^'
		
		System.out.println(continent.getPays("France").getSaCapitale().getNom());
		System.out.println(pays1.getLesVilles().get(0).getSonPays().getNom());
	}
}
