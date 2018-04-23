package rps.game.validators;

import rps.interfaces.RockPaperScissors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class VariantValidator {
    private Random generator = new Random();

    public RockPaperScissors estimateOutcome(RockPaperScissors playerPlayed, ArrayList<RockPaperScissors> allVariants){
        int num = generator.nextInt(99);

        if(num <= 12){
            String strength1 = playerPlayed.getStrength1();
            List<RockPaperScissors> computerVariantList = allVariants.stream()
                    .filter(f -> f.getName().equals(strength1))
                    .collect(Collectors.toList());
            RockPaperScissors computerVariant = computerVariantList.get(0);
            return computerVariant;
        } else if(num > 12 && num <= 24){
            String strength2 = playerPlayed.getStrength2();
            List<RockPaperScissors> computerVariantList = allVariants.stream()
                    .filter(f -> f.getName().equals(strength2))
                    .collect(Collectors.toList());
            RockPaperScissors computerVariant = computerVariantList.get(0);
            return computerVariant;
        } else if(num > 24 && num <= 49){
            String weakness1 = playerPlayed.getWeakness1();
            List<RockPaperScissors> computerVariantList = allVariants.stream()
                    .filter(f -> f.getName().equals(weakness1))
                    .collect(Collectors.toList());
            RockPaperScissors computerVariant = computerVariantList.get(0);
            return computerVariant;
        } else if(num > 48 && num <= 74){
            String weakness2 = playerPlayed.getWeakness2();
            List<RockPaperScissors> computerVariantList = allVariants.stream()
                    .filter(f -> f.getName().equals(weakness2))
                    .collect(Collectors.toList());
            RockPaperScissors computerVariant = computerVariantList.get(0);
            return computerVariant;
        } else {
            return playerPlayed;
        }
    }
}