package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    public Canvas canvas;
    private GraphicsContext gc;

    private Game game;

    boolean front;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        gc = canvas.getGraphicsContext2D();
        canvas.setOnMouseClicked(this::mouseInput);
        game = new Game();

        front = false;
        draw();
    }

    @FXML
    public void mouseInput(MouseEvent event){

            draw();

    }

    public void draw(){
        if (front){
            drawFronts();
            game.newGame();
        }
        else
            drawBacksides();
        for (int i = 0; i < 4; i++) {
            gc.strokeLine(250 * i, canvas.getHeight(), 250*i, 0);
        }
        front = !front;
    }

    private void drawBacksides(){
        for (int i = 0; i < 4 ; i++) {
            //gc.drawImage(joker.getFront(), 20 + 250*i, 50);
            gc.drawImage(game.getCard(i).getBackside(), 20+250*i, 50);
        }
    }

    private void drawFronts(){
        for (int i = 0; i < 4 ; i++) {
            gc.drawImage(game.getCard(i).getFront(), 20+250*i, 50);
        }
    }
}
