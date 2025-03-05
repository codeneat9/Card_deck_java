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
    public void compareCard(Card card1, Card card2) {
        if (card1.sameRank(card2)) {
            System.out.println("The cards have the same rank.");
        } else {
            System.out.println("The cards have different ranks.");
        }
    }
    public void sameCard(Card card1, Card card2) {
        if (card1.sameSuit(card2)) {
            System.out.println(" The cards are from the same suit.");
        } else {
            System.out.println(" The cards are from different suits.");
        }
    }
    // Deal 5 Random Cards
    public void dealCard() {
        if (deck.size() < 5) {
            System.out.println("Deck Empty!");
            return;
        }

        System.out.println("Dealing 5 random cards:");
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            Card card = deck.get(rand.nextInt(deck.size()));
            card.printCard();
        }
    }
