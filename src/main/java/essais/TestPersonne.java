package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
	
public static void main(String[] args){
	
	/* un constructor poarta tot timpul numele clasei!!
	constructor "AdressePostale" - creat de "new AdressePostale()", fara atribute pt.ca () sunt goale !!!
	 ------- EXEMPLU1----------*/
	AdressePostale b = new AdressePostale() ;
	b.numeroRue = 85 ;
	b.libelleRue = "Maurice Bejart";
	b.codePostale = 34080;
	b.ville = "Montpellier";
	
	// ----exemplu 2 --- metoda constructor--
	AdressePostale adr1 = new AdressePostale(85, "Maurice Bejart", 34080, "Montpellier") ;
	Personne pers1 = new Personne("Craciunescu","Andrei",adr1) ;
	
	//TP 3.1 --- crearea unei metode---
	pers1.afficherIdentite();
	
	//TP3.2 modifier le nom
	pers1.changeNom("Duppont");
	pers1.afficherIdentite();
	
	//TP3.3 modifier le prénom
	pers1.changePrenom("Ion");
	pers1.afficherIdentite();
	
	//TP3.4 modifier l'adresse
	pers1.changeAdresse(b);
	pers1.afficherIdentite();
	
	//TP3.5	méthode qui retourne le nom. nu es necesar pt. ca doar revi inapoi
	//TP3.6	méthode qui retourne le prenom. nu es necesar pt. ca doar revi inapoi
	//TP3.7 méthode qui retourne l’adresse. nu es necesar pt. ca doar revi inapoi
	
	
	
	
	}

}
