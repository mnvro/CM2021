package be.itscm.cours09;

import java.util.Arrays;

public class Date implements Comparable<Date> {
	private int day;
	private int month;
	private int year;
	
	public Date(String dateS) {
		String tabS[] = dateS.split("/");
		day = Integer.parseInt(tabS[0]);
		month= Integer.parseInt(tabS[1]);
		year = Integer.parseInt(tabS[2]);
	}
	
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	
	public static void main(String[] args) {
		Date date1 = new Date ("30/12/2021"); // 20211230
		//System.out.println(date1);
		Date date2 = new Date ("29/12/2021"); // 20211229
		//System.out.println(date1);
		Date tabDates[] = {
				new Date("12/12/1970"),
				new Date("5/5/1960"),
				new Date("3/3/1945"),
				new Date("24/4/2021"),
				new Date("23/4/2021"),
				new Date("1/1/2021")
		};
		System.out.println("Avant le tri\n===========\n");
		for (int i = 0; i < tabDates.length; i++) {
			System.out.println(tabDates[i]);
		}
		Arrays.sort(tabDates);
		System.out.println("Après le tri\n===========\n");
		for (int i = 0; i < tabDates.length; i++) {
			System.out.println(tabDates[i]);
		}
	}

	@Override
	public int compareTo(Date d) {
		return -(this.year*10000 + this.month*100 +this.day) + 
				(d.year*10000 + d.month*100 +d.day);
	}

}
