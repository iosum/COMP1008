package week3;

import java.util.Arrays;
import java.util.List;

public class Card {
    // suits, faceName, faceValue
    private String suit;
    private String faceName;
    private int faceValue;

    public Card(String suit, String faceName) {
        setSuit(suit);
        setFaceName(faceName);
    }

    public String getSuit() {
        return suit;
    }

    /**
     * This method will return a valid suit
     * @return
     */

    public static List getValidSuit() {
        return Arrays.asList("diamond", "hearts","club","spades");
    }

    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        List validSuit = getValidSuit();
        if(validSuit.contains(suit)) {
            this.suit = suit;
        }
        else {
            throw new IllegalArgumentException("suits must be diamond, hearts, clubs or spades");
        }

    }

    public String getFaceName() {
        return faceName;
    }


    /**
     * This method will get a valid face name
     */

    public static List getValidFaceName() {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }

    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
        List validFaceName = getValidFaceName();
        if(validFaceName.contains(faceName)) {
            this.faceName = faceName;
        }
        else {
            throw new IllegalArgumentException("face name must be 2,3,4,5,6,7,8,9,10,jack,queen,king, ace");
        }

    }



    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        List validFaceName = getValidFaceName();
        this.faceValue = validFaceName.indexOf(faceName) + 2;
    }

    public String toString() {
        return String.format("%s of %s", getFaceName(),getSuit());
    }
}
