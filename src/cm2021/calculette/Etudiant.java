package cm2021.calculette;

import javax.swing.JOptionPane;

public class Etudiant {
	private String nom;
	private String prenom;
	private int nbCalculs = 0;
	private int nbBonnesReponses = 0;
	public double moyenne() {
		return (double)nbBonnesReponses/nbCalculs;
	}
	public void proposeUnCalcul() {
		int a = (int)(Math.random()*10);
		int b = (int)(Math.random()*10);
		int nbAleatoire = (int)(Math.random()*3);
		int rep = 0;
		String op="";
		switch (nbAleatoire) {
		case 0 : op = "+"; rep = a+b; break;
		case 1 : op = "-"; rep = a-b; break;
		case 2 : op = "*"; rep = a*b; break;
		}
		int repEtudiant = Integer.parseInt(JOptionPane.showInputDialog(a+op+b+"="));
		if (repEtudiant == rep) nbBonnesReponses++;
		nbCalculs++;
	}
	
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", nbCalculs=" + nbCalculs + ", nbBonnesReponses="
				+ nbBonnesReponses + ", moyenne()=" + moyenne()*100 + "%]";
	}
	public static void main(String[] args) {
		Etudiant et = new Etudiant();
		for (int i=0;i<3;i++) {
			et.proposeUnCalcul();
		}
		System.out.println(et);
	}
}
