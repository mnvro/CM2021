package be.itscm.cours09;

import java.util.Arrays;

public class EtudiantSimple implements Comparable  {	
	private String nom;
	private String prenom;
	private int num;
	public EtudiantSimple(String nom, String prenom, int num) {
		this.nom = nom;
		this.prenom = prenom;
		this.num = num;
	}
	public static void main(String[] args) {
		EtudiantSimple tabEtu[] = new EtudiantSimple[4];
		tabEtu[0] = new EtudiantSimple("EL MOKADEM", "Hafsa", 500);
		tabEtu[1] = new EtudiantSimple("BOULERHCHA", "Mohammed", 200);
		tabEtu[2] = new EtudiantSimple("BASANGA-EKUMBAKI", "Alain", 300);
		tabEtu[3] = new EtudiantSimple("ISCARO", "Diego", 1000);
		for (int i = 0; i < tabEtu.length; i++) {
			System.out.println(tabEtu[i]);
		}
		
		Arrays.sort(tabEtu);
		
		System.out.println("---------------");
		for (int i = 0; i < tabEtu.length; i++) {
			System.out.println(tabEtu[i]);
		}
		
	}
	@Override
	public int compareTo(Object o) {
		EtudiantSimple etu = (EtudiantSimple) o;
		return this.num - etu.num;
	}
	@Override
	public String toString() {
		return "EtudiantSimple [nom=" + nom + ", prenom=" + prenom + ", num=" + num + "]";
	}
	
	
}

