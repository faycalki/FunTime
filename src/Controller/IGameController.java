package Controller;

import View.Viewable;

public interface IGameController {
    void initializeGame();
    void displayGameView();
    void displayRuleBook();
    void addViewToGameView(Viewable view);
}
