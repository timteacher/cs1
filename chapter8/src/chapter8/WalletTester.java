package chapter8;
import java.util.*;

public class WalletTester {
	public static void main(String[] args) {
		Wallet myWallet = new Wallet();
		String x = "quarter";
		Coin quarter = new Coin(x);
		Coin quarter2 = new Coin("quarter");
		Coin dime = new Coin("dime");
		
		System.out.println(myWallet.getTotal());
		for (int i=0; i<20; i++) {
			myWallet.add(dime);
			myWallet.add(quarter);;
		}
		System.out.println(myWallet.getTotal());
		
	}	
}
