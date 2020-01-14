package week2;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public DeckOfCards() {
        deck = new ArrayList<>();

        List<String> faceNames = Card.getAllFaceNames();
        List<String> suits = Card.getValidSuits();

        for(String suit: suits) {
            for(String faceName: faceNames) {
                deck.add(new Card(faceName, suit));
            }
        }
    }

    /**
     * this method will display the deck to the console
     */
    public void displayDeck() {
        for(Card card: deck) {
            System.out.println(card);
        }
    }
}
