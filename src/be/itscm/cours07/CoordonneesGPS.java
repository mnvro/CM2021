package be.itscm.cours07;

import java.text.NumberFormat;

/**
 * La classe CoordonneesGPS permet de créer des coordonnées GPS.
 * Cette classe contient 2 constructeurs
 * @author Marie-Noël Vroman
 *
 */
public class CoordonneesGPS {
	private double latitude;  // par facilité j'encode cela en radians 
	private double longitude; // par facilité j'encode cela en radians
	
	/**
	 * Ce constructeur permet de créer une coordonnées GSP dont on connait la latitude 
	 * et la longitude en valeurs décimales
	 * @param latitude la latitude en degrés au nord (si Sud, on peut indiquer la valeur en négatif)
	 * @param longitude la longitude en degrés à l'est (si Ouest, on peut indiquer la valeur en négatif)
	 */
	public CoordonneesGPS(double latitude, double longitude) {
		this.latitude = latitude*2*Math.PI/360;
		this.longitude = longitude*2*Math.PI/360;
	}
	/**
	 * Ce constructeur permet de créer une coordonnées GPS à partir de ces infos:
	 * Par exemple, Schaerbeek 50° 51' 39" nord et 4° 23' 15" est
	 * @param degreN Le nombre de degrés Nord (si Sud, on peut indiquer la valeur en négatif)
	 * @param minuteN Le nombre de minutes au nord (si Sud, on peut indiquer la valeur en négatif)
	 * @param secondeN Le nombre de secondes au nord (si Sud, on peut indiquer la valeur en négatif)
	 * @param degreE Le nombre de degrés Est (si Ouest, on peut indiquer la valeur en négatif)
	 * @param minuteE Le nombre de minutes Est (si Ouest, on peut indiquer la valeur en négatif)
	 * @param secondeE Le nombre de secondes Est (si Ouest, on peut indiquer la valeur en négatif)
	 */
	public CoordonneesGPS(double degreN, double minuteN, double secondeN,
		double degreE, double minuteE, double secondeE) {
		double latitudeDegre = degreN+minuteN/60+secondeN/60/60;
		double longitudeDegre = degreE+minuteE/60+secondeE/60/60;
		this.latitude = latitudeDegre*2*Math.PI/360;
		this.longitude = longitudeDegre*2*Math.PI/360;
		
//		System.out.println("Degrée = "+latitudeDegre+" - Radians = "+latitude);
//		System.out.println("Degrée = "+longitudeDegre+" - Radians = "+longitude+"\n");
	}
	/**
	 * Constructeur sans argument
	 */
	public CoordonneesGPS() {
	}
	
	/**
	 * La méthode getDistance() permet de calculer la distance entre 2 points dont on connait les coordonnées GPS
	 * @param b Les coordonnées GPS d'un autre point
	 * @return La distance en km entre les coordonnées GPS en cours et celles passées en argument
	 */
	public double getDistance(CoordonneesGPS b) {
		double m; // la distance en milles marins
		m = 60*(Math.acos(
		  Math.sin(this.latitude)*Math.sin(b.latitude)+
		  Math.cos(this.latitude)*Math.cos(b.latitude)*Math.cos(b.longitude-this.longitude)
		)*360/2/Math.PI);
		double km = m*1.852; // la distance en km
//		System.out.println(m+" miles = "+km+" km"+"\n");
		return km;
	}
	
	/**
	 * La méthode main permet juste de tester la classe
	 * @param args Non utilisé
	 */
	public static void main(String[] args) {
		CoordonneesGPS cGPS1 = new CoordonneesGPS(50,39,0,4,34,0); // Ottignies
		CoordonneesGPS cGPS2 = new CoordonneesGPS(50,51,39,4,23,15); // Schaerbeek
		NumberFormat format=NumberFormat.getInstance();
		format.setMinimumFractionDigits(2); //nb de chiffres apres la virgule
		String s=format.format(cGPS1.getDistance(cGPS2));
		System.out.println("La distance entre Ottignies et Schaerbeek est de "+s + " km\n\n");
		//cGPS1 = new CoordonneesGPS();
		cGPS2 = new CoordonneesGPS(48,51,24,2,21,7); // Paris
		System.out.println("La distance entre Ottignies et Paris est de "+format.format(cGPS1.getDistance(cGPS2)) + " km\n\n");
	}

	
}
