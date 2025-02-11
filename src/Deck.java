public class Deck {
    private Card[] deck;

    public Deck() {
        deck = new Card[52];
        int counter = 0;
        for (int suit = 1; suit <= 4; suit++) {
            for (int value = 1; value <= 13; value++) {
                Card card = new Card(value, suit);
                deck[counter] = card;
                counter++;
            }
        }
        shuffle();
    }

    public void shuffle() {
        for (int counter = 0; counter < deck.length; counter++) {
            int i = (int) (Math.random() * deck.length);
            int j = (int) (Math.random() * deck.length);
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public Card drawCard() {
        Card drawnCard = deck[0];
        Card[] newDeck = new Card[deck.length - 1];
        for (int i = 0; i < newDeck.length; i++) {
            newDeck[i] = deck[i + 1];
        }
        deck = newDeck;
        return drawnCard;
    }

    public Card[] getDeck() {
        return deck;
    }

    public String toString() {
        return "Deck of " + deck.length + " cards";
    }
}