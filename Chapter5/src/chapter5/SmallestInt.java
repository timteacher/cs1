package chapter5;
import java.util.*;

public class SmallestInt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a value for x: ");
		int smallest = scan.nextInt();
		System.out.print("Enter a value for y: ");
		int y = scan.nextInt();
		if (y<=smallest) {
			smallest=y;
		}
		System.out.print("Enter a value for z: ");
		int z = scan.nextInt();
		if (z<=smallest) {
			smallest = z;
		}
		scan.close();
		
			

	}
}
