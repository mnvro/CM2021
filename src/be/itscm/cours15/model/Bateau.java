package be.itscm.cours15.model;

import java.util.ArrayList;

public class Bateau {
	// Variables de classe ****************************************************
	/**
	 * constante pour indiquer que le bateau est placé à la verticale
	 */
	public static final int DIRECTION_VERTICALE = 0;
	/**
	 * constante pour indiquer que le bateau est placé à l'horizontale
	 */
	public static final int DIRECTION_HORIZONTALE = 1;
	/**
	 * tableau avec les 5 noms de bateaux
	 * Surtout utile pour retrouver les fichiers image dans la version
	 * avec une JFrame
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
	 * utilisé pour tester rapidement le code
	 * Dans un jeu normal, le joueur place lui-même ses bateaux
	 */
	public static final Bateau TAB_BATEAUX[] = {
			new Bateau(TAB_NOMS_BATEAUX[0],0,5,
					Bateau.DIRECTION_HORIZONTALE, 0, 0),
			new Bateau(TAB_NOMS_BATEAUX[1],1,4,
					Bateau.DIRECTION_VERTICALE, 1, 1),
			new Bateau(TAB_NOMS_BATEAUX[2],2,3,
					Bateau.DIRECTION_HORIZONTALE, 2, 3),
			new Bateau(TAB_NOMS_BATEAUX[3],3,3,
					Bateau.DIRECTION_HORIZONTALE, 3, 7),
			new Bateau(TAB_NOMS_BATEAUX[4],4,2,
					Bateau.DIRECTION_VERTICALE, 9, 8)
	};
	
	//Variables d'instance ****************************************************
	private String nom;
	private int idBateau;
	private int taille;
	private int direction;
	private int colonne;
	private int ligne;
	private int nbTouche = 0;
	
	//Constructeur ************************************************************
	/**
	 * Ce constructeur permet de construire un bateau
	 * @param nom le nom du bateau (utile uniquement dans la version graphique)
	 * on en a besoin pour retrouver le fichier image
	 * @param idBateau compris entre 0 et 4, l'identifiant du bateau
	 * @param taille le nombre de cases qu'occupe le bateau
	 * @param direction DIRECTION_VERTICALE = 0  DIRECTION_HORIZONTALE = 1
	 * @param colonne 0 pour la colonne la plus à gauche et 9 pour la colonne la plus à droite
	 * @param ligne 0 pour la ligne tout en haut et 9 pour la ligne tout en bas
	 */
	public Bateau(String nom, int idBateau, int taille, 
			int direction, int colonne, int ligne) {
		super();
		this.nom = nom;
		this.idBateau = idBateau;
		this.taille = taille;
		this.direction = direction;
		this.colonne = colonne;
		this.ligne = ligne;
	}
	
	//Méthodes ****************************************************************
	/**
	 * Cette méthode permet de connaitre le nom du bateau. C'est utile dans la
	 * version graphique pour obtenir les fichiers images correspondant à un
	 * bateau
	 * @return le nom du bateau
	 */
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return le nombre de cases qu'occupe le bateau
	 */
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	/**
	 * @return l'identifiant de bateau, il permet d'aller rechercher le 
	 * bateau dans le tableau tabBateaux de la classe BatailleNavaleUnJoueur
	 */
	public int getIdBateau() {
		return idBateau;
	}

	public void setIdBateau(int idBateau) {
		this.idBateau = idBateau;
	}

	/**
	 * Cette méthode est utilisée uniquement pour debugguer rapidement
	 * le programme. Elle permet d'obtenir un tableau de 5 bateaux
	 * dont le placment est hardocé (et donc de ne pas devoir les placer)
	 * @return un tableau avec 5 bateaux hardodés
	 */
	public static Bateau[] getTabBateau() {
		Bateau[] tabBateaux = TAB_BATEAUX.clone();
		return tabBateaux;
	}

	/**
	 * @return la colonne de la première case du bateau
	 */
	public int getColonne() {
		return colonne;
	}

	public void setColonne(int colonne) {
		this.colonne = colonne;
	}

	/**
	 * @return la ligne de la première case du bateau
	 */
	public int getLigne() {
		return ligne;
	}

	public void setLigne(int ligne) {
		this.ligne = ligne;
	}

	/**
	 * @return 0 pour une DIRECTION_VERTICALE, 1 DIRECTION_HORIZONTALE
	 */
	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "Bateau [nom=" + nom + ", idBateau=" + idBateau 
				+ ", taille=" + taille + ", direction=" + direction
				+ ", colonne=" + colonne + ", ligne=" + ligne + "]";
	}
	
	/**
	 * @return vrai si le bateau est complètement touché et donc coulé
	 */
	public boolean estCoule() {
		return (nbTouche >= taille);
	}

	/**
	 * @return le nombre de fois que le bateau a été touché
	 */
	public int getNbTouche() {
		return nbTouche;
	}

	public void setNbTouche(int nbTouche) {
		this.nbTouche = nbTouche;
	}
	
	/**
	 * Augment de 1 le nombre de fois que le bateau a été touché
	 */
	public void ajouteUneTouche() {
		this.nbTouche++;
	}
	
	/**
	 * Cette méthode est surtout pratique pour afficher tout un bateau
	 * par exemple quand il est entièrement touché et donc coulé
	 * @return l'ensemble des coordonnées où se trouve le bateau
	 */
	public Coord[] getCoordonneesBateau() {
		Coord[] tabCoord = new Coord[this.taille];
		int c = this.colonne;
		int l = this.ligne;
		if (direction == Bateau.DIRECTION_HORIZONTALE) {
			for (int i=0 ; i<taille ; i++) {
				tabCoord[i] = new Coord(c+i,l);
			}
		} else {
			for (int i=0 ; i<taille ; i++) {
				tabCoord[i] = new Coord(c,l+i);
			}
		}
		return tabCoord;
	}
	
}
