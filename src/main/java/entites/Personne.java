package entites;

public class Personne {
	// atrubute class Personne
	public String leNom;
	public String lePrenom;
	public AdressePostale adresse;

	// adaugare constructor
	public Personne() { // constructor creat "par d�fault"

	}

	public Personne(String leNom, String lePrenom, AdressePostale adresse) { // 1er
																				// constructeur
		this.leNom = leNom;
		this.lePrenom = lePrenom;
		this.adresse = adresse;

	}

	// TP3
	// 1.--- crearea unei metode---
	public void afficherIdentite(){
		System.out.println(lePrenom + " " + leNom);
	}

	//TP3.2 modifier le nom
	public void changeNom(String nvNom){
		leNom = nvNom;
	}
	
	//TP3.3 modifier le prénom
	public void changePrenom(String nvPrenom){
		lePrenom = nvPrenom;
	}
	
	//TP3.4 modifier l'adresse
	public void changeAdresse(AdressePostale nvAdresse){
		adresse = nvAdresse;
	}
	
	//TP3.5	méthode qui retourne le nom.
	public String retournNom(){
		return leNom;
	}
	
	//TP3.6 méthode qui retourne le prénom
	public String retournPrenom(){
		return lePrenom;
	}
	
	//TP3.7 méthode qui retourne l’adresse
	public AdressePostale retourAdresse(){
		return adresse;
	}
	
	
	
}
