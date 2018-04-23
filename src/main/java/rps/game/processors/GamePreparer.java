package rps.game.processors;

import rps.participants.UserCreator;

import java.util.Scanner;

public class GamePreparer {
    private int numberOfWinningRounds;

    public int getNumberOfWinningRounds(){
        return numberOfWinningRounds;
    }

    public void setNumberOfWinningRounds(int numberOfWinningRounds){
        this.numberOfWinningRounds = numberOfWinningRounds;
    }

    public void prepareGame(UserCreator userCreator) {
        Scanner playerInput = new Scanner(System.in);

        while(numberOfWinningRounds == 0){
            numberOfWinningRounds = playerInput.nextInt();
        }
        System.out.println("Ok, setting up the game to " + numberOfWinningRounds + " wins.");
        System.out.println("While we're at it: you'd like to know how to play, huh?\n" +
                "Press 1 if you'd like to play rock;\n" +
                "Press 2 if you'd like to play paper;\n" +
                "Press 3 if you'd like to play scissors;\n" +
                "Press 4 if you'd like to play lizard;\n" +
                "Press 5 if you'd like to play Spock.\n");
        System.out.println("Press n for new game;\n" +
                "Press x to quit the game.\n");

    }
}
