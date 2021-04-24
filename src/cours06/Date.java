package cours06;

/**
 * 
 * @author mnv
 *
 */
public class Date {
	/**
	 * tabJours contient le nombre de jours max par mois
	 * L'indice 0 n'est pas utilisé
	 */
	private static int numberOfDaysMaxTable[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	private static String nameOfMonthTable[] = {"","Janvier","Février","Mars",
			"Avril","Mai","Juin","Juillet","Août","Septembre","Octobre",
			"Novembre","Décembre"
	};
	private int day;
	private int month;
	private int year;
	
	public static boolean isLeapYear(int year) {
		if (year%400==00) return true;
		if (year%100==00) return false;
		if (year%4==00) return true;
		return false;
	}
	
	

	/**
	 * bla bla bla
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		super();
		this.month = month; 
		if (month <1 || month >12) {
			this.month = 1;
			System.out.println("Mois non valide, mis à 1");
		}
		this.year = year;
		this.day = day; 
		if (day < 1) {
			this.day = 1;
			System.out.println("Jour non valide, mis à 1");
		}
		int numberOfDaysMax = numberOfDaysMaxTable[this.month];
		if(this.month == 2 && isLeapYear(year)) numberOfDaysMax++;
		if (day > numberOfDaysMax) {
			this.day = 1;
			System.out.println("Jour non valide, mis à 1");
		}
	}

	public String toString() {
		return day+"/"+month+"/"+year;
	}
	public String toString2() {
		return day+" "+nameOfMonthTable[month]+" "+year;
	}


	public static void main(String[] args) {
		Date d1 = new Date(29, 2, 1904);
		System.out.println(d1);
		System.out.println(d1.toString2());
		d1 = new Date(29, 2, 1904);
		System.out.println(d1);
		System.out.println(d1.toString2());
	}

}
