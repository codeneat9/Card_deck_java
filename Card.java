class Card {
    String rank;
    String suit;
    public Card(String var1, String var2) {
       this.rank = var1;
       this.suit = var2;
    }
    public String getSuit() {
       return this.suit;
    }
 
    public String getRank() {
       return this.rank;
    }
    public boolean sameRank(Card var1) {
       return this.rank.equals(var1.rank);
    }
 
    public boolean sameSuit(Card var1) {
       return this.suit.equals(var1.suit);
    }
 
