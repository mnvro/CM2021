package preparation.cours02;

public class Voiture {
	private static int nbVoitures = 0;
	private String couleur;
	private String marque;	
	public Voiture() {
		nbVoitures++;
		couleur="";
		marque="";
	}
	public Voiture(String c, String m) {
		nbVoitures++;
		couleur=c;
		marque=m;
	}
	public static int getNbVoitures() {
		return nbVoitures;
	}
	public static void main(String[] args) {
		Voiture maVoiture1 = new Voiture("noire", "Dacia");
		Voiture maVoiture2 = new Voiture("rouge","Mazda");
		System.out.println(Voiture.getNbVoitures());
	}
}

