package cm2021.calculette;

public class Operateur {
	public static String getOp() {
		int nbAleatoire = (int)(Math.random()*3);
		switch (nbAleatoire) {
		case 0 : return "+";
		case 1 : return "-";
		case 2 : return "*";
		}
		return "";
	}
}
