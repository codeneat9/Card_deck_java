# Card Deck Program 🃏

## Project Description
This is a simple **Java-based card deck simulation** that allows users to:
- Create a **deck of 52 playing cards**.
- Shuffle the deck randomly.
- Find a specific card in the deck.
- Deal **5 random cards** from the deck.
- Compare two cards to check if they have the **same rank or suit**.
- Display all the cards in the deck.

# Methods in the prpogram
  ## Card(String rank, String suit)
  - Constructor that initializes a card with a rank and suit.
  ## String getRank()	
  - Returns the rank of the card (e.g., "King", "7").
  ## String getSuit()	
  - Returns the suit of the card (e.g., "Hearts", "Spades").
  ## boolean sameRank(Card otherCard)	
  - Checks if two cards have the same rank.
  ## boolean sameSuit(Card otherCard)
  - Checks if two cards have the same suit.
  ## void printCard()	
  - Prints the card in the format: "Ace of Spades".
    
# Technologies Used
- Java (JDK 8 or above)
- Object-Oriented Programming (OOP) concepts
- Collections Framework (ArrayList)

# Code Structure
## Card.java
- Represents a single playing card
- Contains attributes: rank and suit
- Includes methods to compare ranks and suits

## Deck.java
- Manages a collection of Card objects
- Implements methods for deck operations like shuffling, dealing, and searching

## Main.java
- Provides a console-based menu for user interaction
- Calls methods from Deck and Card classes to execute user commands

# Usage
When you run the program, you will see a menu like this:

<img width="233" alt="image" src="https://github.com/user-attachments/assets/7f4999cf-92ca-4cf5-abb4-3463d46fc82d" />


Choose an option and follow the prompts.

# 📝 Example Output

<img width="215" alt="image" src="https://github.com/user-attachments/assets/648badb0-4c32-4e4d-98b0-bdb5f0a833e9" />




# Author
## Yashwith Behara

