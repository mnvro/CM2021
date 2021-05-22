package be.itscm.cours16.model;

public class Reunion {
	private Date date;

	public Reunion(Date date) {
		super();
		this.date = date;
	}

	@Override
	public String toString() {
		return date.toString();
	}
	
}
