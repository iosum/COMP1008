package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCard {
    private ArrayList<Card> deck;

    public DeckOfCard(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public DeckOfCard() {
        List<String> faceNames = Card.getValidFaceName();
        List<String> suits = Card.getValidSuit();

        deck = new ArrayList<>();

        for(String suit: suits) {
            for(String faceName: faceNames) {
                deck.add(new Card(suit, faceName));
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Card dealTopCard() {
        if(deck.size() > 0) {
            return deck.remove(0);
        }
        else {
            return null;
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }
}
