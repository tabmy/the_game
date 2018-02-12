package sample;

import javafx.scene.image.Image;

public abstract class Card {
    private final Image backside = new Image("/images/backside.png", 200, 300, true, true);

    Image front;
    boolean winner;

    public Image getBackside() {
        return backside;
    }

    public Image getFront() {
        return front;
    }

}
