package be.itscm.cours16.model;

public class Date {
	private int jour;
	private int mois;
	private int annee;
	@Override
	public String toString() {
		return jour+"/"+mois+"/"+annee;
	}
	public Date(int jour, int mois, int annee) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	public Date (String s) {
		String [] tabS = s.split("/");
		this.jour = Integer.parseInt(tabS [0]);
		this.mois = Integer.parseInt(tabS [1]);
		this.annee = Integer.parseInt(tabS [2]);
	}
	
}
