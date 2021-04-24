package preparation.cours02;

import javax.swing.JOptionPane;

public class Ex10 {
	public static void main(String[] args) {
		int nbBonnesReponses = 0;
		for (int i = 0 ; i<10 ; i++) {
			int i1 = (int)(Math.random()*10);
			int i2 = (int)(Math.random()*10);
			String s = JOptionPane.showInputDialog(i1+" + "+i2+" = ");
			int rep = Integer.parseInt(s);
			if (rep == i1+i2) {
				System.out.println("Bravo");
				nbBonnesReponses++;
			}
			else
				System.out.println("Erreur");
		}
		System.out.println("Votre score = "+nbBonnesReponses+"/"+10);
	}
	

}
