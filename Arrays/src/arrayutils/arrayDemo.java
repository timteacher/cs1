package arrayutils;

public class arrayDemo {
	public static void main(String[] args) {
		int[] example;
		
		example = new int[10];
		
		example[0]= 2000;
		example[1]= 300;
		example[9]= 100;
	
		System.out.println("Element at index 0 is: "+ example[0]);
		System.out.println("Element at index 2 is: "+ example[2]);
		
		//System.out.println("Element at index 0 in string arr is: "+strings[0]
		int l;
		l = example.length;
		// for (starting; while true; how to change i){}
		example[0]=10;
		for (int i=1; i<l; i++) {
			example[i] = 10*example[i-1];
		}
		for (int i=0; i<l; i++) {
			System.out.println("Element at index "+i+" is: "+example[i]);
		}
		// selecting the largest integer in prices that's lower than coupon
		
		// find the max in a list -> mapping it to another
		// choice = 0
		// k = 0
		// iterate through prices
		//    if prices[i] is greater than choice and prices[i]<coupon
		// 		 set k to the index
		// 		 set choice to prices[i]
		// return the element at items[k]
		
		String[] list = {"sushi","pizza","burger","pasta","chicken","soup","kbbq"};
		int[] prices = {20,30,40,50,60,70,99};
		
		
		
		int size = list.length;
		int coupon=100;
		int maxprice=0;
		int maxindex=0;
		
		for (int i=0; i<size; i++) {
			if ((prices[i]>maxprice) && (prices[i]<coupon)) {
				maxindex= i;
				maxprice= prices[i];
			}
		}
		//list[maxindex] = stores the best value item
		System.out.println("The best value purchase is "+list[maxindex]);
		
		
	}	
}
