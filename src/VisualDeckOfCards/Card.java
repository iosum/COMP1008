package VisualDeckOfCards;

import java.util.Arrays;
import java.util.List;

public class Card {
    private String suit;
    private String faceName;
    private int faceValue;

    public Card(String faceName, String suit) {
        setSuit(suit);
        setFaceName(faceName);
    }

    public String getSuit() {
        return suit;
    }

    /**
     * this method will return a list of valid suit options for a Card Object
     *
     * @return
     */

    public static List<String> getValidSuits() {
        return Arrays.asList("hearts", "diamonds", "spades", "clubs");
    }



    /**
     * this method will validate that argument is hearts, spades or club and set the instance variables
     *
     * @param suit hearts, diamonds, spades, clubs
     */
    public void setSuit(String suit) {
        List validSuits = getValidSuits();
        suit = suit.toLowerCase();
        // suit = suit.toUpperCase();

        if (validSuits.contains(suit)) {
            this.suit = suit;
        } else {
            throw new IllegalArgumentException("Valid suits are hearts, diamonds, clubs or spades");
        }
    }

    public String getFaceName() {
        return faceName;
    }

    /**
     * This method will validate the faceName and set the instance varible
     *
     * @param faceName 2,3,4,5,6,7,8,9,10,jack,queen,king,ace
     */

    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
        List validFaceNames = getAllFaceNames();
        if (validFaceNames.contains(faceName)) {
            this.faceName = faceName;
        } else {
            throw new IllegalArgumentException("Face name must be 2,3,4,5,6,7,8,9,10,jack,queen,king,ace");
        }
    }

    public static List getAllFaceNames() {
        return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace");
    }




    public int getFaceValue() {
        return faceValue;
    }

    /**
     * @param faceValue
     */

    public void setFaceValue(int faceValue) {
        List validFaceNames = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace");
        this.faceValue = validFaceNames.indexOf(faceName) + 2;
    }

    public String toString() {
        return String.format("%s of %s", faceName, suit);
    }
}
