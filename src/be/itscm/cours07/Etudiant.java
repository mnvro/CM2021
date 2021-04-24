package be.itscm.cours07;
public class Etudiant extends Personne {
	private int num;
	private static int compteur = 0;
	public Etudiant(String nom, String prenom, Date dateNaissance) {
		super(nom, prenom, dateNaissance);
		this.num = ++compteur;
	}
	public Etudiant() {
		super();
	}
	@Override
	public String toString() {
		return "Etudiant [num=" + num +", "+ super.toString()+ "]";
	}
	public static void main(String[] args) {
		Etudiant[] tabEtu = new Etudiant[2];	
		tabEtu[0]= new Etudiant("AKE Akré", "Stéphane",new Date(15,3,1984));
		tabEtu[1]= new Etudiant("AMALLOU", "Zakaria",new Date(27,10,1988));
		System.out.println(tabEtu[0]);
		System.out.println(tabEtu[1]);
	}
}

