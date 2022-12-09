package lab9;

public class businesscard extends Card {
	private String companyname;
	private String jobtitle;
	private int phonenumber;
	
	public businesscard() {
		super();
		companyname = "";
		jobtitle="";
		phonenumber=-1;
		
	}
	public businesscard(String n, String c, String j, int p) {
		super(n);
		companyname = c;
		jobtitle=j;
		phonenumber=p;
	}
	/*
	 * method overriding
	 */
	public String format() {
		return super.getName()+":"+companyname+":"+jobtitle;
	}
}
