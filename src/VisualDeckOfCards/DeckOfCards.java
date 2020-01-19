package VisualDeckOfCards;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;
    private Image beckOfCardImage;


    /**
     * this is a argument constructor that passes in a collection of card object
     * @param deck
     */

    public DeckOfCards(ArrayList<Card> deck) {
        this.deck = deck;
        beckOfCardImage = new Image("./images/back_of_card.png");
    }

    /**
     * this is a 0 argument constructor that will build a full deck of cards
     */

    public DeckOfCards() {

        // a list of face names we want to create
        // this is calling a static method so we can access it using class name, Card
        List<String> faceNames = Card.getAllFaceNames();
        // a list of full suits that we want to create
        List<String> suits = Card.getValidSuits();

        // create an ArrayList to hold the Card objects
        deck = new ArrayList<Card>();

        // loop through the suit and facenames to create
        for(String suit: suits) {
            for(String faceName: faceNames) {
                deck.add(new Card(faceName, suit));
            }
        }
        beckOfCardImage = new Image("./VisualDeckOfCards/images/back_of_card.png");
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Image getBeckOfCardImage() {
        return beckOfCardImage;
    }

    public void setBeckOfCardImage(Image beckOfCardImage) {
        this.beckOfCardImage = beckOfCardImage;
    }

    /**
     * this method will deal with the top card off the deck
     */
    public Card dealTopCard() {
        // check if the deck is empty
        if(deck.size() > 0) {
            return deck.remove(0);
        }
        else {
            return null;
        }
    }

    /**
     * this method will shuffle the deck of cards
     */
    public void shuffle() {
        Collections.shuffle(deck);
    }



    /**
     * this method will display the deck to the console
     */
//    public void displayDeck() {
//        for(Card card: deck) {
//            System.out.println(card);
//        }
//    }
}
