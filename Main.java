import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deck deck = new Deck();
        deck.createDeck();
        int choice;
        do {
            // Display Menu
            System.out.println("\nCard Deck :");
            System.out.println("1. Show Deck");
            System.out.println("2. Find a Card");
            System.out.println("3. Give 5 Random Cards");
            System.out.println("4. Shuffle the Deck");
            System.out.println("5. Compare Two Cards (Same Rank)");
            System.out.println("6. Check if Two Cards Have Same Suit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline
