package essais;

import  entites.AdressePostale;

public class TestAdressePostale {

public static void main(String[] args){
	
	// un constructor poarta tot timpul numele clasei!!
	// constructor "AdressePostale" - creat de "new AdressePostale()", fara atribute pt.ca () sunt goale !!!
	AdressePostale adr1 = new AdressePostale(85, "Maurice Béjart", 34080, "Montpellier") ;
	
	// un constructor poarta tot timpul numele clasei!!
	// constructor "AdressePostale" - creat de "new AdressePostale()", fara atribute pt.ca () sunt goale !!!
	AdressePostale b = new AdressePostale() ;
	b.numeroRue = 85 ;
	b.libelleRue = "Maurice Béjart";
	b.codePostale = 34080;
	b.ville = "Montpellier";
	

	
	}
}
