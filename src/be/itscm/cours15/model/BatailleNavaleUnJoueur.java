package be.itscm.cours15.model;

import javax.swing.JOptionPane;

public class BatailleNavaleUnJoueur {

	public final static int NB_COLONNES = 10;
	public final static int NB_LIGNES = 10;

	/**
	 * état quand tout le bateau est touché
	 */
	public final static char ETAT_COULE = 'C';
	public final static char ETAT_NON_VISITE = ' ';
	public final static char ETAT_TOUCHE = 'T';
	public final static char ETAT_A_L_EAU = 'A';
	/**
	 * état quand le dernier bateau est coulé
	 */
	public final static char ETAT_FINI = 'F';
	
	/*
	 * (normalement 5 + 4 + 3 + 3 + 2 = 17 = nb touches max sur les bateaux)
	 */
	private int nb_Touches_max; 

	private CaseBatailleNavale matrix[][] = 
			new CaseBatailleNavale[NB_COLONNES][NB_LIGNES];
	private Bateau[] tabBateaux;

	private int nbTouchesTotales = 0 ;
	private int nbCoupsTotal = 0;
	// quand ça vaudra 17 (NB_TOUCHES_MAX) on aura trouvé tous les bateaux

	public BatailleNavaleUnJoueur() {
		// si on veut hardcoder le placement des bateaux
		tabBateaux = Bateau.getTabBateau(); 
//		placeUnBateau(tabBateaux[0]);
//		placeUnBateau(tabBateaux[1]);
//		placeUnBateau(tabBateaux[2]);
//		placeUnBateau(tabBateaux[3]);
//		placeUnBateau(tabBateaux[4]);
		nbTouchesTotales = 0;
		for (Bateau bateau : tabBateaux) {
			nb_Touches_max += bateau.getTaille(); // normalement = 17
		}
		for (int l = 0 ; l < NB_LIGNES ; l++) {
			for (int c = 0 ; c < NB_COLONNES ; c++) {	
				matrix[c][l] = new CaseBatailleNavale(-1,c,l); 
				// -1 pour indiquer une case vide
			}
		}
	}
	
	

	/**
	 * Cette méthode est appelée dès qu'on a touché un bateau
	 * On vérifie si le bateau est entièrement touché et dans ce cas
	 * le bateau est "coulé"
	 * @param idBateau l'identifiant du bateau
	 * @return vrai si le bateau est coulé
	 */
	public boolean testCoule(int idBateau) {
		Bateau bateau = tabBateaux[idBateau];
		boolean b = (bateau.estCoule());
		if (b) {
			for (Coord coord : bateau.getCoordonneesBateau()) {
				int c = coord.getColonne();
				int l = coord.getLigne();
				matrix[c][l].setEtat(BatailleNavaleUnJoueur.ETAT_COULE);
			}
		}
		return (b);
	}

	/**
	 * Cette méthode permet de vérifier que l'emplacement où
	 * on veut mettre le bateau est valide
	 * @param bateau le bateau que l'on veut placer
	 * @return vrai si l'emplacement est valide
	 */
	public boolean estPlacementValide(Bateau bateau) {
		int taille = bateau.getTaille();
		int direction = bateau.getDirection();

		if (direction == Bateau.DIRECTION_HORIZONTALE) {
			if (bateau.getColonne()+taille > NB_COLONNES) return false;	
		} else {
			if (bateau.getLigne()+taille > NB_LIGNES) return false;	
		}
		for (Coord coord : bateau.getCoordonneesBateau()) {
			int c = coord.getColonne();
			int l = coord.getLigne();
			if (!matrix[c][l].estLibre())
				return false;
		}
		return true;
	}

	public void placeUnBateau(Bateau bateau) {
		if (! estPlacementValide(bateau)) {
			System.out.println("placement non valide");
			return;
		}
		for (Coord coord : bateau.getCoordonneesBateau()) {
			int c = coord.getColonne();
			int l = coord.getLigne();
			matrix[c][l].setIdBateau(bateau.getIdBateau());
		}
	}

	/**
	 * @return La représentation du jeu avec tous les bateaux visibles
	 */
	public String toStringTriche() {
		String s ="";
		s += "    1   2   3   4   5   6   7   8   9   10 \n";
		s += "  ┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐\n";

		for (int l = 0 ; l < NB_LIGNES ; l++) {	
			s += (char)(l+65)+" │ ";
			for (int c = 0 ; c < NB_COLONNES ; c++) {
				s += matrix[c][l].getIdBateau()+" │ ";
			}
			s += "\n";
			if (l < NB_LIGNES-1) 
				s+= "  ├───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤\n";
		}
		s += "  └───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘\n";

		return s;
	}


	public String toString() {
		String s ="";
		s += "    1   2   3   4   5   6   7   8   9   10 \n";
		s += "  ┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐\n";

		for (int l = 0 ; l < NB_LIGNES ; l++) {	
			s += (char)(l+65)+" │ ";
			for (int c = 0 ; c < NB_COLONNES ; c++) {
				s += matrix[c][l].getEtat()+" │ ";
			}
			s += "\n";
			if (l < NB_LIGNES-1) 
				s+= "  ├───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤\n";
		}

		s += "  └───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘\n";

		return s;
	}


	public char joueUnCoup(int c, int l) {
		nbCoupsTotal++;
		char etat;
		if (!this.matrix[c][l].isVisite()) {
			etat = matrix[c][l].tireSurLaCase();
			if (etat == BatailleNavaleUnJoueur.ETAT_TOUCHE) {
				int idBateau = matrix[c][l].getIdBateau();
				tabBateaux[idBateau].ajouteUneTouche();
				this.nbTouchesTotales++;				
				if (this.testCoule(idBateau)) etat = ETAT_COULE;
				if (nbTouchesTotales == nb_Touches_max) {
					etat = ETAT_FINI;
				}	
			}
			return etat;
		}else {
			System.out.println("Vous avez déjà joué cette case");
			return ETAT_NON_VISITE;
		}
	}



	public Bateau[] getTabBateaux() {
		return tabBateaux;
	}

	public void setTabBateaux(Bateau[] tabBateaux) {
		this.tabBateaux = tabBateaux;
	}



	public int getNbCoupsTotal() {
		return nbCoupsTotal;
	}

	/**
	 * Pour tester la version DOS
	 * Mettre un minimum de code ici car non réutilisable
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BatailleNavaleUnJoueur bn1j = new BatailleNavaleUnJoueur();

		int c,l;
		do {
			System.out.println(bn1j);
			String s = JOptionPane.showInputDialog(
					"Quelle case voulez-vous jouer? \n"
							+"par exemple A1 pour la première case\n"
							+"J10 pour la dernière");
			if (ChaineDeCaracteresBatailleNavale.valide(s)) {
				Coord coord = ChaineDeCaracteresBatailleNavale.getCoord(s);
				c = coord.getColonne();
				l = coord.getLigne();
				bn1j.joueUnCoup(c, l);
			}else {
				System.out.println("Veuillez entrer des infos valides");
			}
		}while (bn1j.nbTouchesTotales < bn1j.nb_Touches_max);

		System.out.println(bn1j);
		System.out.println("Vous avez gagné");
	}
}
