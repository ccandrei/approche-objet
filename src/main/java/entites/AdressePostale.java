package entites;

public class AdressePostale {
	// atribute class AdressePostale
	public int numeroRue;
	public String libelleRue;
	public int codePostale;
	public String ville;

	// crearea unui constructor
	public AdressePostale() { // constructor creat "par d�fault"

	}

	public AdressePostale(int numeroRue, String libelleRue, int codePostale, String ville) {
		this.numeroRue = numeroRue;
		this.libelleRue = libelleRue;
		this.codePostale = codePostale;
		this.ville = ville;
	////////////////////////////////////////////////
	}
}