package chapter4;
import java.lang.*;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		// create an object of the scanner class
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an operator: +, -, * or /");
		
		// storing the operation data
		char operator = input.next().charAt(0);
		
		// storing number data
		System.out.print("Enter the first number");
		double x = input.nextDouble();
		System.out.print("Enter the second number");
		double y = input.nextDouble();
		input.close();
		double res;
		
		if (operator == '+') {
			res = x+y;
			System.out.println(res);
		}
		else if (operator=='-') {
			res = x-y;
			System.out.println(res);
		}
		else if (operator=='*') {
			res = x*y;
			System.out.println(res);
		}
		else {
			res = x/y;
			System.out.println(res);
		}
	}
	
}
