package VisualDeckOfCards;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class DeckViewController implements Initializable {
    @FXML private Button nextCardButton;
    @FXML private ImageView deckImageView;
    @FXML private ImageView activeCardImageView;
    private DeckOfCards deck;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        deck = new DeckOfCards();
        deck.shuffle();
        deckImageView.setImage(deck.getBeckOfCardImage());
    }

    @FXML public void nextCardButtonPushed () {
        activeCardImageView.setImage(deck.dealTopCard().getImage());
    }
}
