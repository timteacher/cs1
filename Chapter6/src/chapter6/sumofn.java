package chapter6;
import java.lang.Math.*;
import java.util.Scanner;
public class sumofn {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int odds=0;
		int evens=0;
		for (int i=0; i<5; i++) {
			System.out.println("Please enter the next integer: ");
			int x = input.nextInt();
			// test if even or odd
			if ((x/2)*2==x) {
				//then its even
				System.out.println("That's an even integer");
				evens++;
			}
			else {
				System.out.println("That's an odd integer");
				odds++;
			}
		}
		System.out.println("You entered "+evens+" evens");
		System.out.println("You entered "+odds+" odds");
		input.close();
	}
}
