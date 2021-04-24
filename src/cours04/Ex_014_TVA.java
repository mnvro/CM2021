package cours04;

import javax.swing.JOptionPane;

public class Ex_014_TVA {
	private static int tva;

	public static void main(String[] args) {
		// d�claration des variables
		String prix; // Pour r�cup�rer le prix qui sera converti
		String tauxTVA; // Pour r�cup�rer le tauxTVA qui sera converti
		double ptvac; // Prix TVAC
		
		// On demande � l'utilisateur d'entrer le prix Hors TVA
		prix = JOptionPane.showInputDialog(null, "Entrez le prix Hors TVA : ", "Prix Hors TVA",1);
		// Conversion du prix entr� en entier
		int p = Integer.parseInt(prix);
		// Conversion du prix entr� en r�el
		double phtva = (double) p;
		
		// Demande du taux TVA � appliquer
		tauxTVA = JOptionPane.showInputDialog(null, "0%, 6%, 12%, 21%. ", "Choisir le TauxTVA",3);
		// Conversion du caractere TVA entr� en entier
		int tva = Integer.parseInt(tauxTVA);
		
		// Boucle de v�rification du bon tauxTVA entr�
		while(tva != 0 && tva != 6 && tva != 12 && tva != 21) {
			JOptionPane.showMessageDialog(null,"Entrez le bon taux TVA !","!!! ERREUR !!!",0);
			tauxTVA = JOptionPane.showInputDialog(null, "0%, 6%, 12%, 21%. ", "Choix TauxTVA",3);
			tva = Integer.parseInt(tauxTVA);
		} // on sort de la boucle 
		
		// Conversion du tauxTVA entr� en r�el
		double tva_conv = ((double)tva)/100;
		
		//calcul du prix TTC
		/*Cette formule ptvac= phtva(1+tva_conv);
		ne fonctionne pas, du coup j'ai du cr�er la variable 
		'double montant_tva' pour le calcul*/
		double montant_tva = phtva*tva_conv;
		double ptvac1= phtva*(1+tva_conv);
		ptvac= phtva + montant_tva;
		
		System.out.println(ptvac + "=?" + ptvac1);
		// Affichage de la facture d�taill�e
		JOptionPane.showMessageDialog(null, "Prix HTVA = "+phtva+"�"+"\n"+"TVA = "+tva+"%"+"\n"+"Montant TVA = "+montant_tva+"�"+"\n"+"Prix TVAC = "+ptvac+"�","D�tail de votre facture !",1);
		}
}