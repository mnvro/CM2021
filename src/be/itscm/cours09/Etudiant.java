package be.itscm.cours09;

import java.util.Arrays;

public class Etudiant implements Comparable<Etudiant> {
	private String nom;
	private int num;
	public Etudiant(String nom, int num) {
		super();
		this.nom = nom;
		this.num = num;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", num=" + num + "]";
	}
	@Override
	public int compareTo(Etudiant e) {
		return this.nom.compareToIgnoreCase(e.nom);
	}
	public static void main(String[] args) {
		Etudiant tabEtu[] = new Etudiant[4];
		tabEtu[0] = new Etudiant("EL MOKADEM", 500);
		tabEtu[1] = new Etudiant("BOULERHCHA", 200);
		tabEtu[2] = new Etudiant("BASANGA-EKUMBAKI", 300);
		tabEtu[3] = new Etudiant("ISCARO", 1000);
		
		for (int i = 0; i < tabEtu.length; i++) {
			System.out.println(tabEtu[i]);
		}
		
		Arrays.sort(tabEtu);
		
		System.out.println("---------------");
		for (int i = 0; i < tabEtu.length; i++) {
			System.out.println(tabEtu[i]);
		}
		
	}
}
