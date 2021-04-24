package preparation.cours02;

import javax.swing.JOptionPane;

public class exo_9_petit_calcul_aleatoire {
    public static void main(String[] args) {

        int nb_rand_1 = (int)(Math.random()*10);
        int nb_rand_2 = (int)(Math.random()*10);
        int somme_to_compare = nb_rand_1 + nb_rand_2;
        String somme_string = JOptionPane.showInputDialog(("Calculer la somme de " + nb_rand_1 +" + "+ nb_rand_2) );
        int somme = Integer.parseInt(somme_string) ;
        if (somme == somme_to_compare) {
            JOptionPane.showMessageDialog(null,"Le calcul est bon","Message du système:",1);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Le calcul est incorrect","Message du système:",0);
        }
    }

}
