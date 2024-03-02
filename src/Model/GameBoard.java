package Model;

import java.util.ArrayList;

public class GameBoard implements IGameBoard {
    private int SIZE;
    private DreamTile[] dreamTilesArray;
    private Deck cardDeck;
    private Deck dreamTileDeck;
    private ArrayList<Token>[] boardArray;
}
