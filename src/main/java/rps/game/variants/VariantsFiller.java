package rps.game.variants;

public class VariantsFiller {

    public VariantsContainer FillGameWithVariants(){
        Rock rock = new Rock("Rock","Lizard", "Scissors", "Paper", "Spock");
        Paper paper = new Paper("Paper","Rock", "Spock", "Scissors", "Lizard");
        Scissors scissors = new Scissors("Scissors","Paper", "Lizard", "Spock", "Rock");
        Lizard lizard = new Lizard("Lizard","Spock", "Paper", "Rock", "Scissors");
        Spock spock = new Spock("Spock", "Scissors", "Rock", "Lizard", "Paper");

        VariantsContainer variantsContainer = new VariantsContainer();
        variantsContainer.addVariantToArray(rock)
                .addVariantToArray(paper)
                .addVariantToArray(scissors)
                .addVariantToArray(lizard)
                .addVariantToArray(spock);

        return variantsContainer;
    }
}
