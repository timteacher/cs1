package main.java;


public class Schedule {
	private String[] days;
	private String month;
	private int entryCounter;
	int monthnum;
	/**
	 * constructor - the template of what should happen when a member
	 *  of this class is instantiated 
	 * 	 */
	public Schedule (int dayscount, int monthnumber){
		days = new String[dayscount];
		month = String.valueOf(monthnumber); 
		monthnum = monthnumber;
	}
	
	/**
	 * 
	 * @param day
	 * @param entry
	 */
	public void setItinerary(int day, String entry) {
		days[day]=entry;
	}
	
	

	
	public void printSchedule() {
		for (int i=1; i<days.length;i++) {
			if (days[i]!=null){
				System.out.println(month+"/"+i+": "+days[i]);
			}
			else {
				System.out.println(month+"/"+i);
			}
	
		}
	}
	
	public void setholidays() {
		if (month.compareTo("12")==0) {
			days[25]+="It's Christmas";
			for (int i=)
		}
	}
	
	/*
	 * 
	 */
	public void holidays(int date) {
		if (monthnum==12) {
			if (date==25) {
				System.out.println("It's Christmas");
			}
			if (date ==24) {
				System.out.println("Christmas Eve");
			}
			if (date>=18 && date<=26) {
				System.out.println("It's Hanukkah");
			}
			if (date>=26 && date<=31) {
				System.out.println("It's Kwanzaa");
			}
		}
		else if (monthnum==11) {
			if (date==24) {
				System.out.println("It's Thanksgiving");
			}
		}
		
	}
	
	public void counter() {
		entryCounter = 0;
		for (int i=0;i<days.length;i++) {
			if (days[i]!=null) {
				entryCounter++;
			}
		}
		System.out.println(entryCounter);
		
	}
}
