package be.itscm.batailleNavale;

public class Bateau {
	// Variables de classe ****************************************************
	/**
	 * Pour indiquer que le bateau est placé à la verticale
	 */
	public static final int DIRECTION_VERTICALE = 0;
	/**
	 * Pour indiquer que le bateau est placé à l'horizontale
	 */
	public static final int DIRECTION_HORIZONTALE = 1;
	/**
	 * tableau avec les 5 noms de bateaux
	 */
	public static final String TAB_NOMS_BATEAUX[] = {
			"porte-avions",
			"croiseur",
			"sous-marin",
			"contre-torpilleur",
			"torpilleur"
	};
	/**
	 * TAB_BATEAUX[] nous permet de créer nos 5 bateaux
	 * et d'hardcoder rapidement leur position
	 * 
	 */
	public static final Bateau TAB_BATEAUX[] = {
			new Bateau(TAB_NOMS_BATEAUX[0],5,DIRECTION_HORIZONTALE,1,1 ),
			new Bateau(TAB_NOMS_BATEAUX[1],4,DIRECTION_VERTICALE,2,2),
			new Bateau(TAB_NOMS_BATEAUX[2],3,DIRECTION_HORIZONTALE,3,4),
			new Bateau(TAB_NOMS_BATEAUX[3],3,DIRECTION_HORIZONTALE,4,8),
			new Bateau(TAB_NOMS_BATEAUX[4],2,DIRECTION_VERTICALE,10,9)
	};
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
	
	//Variables d'instance ****************************************************
	private String nom;
	private int taille;
	private int direction;
	private int colonne;
	private int ligne;
	
	//Constructeur ************************************************************
	/**
	 * @param nom le nom du bateau
	 * @param taille sa taille (5 pour le porte-avions par exemple)
	 * @param direction DIRECTION_VERTICALE=0 ou bien DIRECTION_HORIZONTALE=1
	 * @param colonne colonne où se trouve la première case du bateau
	 * @param ligne ligne où se trouve la première case du bateau
	 */
	public Bateau(String nom, int taille, int direction, 
										  int colonne, int ligne) {
		super();
		this.nom = nom;
		this.taille = taille;
		this.direction = direction;
		this.colonne = colonne;
		this.ligne = ligne;
	}
	
	//Méthodes ****************************************************************
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public int getColonne() {
		return colonne;
	}
	public void setColonne(int colonne) {
		this.colonne = colonne;
	}
	public int getLigne() {
		return ligne;
	}
	public void setLigne(int ligne) {
		this.ligne = ligne;
	}
	
	
	private String getNomFichier() {
		String s = PATH;
		if (direction == DIRECTION_HORIZONTALE) s += PATHH;
		if (direction == DIRECTION_VERTICALE) s += PATHV;
		return s+nom;
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
	public String[] getTabNomsFichiers() {
		String tabS[] = new String[taille];
		for (int i = 0; i < tabS.length; i++) {
			tabS[i] = getNomFichier()+"_"+(i+1)+".png";
		}
		return tabS;
	}
	
	@Override
	public String toString() {
		return "Bateau [nom=" + nom + ", taille=" + taille + ", direction=" 
	+ direction + ", colonne=" + colonne
				+ ", ligne=" + ligne + "]";
	}
	
}
