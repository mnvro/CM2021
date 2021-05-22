package toto;

import java.util.ArrayList;

public class Livre {
	private static ArrayList<Livre> listeLivres = new ArrayList<Livre>();
	
	private String auteur;
	private String titre;
	
	public Livre(String auteur, String titre) {
		this.auteur = auteur;
		this.titre = titre;
		ajouteLivre(this);
	}
	
	public String toString() {
		return "Livre [auteur=" + auteur + ", titre=" + titre + "]";
	}
	
	public static String toStringAll() {
		String s="";
		
		for (Livre livre : listeLivres) {
			s += livre + "\n";
		}
		return s;
	}
	
	public static void ajouteLivre(Livre livre) {
		listeLivres.add(livre);
	}
	
	public static void main(String[] args) {
		Livre l = new Livre("Vernes","20.000 lieues sous les mers");
		l = new Livre("Auteur A","Titre A");
		l = new Livre("Auteur B","Titre B");
		System.out.println(Livre.toStringAll());
	}
}
