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
	b.libelleRue = "Maurice Béjart";
	b.codePostale = 34080;
	b.ville = "Montpellier";
	
	// ----exemplu 2 -----
	AdressePostale adr1 = new AdressePostale(85, "Maurice Béjart", 34080, "Montpellier") ;
	Personne pers1 = new Personne("Craciunescu","Andrei",adr1) ;
	
	}

}
