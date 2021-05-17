package be.itscm.cours15.model;

public class Coord {
	private int colonne;
	private int ligne;
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
	public Coord(int colonne, int ligne) {
		super();
		this.colonne = colonne;
		this.ligne = ligne;
	}

}
