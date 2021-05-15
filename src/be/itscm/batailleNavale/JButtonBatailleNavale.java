package be.itscm.batailleNavale;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JButtonBatailleNavale extends JButton {
	private int colonne;
	private int ligne;
	private boolean libre;
	
	public void chargeImage (String nomFichier) {
//		System.out.println("nom de fichier = "+nomFichier);
		this.setIcon((new ImageIcon(JFrameBatailleNavale.class.getResource(nomFichier))));
		
	}

	public int getLigne() {
		return ligne;
	}

	public int getColonne() {
		return colonne;
	}

	public JButtonBatailleNavale(int colonne, int ligne) {
		super();
		this.colonne = colonne;
		this.ligne = ligne;
		libre = true;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	@Override
	public String toString() {
		return "JButtonBatailleNavale [colonne=" + colonne + ", ligne=" + ligne + ", libre=" + libre + "]";
	}

	

	
	
}
