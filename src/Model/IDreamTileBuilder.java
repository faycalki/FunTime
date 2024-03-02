package Model;

import java.util.ArrayList;

public interface IDreamTileBuilder {
    void build();
    IDreamTileBuilder withInitialZzzsRequired(int zzz);
    IDreamTileBuilder withTokens(ArrayList<IZzzToken> tokens);
}
