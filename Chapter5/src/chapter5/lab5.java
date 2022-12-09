package chapter5;

public class lab5 {
	public static void main(String args[]) {
		int x=0;
		int y=9;
		if (x>0) {
			System.out.println("x is positive");
		}
		else if (x<=0) {
			System.out.println("x is negative");
		}
		else if (x>=10) {
			System.out.println("x is at least 10");	
		}
		else if (x<10) {
			System.out.println("x is less than 10");
		}
		else if(x==0 && y==0) {
			System.out.println("x and y are both equal to 0");
		}
		else if(x%2 == 0) {
			System.out.println("x is even");
		}
		
		String word1 = "catalog";
		String word2 = "cat";
		// ".compareTo" returns 0 if the strings are the same
		// returns > 0 if word1 is lexicographically larger than word2
		// returns < 0 if ""	'' ''				  smaller than word2
		x = word1.compareTo(word2);
		// ".equals" returns true if they are the same string
		boolean k = word1.equals(word2);
		
		
	}
	
}
