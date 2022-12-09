package chapter2;

public class TrimIt {
	//complete the following program so that it prints the message "abcdefghi"
	public static void main(String[] args) {
		String s1 = "       abc   ";
		String s2 = "    def";
		String s3 = "ghi      ";
		String ex = new String("Abc");
		
		// write some code here that gets the desired string from s1-3
		// and stores it in String object 
		
		
		String total = s1+s2+s3;
		// method using Character.isWhitespace method.
		String trimmed = "";
		for (int i=0; i<total.length() ; i++) {
			if (Character.isWhitespace(total.charAt(i))) {
				continue;
			}
			else {
				trimmed+=total.charAt(i);
			}
		}
		System.out.println(trimmed);
		
		//method using String.replaceAll() method
		total = total.replaceAll("\\s", "");
		System.out.println(total);
		
		
	}

}
