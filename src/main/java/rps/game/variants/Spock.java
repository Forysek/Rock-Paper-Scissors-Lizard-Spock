package rps.game.variants;

import rps.interfaces.RockPaperScissors;

public class Spock implements RockPaperScissors{
    private final String name;
    private final String strength1;
    private final String strength2;
    private final String weakness1;
    private final String weakness2;

    public Spock(final String name, final String strength1, final String strength2, final String weakness1,
                final String weakness2){
        this.name = name;
        this.strength1 = strength1;
        this.strength2 = strength2;
        this.weakness1 = weakness1;
        this.weakness2 = weakness2;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getStrength1(){
        return strength1;
    }

    @Override
    public String getStrength2(){
        return strength2;
    }

    @Override
    public String getWeakness1(){
        return weakness1;
    }

    @Override
    public String getWeakness2(){
        return weakness2;
    }

    @Override
    public void finishLine(String winningVariant){
        if(winningVariant.equals("Lizard")){
            System.out.println("Lizard poisons Spock.");
        } else if(winningVariant.equals("Paper")){
            System.out.println("Paper disproves Spock.");
        } else {
            System.out.println("Two Spocks meet!");
        }

    }
}
