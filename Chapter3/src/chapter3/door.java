package chapter3;

public class door {
	private boolean state;
	private String color;
	private String material;
	private double areaSize;
	public String name;
	
	//constructor - has some initial arguments that every object
	// of a type of this class needs
	// every door needs to know if its open or closed and what its
	// name is
	public door(String init_name, boolean init_state, double l, double w) {
		state = init_state;
		name = init_name;
		areaSize = l*w;
		
	}
	
	// mutator method
	public void open() {
		state = true;
	}
	
	public void close() {
		state = false;
	}
	// accessor method
	public String getColor() {
		return color;
	}
	public String getMaterial() {
		return material;
	}
	public double getArea() {
		return areaSize;
	}
	public String getState() {
		if (state) {
			return "open";
		}
		else {
			return "closed";
		}
	}
	
	
}
