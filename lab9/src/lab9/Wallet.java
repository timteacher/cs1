package lab9;

public class Wallet {
	Card card1;
	Card card2;
	
	/*
	 * Add card needs to set card 1 to the passed object or if card 1 exists set card2 
	 * or do nothing
	 */
	public void addCard(Card c) {
		if (card1==null) {
			card1=c;
		}
		else if(card2==null){
			card2=c;
		}
	}
	
	/*
	 * return a string that looks like [card1|card2] where card1 and card2 are the formatted 
	 *  returns of business/card/etc
	 */
	public String formatCards() {
		return "["+card1.format()+ "|"+card2.format()+"]";
	}
}
