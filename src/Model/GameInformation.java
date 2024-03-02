package Model;

public class GameInformation implements IGameInformation {
    private GameController gameController;
    private IGameBoard gameBoard;
    private IScoreBoard scoreBoard;
    private ReferenceTile referenceTile;
    private FirstSheep firstSheep;
    private NightmareReferenceCard referenceCard;
    private IRuleBook rulebook;
    private Phase[] phase;
    private Deck[] deck;
}
