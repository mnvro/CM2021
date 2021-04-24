package be.itscm.cours07;


public class VehiculeMotorise extends Vehicule {
	private double kilometrage;
	

	public VehiculeMotorise(String nom, String couleurPrincipale, int nbRoues, double vitesseMax, int nbPlaces,
			double kilometrage) {
		super(nom, couleurPrincipale, nbRoues, vitesseMax, nbPlaces);
		this.kilometrage = kilometrage;
	}


	public VehiculeMotorise() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	
}
