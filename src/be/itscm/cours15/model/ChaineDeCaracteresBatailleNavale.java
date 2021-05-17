package be.itscm.cours15.model;

/**
 * Cette classe utilitaire permet de g�r�er les conversion de chaines
 * de caract�res, par exemple "A1", en coordonn�es, par exemple (0,0)
 * @author mnv
 *
 */
public class ChaineDeCaracteresBatailleNavale {
	/**
	 * @param s Les coordonn�es des cases, par exemple A1 ou bien J10
	 * @return Vrai si ces coordonn�es sont bien valides (comprises entre A1
	 * et J10)
	 */
	public static boolean valide(String s) {
		s = s.toUpperCase();
		if (!(s.length()==2||s.length()==3)) return false;
		if ((int)s.charAt(0)<65 || (int)s.charAt(0)>65+9) return false;
		if ((int)s.charAt(1)<49 ||(int)s.charAt(1)>57) return false;
		if (s.length()==3) {
			if ((int)s.charAt(1)!=49 && (int)s.charAt(2)!=48) return false; 
			// �a doit �tre 10
		}
		return true;
	}
	
	/**
	 * Permet de transformer A1 en coordonn�es de la premi�re case c�d (0,0)
	 * et J10 en coordonn�es de la derni�re case c�d (9,9)
	 * @param s par exemple A1 ou bien J10
	 * @return (0,0) pour A1 et (9,9) pour J10
	 */
	public static Coord getCoord(String s) {
		
		char caractere = (s.toUpperCase().charAt(0)); 
		int l = (int)caractere-65; 
		int c = Integer.parseInt(s.charAt(1)+"")-1;
		if (s.length()==3) c = 9; // c'est que l'on a mis 10!
		Coord coord = new Coord(c,l);
		return coord;
	}

}
