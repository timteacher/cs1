package chapter5;
import java.util.*;

public class rockpaperscissors {
	public static void main(String[] args) {
		System.out.println("Welcome to rock-paper-scissosrs..");
		System.out.print("Please choose rock, paper or scissors: ");
		Scanner s1 = new Scanner(System.in);
		String p1 = s1.next();
		int P1;
		if (p1.compareTo("rock")==0){
			P1 = 0;
		}
		else if (p1.compareTo("scissors")==0){
			P1 = 2;
		}
		else if (p1.compareTo("paper")==0){
			P1 = 1;
		}
		else {
			P1 = 100;
		}
		int rng = (int)(Math.random()*3);
		if (rng==0) {
			System.out.println("Computer chose rock");
		}
		else if (rng==1) {
			System.out.println("Computer chose paper");
		}
		else if (rng==2) {
			System.out.println("Computer chose scisssors");
		}
		//System.out.print(P1);
		if (rng==P1) {
			System.out.println("Tied! :( ");
		}
		else {
			if (rng==1) {
				if (P1==0) {
					System.out.println("Computer won");
				}
				else {
					System.out.println("Player won");
				}
			}
			else if (rng==2) {
				if (P1==1) {
					System.out.println("Computer won");
				}
				else {
					System.out.println("Player won");
				}
			}
			else if (rng==0) {
				if (P1==2) {
					System.out.println("Computer won");
				}
				else {
					System.out.println("Player won");
				}
			}
		}
		s1.close();

	}
}
