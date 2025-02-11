import java.util.ArrayList;

public class Hand {
    ArrayList<Card> hand = new ArrayList<Card>();

    public Hand(int handLength, Deck deck) {
        for (int i = 0; i < handLength; i++) {
            hand.add(deck.drawCard());
        }
    }

    public int cardPresent(int value, int suit) {
        for (Card card : hand) {
            if (card.getValue() == value && card.getSuit() == suit) {
                return hand.indexOf(card);
            }
        }
        return -1;
    }

    public Card playCard(int value, int suit) {
        int cardIndex = cardPresent(value, suit);
        if (cardIndex != -1) {
            Card drawnCard = hand.get(cardIndex);
            hand.remove(drawnCard);
            return drawnCard;
        }
        return null;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void printHand() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }

    public void sortHand() {
        for (int i = 0; i < hand.size() - 1; i++) {
            for (int j = 0; j < hand.size() - i - 1; j++) {
                Card temp = hand.get(j + 1);
                Card below = hand.get(j);
                if (below.getValue() > temp.getValue()) {
                    hand.set(j + 1, below);
                    hand.set(j, temp);
                }
            }
        }
    }
}
