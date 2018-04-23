package rps.game.variants;

import rps.interfaces.RockPaperScissors;

import java.util.ArrayList;

public class VariantsContainer{
    private final ArrayList<RockPaperScissors> allVariants = new ArrayList<>();

    public VariantsContainer addVariantToArray(RockPaperScissors variant){
        allVariants.add(variant);
        return this;
    }

    public ArrayList<RockPaperScissors> getAllVariants(){
        return allVariants;
    }
}
