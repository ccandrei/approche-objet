package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		/* Exercice 1
		 * 
		 * �Apprenez � cr�er une liste
		 * 
		 * �Creezun nouveau package listes.
		 * �Creez une classe apel�e CreationListe
		 * �Dans la m�thode main,creez une ArrayList d�entiers et 
		    stockez y tous les nombres de 1 � 100
		 * �Affichez la taille de la liste en utilisant la m�thode de 
		    la classe ArrayList fournissant cette information.*/
		   
		
		/*�Dans la m�thode main,creez une ArrayList d�entiers et 
		    stockez y tous les nombres de 1 � 100*/
		ArrayList<Integer> liste = new ArrayList<>();
	   
		for (int x = 0; x < 100 ; x++ ){
			
			liste.add(x);
			
			System.out.println(x);
		}
		
		/*Affichez la taille de la liste en utilisant la m�thode de 
	    la classe ArrayList fournissant cette information.*/
		
		int taille = liste.size();
		
		System.out.println("La taille de la liste est :" + taille);
	}

}
