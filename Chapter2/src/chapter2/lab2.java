package chapter2;

public class lab2 {
	public static void main(String args[]) {
		String river = "Mississippi";
		String bigRiver = river.toUpperCase();
		int n = bigRiver.length(); 
		String smallRiver = river.toLowerCase();
		System.out.println(smallRiver);
		String bigTestString = smallRiver.toUpperCase();
		System.out.println(bigTestString);
		
		String twoMississippi = smallRiver + " "+ bigRiver;
		System.out.println(twoMississippi);
		
		char a = river.charAt(1);
		System.out.println(a);
		
	}
}
