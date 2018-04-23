package rps.game.validators;

import rps.interfaces.RockPaperScissors;

public class WinnerValidator {

    public String declareFightWinner(RockPaperScissors userVariant, RockPaperScissors computerVariant){
        if(computerVariant.getName().equals(userVariant.getStrength1()) || computerVariant.getName().equals(userVariant.getStrength2())){
            System.out.println("You've played " + userVariant.getName() + " whilst I've played " + computerVariant.getName());
            computerVariant.finishLine(userVariant.getName());
            System.out.println("Point for you");
            return "player";
        } else if(computerVariant.getName().equals(userVariant.getWeakness1()) || computerVariant.getName().equals(userVariant.getWeakness2())){
            System.out.println("You've played " + userVariant.getName() + " whilst I've played " + computerVariant.getName());
            userVariant.finishLine(computerVariant.getName());
            System.out.println("Point for me");
            return "computer";
        } else {
            System.out.println("Draw!");
            userVariant.finishLine(computerVariant.getName());
            return "draw";
        }
    }

}
