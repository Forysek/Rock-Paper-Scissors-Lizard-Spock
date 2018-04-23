package rps;

import rps.game.processors.GameFinisher;
import rps.game.processors.GamePreparer;
import rps.game.processors.GameProcessor;
import rps.participants.UserCreator;

import java.util.InputMismatchException;

public class MainRPS {

    public static void main(String args[]){
        UserCreator userCreator = new UserCreator();
        userCreator.greetUser();
        GamePreparer gamePreparer = new GamePreparer();
        GameProcessor gameProcessor = new GameProcessor(gamePreparer, userCreator);
        try{
            System.out.println("Hi " + userCreator.getPlayerName() + ". Until how many winning rounds do you want to play?");
            gamePreparer.prepareGame(userCreator);
        } catch(InputMismatchException e){
            System.out.println("Jokes aside, we need a number of rounds to play. Pick a positive number, starting from 1.");
            gamePreparer.prepareGame(userCreator);
        }

        gameProcessor.gameProcess();
        GameFinisher gameFinisher = new GameFinisher(gameProcessor);
        gameFinisher.finishGame();



    }
}

