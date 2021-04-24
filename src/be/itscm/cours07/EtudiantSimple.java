package be.itscm.cours07;
public class EtudiantSimple extends PersonneSimple {	
	
	private int num;
	public EtudiantSimple(String nom, String prenom, int num) {
		super(nom, prenom);
		this.num = num;
	}
	public static void main(String[] args) {
		EtudiantSimple et1 = new EtudiantSimple("EL MOKADEM", "Hafsa", 500);
		System.out.println(et1);
	}
}

