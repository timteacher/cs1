package chapter8;

public class Coin {
	String name;
	Coin(String type){
		name =type;
	}
	
	public double getValue() {
		if (name=="quarter"){
			return .25;
		}
		else if (name=="dime" || name =="Dime") {
			return .10;
		}
		else if (name=="nickel") {
			return .05;
		}
		else if (name=="penny") {
			return .01;
		}
		else {
			return 0;
		}
	}
}
