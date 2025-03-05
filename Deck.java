import java.util.*;
// Deck Class
class Deck {
    ArrayList<Card> deck;
    Random random;
    //Constructor
    public Deck() {
        deck = new ArrayList<>();
        random = new Random();  
    }
    public void createDeck() {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "K", "Q", "A"};
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        for (String rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(rank, suit));
            }
        }
    }
    public void printDeck() {
        for (Card card : deck) {
            card.printCard();
        }
    }
    public void findCard(String suit, String rank) {
        for (Card card : deck) {
            if (card.getSuit().equalsIgnoreCase(suit) && card.getRank().equalsIgnoreCase(rank)) {
                System.out.println("Card found: " + rank + " of " + suit);
                return;
            }
        }
        System.out.println("Card not there!");
    }
    public void shuffleDeck() {
        Collections.shuffle(deck);
        System.out.println("Deck shuffled successfully.");
    }
