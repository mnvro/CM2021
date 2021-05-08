package be.itscm.cours12;

import javax.swing.JButton;

public class JButtonPuissance4 extends JButton {
	private int colonne,ligne;

	public JButtonPuissance4(int colonne, int ligne) {
		this.colonne = colonne;
		this.ligne = ligne;
	}

	public int getColonne() {
		return colonne;
	}

	public int getLigne() {
		return ligne;
	}
	

}
