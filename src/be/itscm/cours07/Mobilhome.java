package be.itscm.cours07;

public class Mobilhome extends VehiculeMotorise{
	private int nbCouchettes;

	public Mobilhome(String nom, String couleurPrincipale, int nbRoues, double vitesseMax, int nbPlaces,
			double kilometrage, int nbPlacesPourDormir) {
		super(nom, couleurPrincipale, nbRoues, vitesseMax, nbPlaces, kilometrage);
		this.nbCouchettes = nbPlacesPourDormir;
	}

}
