package lab9;

public class IDCard extends Card {
	private String idnumber;
	
	public IDCard() {
		
	}
	
	public IDCard(String n, String id) {
		super(n);
		idnumber=id;
	}
	
	public String format() {
		return super.getName()+":"+idnumber;
	}
}
