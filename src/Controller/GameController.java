package Controller;

import java.util.ArrayList;
import View.Viewable;
import Model.GameInformation;
import Model.IRuleBook;
import Model.Phase;
import Model.Deck;
public class GameController implements IGameController {
    private Viewable gameView;
    private ArrayList<Object> controllers;
    private GameInformation gameInformation;
    private IRuleBook rulebook;
    private Phase[] phase;
    private Deck[] deck;

    public String displayRuleBook() { 
     
    }
    private void generateControllers() {}
}
