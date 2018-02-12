package sample;

import java.util.Random;

public class Game {

    private Card[] cards;
    private Random random;
    private Joker joker;
    private Club2 club2;


    public Game(){
        cards = new Card[4];
        joker = new Joker();
        club2 = new Club2();
        random = new Random();

        newGame();
    }

    public void newGame(){
        for (int i = 0; i < cards.length; i++) {
            cards[i] = joker;
        }
        cards[random.nextInt(4)] = club2;
    }

    public Card getCard(int x){
        if (x < 0 || x > cards.length) throw new IllegalArgumentException("Illegal input. Must be between 0 and " + cards.length);
        return cards[x];
    }
}
