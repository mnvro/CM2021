package be.itscm.cours07;
import java.time.Year;
public class Date {
	private int jj;
	private int mm;
	private int aaaa;
	
	public final static String[] TAB_MOIS = {
			"","janvier","février","mars","avril","mai","juin","juillet",
			"août","septembre","octobre","novembre","décembre"
	};
	
	public final static int TAB_NB_MAX_JOURS[] = {0,31,28,31,30,31,30,
			31,31,30,31,30,31};
	
	public String toString() {
		return jj+"/"+mm+"/"+aaaa;
	}
	
	public String toString2() {
		return jj+" "+TAB_MOIS[mm]+" "+aaaa;
	}
	
	public Date(int jj, int mm, int aaaa) {
		this.jj = jj;
		this.mm = mm;
		this.aaaa = aaaa;
		if (!verifDate()) {
			this.jj = 1;
			this.mm = 1;
			this.aaaa = 1;
		}	
	}
	
	public boolean verifDate() {
		if (mm >= 1 && mm <= 12) {
		} else {
			return false;
		}
		int nbMaxJours = TAB_NB_MAX_JOURS[this.mm];
		if (this.mm == 2) {
			if (Year.isLeap(aaaa)) 
				nbMaxJours++;
		}
		if (jj >=0 && jj <= nbMaxJours);
		else {
			return false;
		}
		return true;
	}
	
	public Date(String s) {
		String tabS[] = s.split("/");
		jj = Integer.parseInt(tabS[0]);
		
		mm = Integer.parseInt(tabS[1]);
		aaaa = Integer.parseInt(tabS[2]);
		if (!verifDate()) {
			jj = 1;
			mm = 1;
			aaaa = 1;
		}
	}
	public static void main(String[] args) {
		Date date1 = new Date ("15/03/1984");
		Date date2 = new Date ("27/10/1988");
		System.out.println("Date 1 : "+date1.toString2());
		System.out.println("Date 2 : "+date2.toString2());
		Date date3 = new Date (25,4,1980);
		Date date4 = new Date (12,5,1986);
		System.out.println("Date 3 : "+date3.toString2());
		System.out.println("Date 4 : "+date4.toString2());
	}

}
