package sample;

import javafx.scene.image.Image;

class Joker extends Card {


    Joker(){
        this.front =  new Image("/images/joker.png", 200, 300, true, true);
        this.winner = false;
    }
}
