public class Card {
    
    // Attributes:
    private int value; // Card value (1-13, 0 for Joker)
    private int suit;  // Card suit (1-4, 0 for Joker)
    private String name; // Printable name for the card

    // Default constructor: (creates a Joker)
    public Card() {
        this.value = 0;
        this.suit = 0;
        this.name = "Joker";
    }

    // Constructor with value and suit parameters:
    public Card(int value, int suit) {
        this.value = (value >= 0 && value <= 13) ? value : 0; // Ensures valid value
        this.suit = (suit >= 0 && suit <= 4) ? suit : 0; // Ensures valid value
        this.name = generateName(this.value, this.suit); // Calls the method that generates the card's name
    }

    // Method to generate a card's name based on its value and suit
    private String generateName(int value, int suit) {
        if (value == 0 || suit == 0) {
            return "Joker";
        }

        String valueName = "";
        String suitName = "";

        // Determine card value name
        if (value == 1) {
            valueName = "Ace";
        } else if (value >= 2 && value <= 10) {
            valueName = String.valueOf(value);
        } else if (value == 11) {
            valueName = "Jack";
        } else if (value == 12) {
            valueName = "Queen";
        } else if (value == 13) {
            valueName = "King";
        }

        // Determine card suit name
        if (suit == 1) {
            suitName = "Diamonds";
        } else if (suit == 2) {
            suitName = "Clubs";
        } else if (suit == 3) {
            suitName = "Spades";
        } else if (suit == 4) {
            suitName = "Hearts";
        }

        return valueName + " of " + suitName;
    }

    // Gets Card Value
    public int getValue() {
        return value;
    }

    // Gets Card Suit
    public int getSuit() {
        return suit;
    }

    // Sets Value Attribute
    public void setVal(int value) {
        this.value = (value >= 0 && value <= 13) ? value : this.value; // Ensure valid value
        this.name = generateName(this.value, this.suit); // Update name after changing value
    }

    // Returns Card Name
    @Override
    public String toString() {
        return name;
    }
}