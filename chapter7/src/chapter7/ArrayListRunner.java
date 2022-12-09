package chapter7;
import java.util.ArrayList;

public class ArrayListRunner {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Tim");
		names.add("Wendy");
		names.add("Joey");
		names.add("Kevin");
		names.add("Ulyseses");
		// get an element at index i
		//String s = names.get(0);
		
		//System.out.println(s);
		
		int size_N = names.size();
		
		names.set(0,"Mitch");
		//System.out.println(s);
		for (int i=0; i<names.size(); i++) {
			//System.out.println(names.get(i));
		}
		//names2 and names point to the same list
		ArrayList<String> names2 = names;
		System.out.println(names2);
		names.remove(0);
		System.out.println(names2);
		
		
		//names3 is a new array list that is a copy of names
		ArrayList<String> names3 = new ArrayList<String>(names);
		System.out.println(names3);
		names.remove(0);
		System.out.println(names3);
		
		
	}
}
