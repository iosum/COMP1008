package VisualDeckOfCards;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class DeckViewController implements Initializable {
    @FXML private ImageView deckImageView;
    @FXML private ImageView activeCardImageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        DeckOfCards deck = new DeckOfCards();
        deckImageView.setImage(deck.getBeckOfCardImage());
    }
}
