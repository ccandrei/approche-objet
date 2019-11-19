package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		/* Exercice 1
		 * 
		 * •Apprenez à créer une liste
		 * 
		 * •Creezun nouveau package listes.
		 * •Creez une classe apelée CreationListe
		 * •Dans la méthode main,creez une ArrayList d’entiers et 
		    stockez y tous les nombres de 1 à 100
		 * •Affichez la taille de la liste en utilisant la méthode de 
		    la classe ArrayList fournissant cette information.*/
		   
		
		/*•Dans la méthode main,creez une ArrayList d’entiers et 
		    stockez y tous les nombres de 1 à 100*/
		ArrayList<Integer> liste = new ArrayList<>();
	   
		for (int x = 0; x < 100 ; x++ ){
			
			liste.add(x);
			
			System.out.println(x);
		}
		
		/*Affichez la taille de la liste en utilisant la méthode de 
	    la classe ArrayList fournissant cette information.*/
		
		int taille = liste.size();
		
		System.out.println("La taille de la liste est :" + taille);
	}

}
