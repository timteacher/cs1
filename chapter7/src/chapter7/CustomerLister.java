package chapter7;

import java.util.Scanner;

public class CustomerLister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] customername = {"Cathy", "Ben", "Jorge", "Wanda", "Freddie"};
		for (int i =0; i<customername.length; i++) {
//			System.out.println(customername[i]);
		}
		// for each loop
		// for (type var: array) {
		// 		--- statements using var ----;
		// }
//		for (String name : customername) {
//			System.out.println(name);
//		}
		
		int [] customerbalance = new int[5];
		Scanner input = new Scanner(System.in);
		
		//read the data
		int total=0;
		for (int i=0; i<customername.length; i++) {
			System.out.println("How much is "+customername[i]+"'s balance?");
			int query = input.nextInt();
			customerbalance[i]=query;
			total+=query;
		}
		
		// printing out the results
		
		System.out.println("The sum of all the balances is "+total);
		input.close();

	}

}
