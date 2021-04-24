package be.itscm.cours07;
public class PersonneSimple {
	protected String nom;
	protected String prenom;
	
	public PersonneSimple(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public PersonneSimple() {
		super();
	}	
	@Override
	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom;
	}
}

