import java.util.ArrayList;

public class MainProg {

	public static ArrayList<Card> decks;
	
	public static void main(String[] args) {
		initDecks();
		shuffleDecks();
	}
	
	public static void initDecks() {
		decks = new ArrayList<Card>();
		String[] suits = new String[]{"Hearts","Spades","Clubs","Diamonds"};
		
		
		for(int i = 0; i < 6; i++) {
			for(int j = 2; j < 15; j++) {
				if(j < 11) {
					for(int k = 0; k < 4; k++)
						decks.add(new Card(suits[k], j+"",j));
				}
				else {
					if(j == 11) {
						for(int k = 0; k < 4; k++)
							decks.add(new Card(suits[k], "Jack",10));
					}
					else if(j == 12) {
						for(int k = 0; k < 4; k++)
							decks.add(new Card(suits[k], "Queen",10));
					}
					else if(j == 13) {
						for(int k = 0; k < 4; k++)
							decks.add(new Card(suits[k], "King",10));
					}
					else {
						for(int k = 0; k < 4; k++)
							decks.add(new Card(suits[k], "Ace",11));
					}
				}
			}
		}
	}
	
	public static void shuffleDecks() {
		ArrayList<Card> newDeck = new ArrayList<Card>();
		while(!decks.isEmpty()) {
			int random = (int) ((Math.random()*decks.size())-1);
			newDeck.add(decks.get(random));
			decks.remove(random);
		}
		
		decks = newDeck;
		for(int i = 0; i < decks.size(); i++) {
			for(int j = i+1; j < decks.size(); j++) {
				if(decks.get(i).equals(decks.get(j))) {
					System.out.println("Doublets!");
				}
			}
		}
	}
}
