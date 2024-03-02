package Model;

import java.util.ArrayList;

public interface IGameBoard {
    void updateController();
    ArrayList<Token>[] getBoard();
}
