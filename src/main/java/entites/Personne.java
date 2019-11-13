package entites;

public class Personne {
	// atrubute class Personne
	public String leNome;
	public String lePrenom;
	public AdressePostale adresse;
	
	// adaugare constructor
	public Personne () { // constructor creat "par d�fault"
		
	}
	
	public Personne (String leNome, String lePrenom,AdressePostale adresse) { //1er constructeur  
		this.leNome = leNome;
		this.lePrenom = lePrenom;
		this.adresse = adresse;
	
	}
	
}
