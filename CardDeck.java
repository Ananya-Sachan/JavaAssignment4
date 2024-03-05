package assignment4;
import java.util.*;

public class CardDeck {
	public static void main(String[] args) {
        Vector<Card> deck = new Vector<>();
        Card card = new Card();
        card.createDeck(deck);

        Menu menu = new Menu();
        menu.processChoice(deck, card);
    }

}
