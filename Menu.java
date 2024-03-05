package assignment4;
import java.util.*;

public class Menu {
	private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Print Deck");
        System.out.println("2. Sort Deck");
        System.out.println("3. Find a Card");
        System.out.println("4. Deal Cards");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public void processChoice(Vector<Card> deck, Card card) {
        Card cardOperations = new Card();

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Printing Deck:");
                    cardOperations.printDeck(deck);
                    break;
                case 2:
                    System.out.println("Sorting Deck:");
                    cardOperations.sortCard(deck);
                    cardOperations.printDeck(deck);
                    break;
                case 3:
                    System.out.println("Enter card rank (1-13): ");
                    int rank = scanner.nextInt();
                    System.out.println("Enter card suit (1-4): ");
                    int suit = scanner.nextInt();
                    Card findCard = new Card(rank, suit);
                    cardOperations.findCard(deck, findCard);
                    break;
                case 4:
                    System.out.println("Enter number of cards to deal: ");
                    int num = scanner.nextInt();
                    cardOperations.dealCards(deck, num);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}


