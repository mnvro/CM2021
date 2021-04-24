package be.itscm.cours07;

public class Ville {
	private String nom = "";
	private CoordonneesGPS cgps ;
	
	public Ville(String nom, CoordonneesGPS cgps) {
		this.nom = nom;
		this.cgps = cgps;
	}
	public double getDistance(Ville uneAutreVille) {
		return this.cgps.getDistance(uneAutreVille.cgps);
	}
	public static double getDistance(Ville uneVille,Ville uneAutreVille) {
		return uneVille.cgps.getDistance(uneAutreVille.cgps);
	}
	public static void main(String[] args) {
		Ville ville1 = new Ville("Schaerbeek",
				new CoordonneesGPS(50, 51, 39, 4, 23, 15));
		Ville ville2 = new Ville("Louvain-la-Neuve",
				new CoordonneesGPS(50,40,8,4,36,56));
		System.out.println("La distance entre "+ville1.nom+
				" et "+ville2.nom+" est de "+
				Math.round(ville1.getDistance(ville2)*100.0)/100.0+" km");
		System.out.println("La distance entre "+ville1.nom+
				" et "+ville2.nom+" est de "+
				Math.round(Ville.getDistance(ville1,ville2)*100.0)/100.0+" km");
	}
	

}
