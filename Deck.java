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
