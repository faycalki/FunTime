package Model;

public class NightmareCard extends Card {
    private boolean jump;
    private boolean walk;
    private boolean scareAdjacent;
    private boolean moveToWebToken;

    public boolean getJump() { return jump; }
    public boolean getWalk() { return walk; }
    public boolean getScareAdjacent() { return scareAdjacent; }
    public boolean getMoveToWebToken() { return moveToWebToken; }
}
