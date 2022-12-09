package chapter7;

public class arraysexamples {
	public static void main(String[] args) {
		int x[] = {8,4,5,21,7,9,18,2,100};
		System.out.println("There are exactly "+x.length+" doubles in this array");
		System.out.println("This is the first item in the array: " + x[0]);
		System.out.println(x[8]);
		System.out.println(x[x.length-1]);
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i=0; i<x.length; i++) {
			System.out.print(x[i]+", ");
			sum+=x[i];
			if (x[i]<min) {
				min = x[i];
			}
			if (x[i]>max) {
				max = x[i];
			}
		}
		System.out.println();
		System.out.println("The sum of the array is "+sum);
		System.out.println("The sum of the array is "+sum);
		
	}
}
