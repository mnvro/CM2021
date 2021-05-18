package be.itscm.cours15.model;

public class FichierBatailleNavale {
	/**
	 * le nom du dossier qui contient les images
	 */
	public static final String PATH = "/images/";
	/**
	 * le nom du dossier qui contient les images de bateau à la verticale
	 */
	public static final String PATHV = "images_verticales/";
	/**
	 * le nom du dossier qui contient les images de bateau à l'horizontale
	 */
	public static final String PATHH = "images_horizontales/";
	
	public static final String NOM_F_CASE_TOUCHE = PATH+"case touche.png";
	public static final String NOM_F_CASE_A_L_EAU = PATH+"case a l eau.png";
	
	
	/**
	 * Cette méthode est utilisée dans la méthode getTabNomsFichiers
	 * @param bateau
	 * @param direction
	 * @return
	 */
	private static String getNomFichier(Bateau bateau) {
		String s = PATH;
		if (bateau.getDirection() == Bateau.DIRECTION_HORIZONTALE) s += PATHH;
		if (bateau.getDirection() == Bateau.DIRECTION_VERTICALE) s += PATHV;
		return s+bateau.getNom();
	}
	
	/**
	 * @return un tableau avec tous les noms des fichiers qui permettent 
	 * d'afficher le bateau.
	 * Par exemple si le bateau est le sous-marin positionné à la verticale, 
	 * (il a donc une taille de 3),
	 * On aura donc un tableau de 3 String: 
	 * "/images/images_verticales/Sous-marin_1.png", 
	 * "/images/images_verticales/Sous-marin_2.png" et
	 * "/images/images_verticales/Sous-marin_3.png",
	 */
	public static String[] getTabNomsFichiers(Bateau bateau) {
		String tabS[] = new String[bateau.getTaille()];
		for (int i = 0; i < tabS.length; i++) {
			tabS[i] = getNomFichier(bateau)+"_"+(i+1)+".png";
		}
		return tabS;
	}
}
