package Model;

public interface IGameInformation {
    void generateModel();
    IGameBoard getGameBoard();
    IScoreBoard getScoreBoard();
    ReferenceTile getReferenceTile();
    FirstSheep getFirstSheep();
    NightmareReferenceCard getNightmareReferenceCard();
    IRuleBook getRuleBook();
    Phase[] getPhases();
    Deck[] getDecks();
}
