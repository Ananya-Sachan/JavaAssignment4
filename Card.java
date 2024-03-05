package assignment4;
import java.util.*;

public class Card {
	   private int rank;
	    private int suit;

	    public Card() {
	    }

	    public Card(int rank, int suit) {
	        this.rank = rank;
	        this.suit = suit;
	    }

	    public void setRank(int rank) {
	        this.rank = rank;
	    }

	    public void setSuit(int suit) {
	        this.suit = suit;
	    }

	    public int getRank() {
	        return this.rank;
	    }

	    public int getSuit() {
	        return this.suit;
	    }

	    public void createDeck(Vector<Card> deck) {
	        for (int suit = 1; suit <= 4; suit++) {
	            for (int rank = 1; rank <= 13; rank++) {
	                Card card = new Card(rank, suit);
	                deck.add(card);
	            }
	        }
	    }

	    public void printCard(Card card) {
	        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

	        System.out.println(ranks[card.getRank() - 1] + " of " + suits[card.getSuit() - 1]);
	    }

	    public void printDeck(Vector<Card> deck) {
	        for (Card card : deck) {
	            printCard(card);
	        }
	    }

	    public boolean sameCard(Card card1, Card card2) {
	        return (card1.getRank() == card2.getRank() && card1.getSuit() == card2.getSuit());
	    }

	    public int compareCard(Card card1, Card card2) {
	        if (card1.getRank() == card2.getRank()) {
	            return Integer.compare(card1.getSuit(), card2.getSuit());
	        }
	        return Integer.compare(card1.getRank(), card2.getRank());
	    }

	    public void sortCard(Vector<Card> deck) {
	        Collections.sort(deck, new Comparator<Card>() {
	            @Override
	            public int compare(Card card1, Card card2) {
	                return compareCard(card1, card2);
	            }
	        });
	    }

	    public void findCard(Vector<Card> deck, Card card) {
	        boolean found = false;
	        for (Card c : deck) {
	            if (sameCard(c, card)) {
	                System.out.println("Card found: " + card);
	                found = true;
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Card not found: " + card);
	        }
	    }

	    public void dealCards(Vector<Card> deck, int num) {
	        Random rand = new Random();
	        System.out.println("Dealing " + num + " cards:");
	        for (int i = 0; i < num; i++) {
	            int index = rand.nextInt(deck.size());
	            Card card = deck.remove(index);
	            printCard(card);
	        }
	    }
	}

