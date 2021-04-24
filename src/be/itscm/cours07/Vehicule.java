package be.itscm.cours07;

public class Vehicule {
	private String nom;
	private String couleurPrincipale;
	private int nbRoues;
	private double vitesseMax;
	private int nbPlaces;
	
	
	public Vehicule(String nom, String couleurPrincipale, int nbRoues, double vitesseMax, int nbPlaces) {
		super();
		this.nom = nom;
		this.couleurPrincipale = couleurPrincipale;
		this.nbRoues = nbRoues;
		this.vitesseMax = vitesseMax;
		this.nbPlaces = nbPlaces;
	}


	public Vehicule() {
		super();
	}
	
	
}
