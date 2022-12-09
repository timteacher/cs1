package chapter8;

import java.util.*;
public class ToDo {
	private ArrayList<List<String>> items = new ArrayList<List<String>>();
	
	/*
	 * Constructor
	 *  Takes an array of goals and adds into our arraylist of items
	 */
	public ToDo(String[] goals,String[] times) {
		for (int i=0; i<goals.length; i++) {
			ArrayList<String> tmp = new ArrayList<String>();
			tmp.add(goals[i]);
			tmp.add(times[i]);
			tmp.add("Unfinished");
			items.add(tmp);
		}
	}
	public void speak() {
		System.out.println(items);	
	}
	public void add(String goal, String time) {
		ArrayList<String> tmp = new ArrayList<String>();
		tmp.add(goal);
		tmp.add(time);
		tmp.add("Unfinished");
		items.add(tmp);
	}
	public void markcomplete(String goal) {
		for (List entry:items) {
			if (entry.contains(goal)) {
				entry.set(2, "Finished");
			}
		}
	}
	public int todocount() {
		return items.size();
	}
	
	
}
