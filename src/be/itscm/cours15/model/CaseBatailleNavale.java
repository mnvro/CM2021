package be.itscm.cours15.model;

public class CaseBatailleNavale {
	
	
	private int idBateau = -1; // l'id du bateau sur la case (-1=pas de bateau)
	private int colonne, ligne;
	private char etat = BatailleNavaleUnJoueur.ETAT_NON_VISITE; 
	private boolean visite = false;
	
	public CaseBatailleNavale(int idBateau, int colonne, int ligne) {
		this.idBateau = idBateau;
		this.colonne = colonne;
		this.ligne = ligne;
	}

	public int getIdBateau() {
		return idBateau;
	}

	public void setIdBateau(int idBateau) {
		this.idBateau = idBateau;
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

	/**
	 * @return vrai s'il n'y a pas de bateau sur la case
	 */
	public boolean estLibre() {
		return idBateau == -1;
	}

	/**
	 * @return T pour touché, C pour coulé, ' ' pour non visité et A pour à l'eau
	 */
	public char getEtat() {
		return etat;
	}

	public void setEtat(char etat) {
		this.etat = etat;
	}
	
	public char tireSurLaCase() {
		if (this.estLibre())
			etat = BatailleNavaleUnJoueur.ETAT_A_L_EAU;
		else {
			etat = BatailleNavaleUnJoueur.ETAT_TOUCHE;
		}
		visite = true;
		return etat;
	}

	public boolean isVisite() {
		return visite;
	}

	public void setVisite(boolean visite) {
		this.visite = visite;
	}
	
}
