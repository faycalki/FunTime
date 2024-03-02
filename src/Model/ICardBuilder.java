package Model;

public interface ICardBuilder {
    void build();
    ICardBuilder withMovableDistance(int distance);
    ICardBuilder withWinks(int winks);
    ICardBuilder withCatchableZzz(int zzz);
    ICardBuilder withScareAdjacent(int scare);
    ICardBuilder withMoveToWebToken(int token);
    ICardBuilder withJump(int jump);
    ICardBuilder withDescription(String description);
}
