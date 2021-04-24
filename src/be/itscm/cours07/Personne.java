package be.itscm.cours07;

public class Personne {
	protected String nom;
	protected String prenom;
	protected Date dateNaissance;
	
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
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Personne(String nom, String prenom, Date dateNaissance) {
		super(); // le constructeur de la classe Object
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	public Personne() {
		super(); // le constructeur de la classe Object
	}
	
	@Override // toString existe déjà dans la classe Object, on le redéfinit ici
	public String toString() {
		return "nom=" + nom + ", prenom=" + prenom + 
				", dateNaissance=" + dateNaissance ;
	}
	
	public static void main(String[] args) {
		Personne p = new Personne("Vroman", "MN", new Date("30/12/1969"));
		System.out.println(p.toString());
	}

}
