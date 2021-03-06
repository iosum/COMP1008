package week2;

import javafx.scene.image.Image;

import java.util.ArrayList;
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
        beckOfCardImage = new Image("./images/backOfCard.png");
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
        deck = new ArrayList<>();

        // loop through the suit and facenames to create
        for(String suit: suits) {
            for(String faceName: faceNames) {
                deck.add(new Card(faceName, suit));
            }
        }
        beckOfCardImage = new Image("./images/backOfCard.png");
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
     * this method will display the deck to the console
     */
    public void displayDeck() {
        for(Card card: deck) {
            System.out.println(card);
        }
    }
}
