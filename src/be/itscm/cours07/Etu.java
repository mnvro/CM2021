package be.itscm.cours07;
public class Etu  {
	private String nom;
	private String prenom;
	private int num;
	private static int nbEtu = 0;
	public Etu() {
		super();
		nbEtu++;
		num = nbEtu;
	}
	public Etu(String nom, String prenom) {
		this();
		this.nom = nom;
		this.prenom = prenom;
	}
}

