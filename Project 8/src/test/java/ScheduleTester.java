package test.java;

import main.java.Schedule;

public class ScheduleTester {
	public static void main(String[] args) {
		Schedule november = new Schedule(30,11);
		november.setItinerary(8,"Biology homework");
		november.printSchedule();
		Schedule december = new Schedule(31,12);
		december.setItinerary(16, "All classes done");
		december.printSchedule();
		
	}
}
