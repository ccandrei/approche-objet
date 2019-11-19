package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
	/*Soit la classe ex�cutable FusionListe ci-dessous :
	o Dans cette classe, on a constitu� 2 listes diff�rentes, omm�es liste1 et liste2
    o Ces listes contiennent des couleurs */
    
    List<String> liste1 = new ArrayList<String>();
    	liste1.add("Rouge");
    	liste1.add("Vert");
    	liste1.add("Orange");
    	
    List<String> liste2 = new ArrayList<String>();
    	liste2.add("Blanc");
    	liste2.add("Bleu");
    	liste2.add("Orange");
    	
    	System.out.println("liste2: " + liste2);
    /*--------------------------------------------------------------------------------
    T�ches � r�aliser :
    � Cr�er en utilisant des boucles une liste appel�e liste3 et 
    qui contient l�ensemble des donn�es des 2 listes pr�c�dentes.*/
    	
    	List<String> liste3 = new ArrayList<String>(liste1.size());	
    	for (int i = 0; i <liste3.size(); i++) {
    		
			liste3.add(liste1.get(i) + liste2.get(i));		
			}	
    	
    	for (int i = 0; i < liste3.size(); i++) {
    		
			System.out.println("liste3: " + liste3);		
			}
		
	}

}
