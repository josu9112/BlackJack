
public class Card {

	public String symbol;
	public String cardValue;
	public int blackJackValue;
	
	public Card(String symbol, String cardValue, int blackJackValue) {
		this.symbol = symbol;
		this.cardValue = cardValue;
		this.blackJackValue = blackJackValue;
	}
	
	public int getBlackJackValue() {
		return blackJackValue;
	}
	
	public void setBlackJackValue(int blackJackValue) {
		this.blackJackValue = blackJackValue;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public String getCardValue() {
		return cardValue;
	}
	
}
