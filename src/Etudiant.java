import javax.swing.JOptionPane;
/**
 * La classe Etudiant permet de ...
 * 
 * @author Marie-No�l Vroman
 *
 */
public class Etudiant {
	private String nom;
	private String prenom;
	private int num;
	public void affiche() {
		System.out.println("Nom : "+nom+", pr�nom : "+prenom+", num : "+num);
	}
	/**
	 * Constructeur par d�faut
	 */
	public Etudiant() {
	}
	/**
	 * Constructeur qui permet de construire un �tudiant dont on passe en parm�tres
	 * le nom, le pr�nom et le num�ro
	 * @param nom le nom de l'�tudiant
	 * @param prenom le pr�nom de l'�tudiant
	 * @param num le num�ro de l'�tudiant
	 */
	public Etudiant(String nom, String prenom, int num) {
		this.nom = nom;
		this.prenom = prenom;
		this.num = num;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * La m�thode getNum() permet d'obtenir le num�ro de l'�tudiant
	 * @return le num�ro de l'�tudiant
	 */
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
//	public String toString() {
//		return "Nom : " + nom +" - Pr�nom : " + prenom+" - Num : " + num;
//	}
	
	
	
	public static void main(String[] args) {
		Etudiant et1 = new Etudiant();
		Etudiant et2 = new Etudiant();
		et1.nom = "BASANGA-EKUMBAKI";
		et1.prenom = "Alain";
		et1.num = 5;
		et2.nom = "AMALLOU";
		et2.prenom = "Zakaria";
		et2.num = 6;
		et1.affiche();
		et2.affiche();
		
		Etudiant et3 = new Etudiant("Vroman", "MN", 1);
		System.out.println(et3);
		
	}
	
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", num=" + num + "]";
	}

}
