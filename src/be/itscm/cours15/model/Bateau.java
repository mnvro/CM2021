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
	 * Surtout utile pour retrouver les fichiers image
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
	
	public int getIdBateau() {
		return idBateau;
	}

	public void setIdBateau(int idBateau) {
		this.idBateau = idBateau;
	}

	public static Bateau[] getTabBateau() {
		Bateau[] tabBateaux = TAB_BATEAUX.clone();
		return tabBateaux;
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
	
	public boolean estCoule() {
		return (nbTouche >= taille);
	}

	public int getNbTouche() {
		return nbTouche;
	}

	public void setNbTouche(int nbTouche) {
		this.nbTouche = nbTouche;
	}
	
	public void ajouteUneTouche() {
		this.nbTouche++;
	}
	
	/**
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
