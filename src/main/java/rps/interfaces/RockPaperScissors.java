package rps.interfaces;

public interface RockPaperScissors{

    String getName();
    String getStrength1();
    String getStrength2();
    String getWeakness1();
    String getWeakness2();

    void finishLine(String winningVariant);
}
