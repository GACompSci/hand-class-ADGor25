public class App {
    public static void main(String[] args) throws Exception {
        
        // Deck Assignment:
        Deck deck = new Deck();
        // System.out.println(deck.drawCard());
        // System.out.println(deck.drawCard());
        // System.out.println(deck);


        // Hand Assignment:
        Hand hand = new Hand(3, deck);

        System.out.println("Original Hand:");
        hand.printHand();
        System.out.println("");

        System.out.println("Sorted Hand:");
        hand.sortHand();
        hand.printHand();
        System.out.println("");

        System.out.println("Adding a Card:");
        hand.addCard(new Card(3,2));
        hand.printHand();
        System.out.println("");

        System.out.println("Removing that Card:");
        hand.playCard(3, 2);
        hand.printHand();

    }
}