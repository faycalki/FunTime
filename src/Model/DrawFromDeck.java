package Model;

import java.util.Random;

public class DrawFromDeck<T> implements Drawable<T> {
    private Deck<T> deck;
    private Random rand;
}
