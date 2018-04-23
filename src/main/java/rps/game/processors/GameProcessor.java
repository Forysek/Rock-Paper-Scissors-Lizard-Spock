package rps.game.processors;

import rps.game.validators.VariantValidator;
import rps.game.validators.WinnerValidator;
import rps.game.variants.VariantsContainer;
import rps.game.variants.VariantsFiller;
import rps.interfaces.RockPaperScissors;
import rps.participants.ComputerPlayer;
import rps.participants.UserCreator;

import java.util.ArrayList;
import java.util.Scanner;

public class GameProcessor {
    private GamePreparer gamePreparer;
    private UserCreator userCreator;
    private int playerScore = 0;
    private int computerScore = 0;


    public GameProcessor(GamePreparer gamePreparer, UserCreator userCreator){
        this.gamePreparer = gamePreparer;
        this.userCreator = userCreator;
    }

    public int getPlayerScore(){
        return playerScore;
    }

    public int getComputerScore(){
        return computerScore;
    }

    public GameProcessor gameProcess(){
        Scanner playerInput = new Scanner(System.in);
        VariantsContainer variantsContainer = new VariantsFiller().FillGameWithVariants();
        ArrayList<RockPaperScissors> allVariants = variantsContainer.getAllVariants();
        ComputerPlayer computer = new ComputerPlayer("The Almighty Machine");

        VariantValidator variantValidator = new VariantValidator();
        WinnerValidator winnerValidator = new WinnerValidator();


        while(playerScore < gamePreparer.getNumberOfWinningRounds() && computerScore < gamePreparer.getNumberOfWinningRounds()){
            System.out.println("What number do you want to play?");
            String playerTextRoundStart = playerInput.nextLine();

            if(playerTextRoundStart.equals("n")){
                System.out.println("Wanna start new game? (y/n)");
                String playerTextNewGameConfirmation = playerInput.next();
                if(playerTextNewGameConfirmation.equals("y")){
                    System.out.println("For how many winning rounds?");
                    gamePreparer.setNumberOfWinningRounds(playerInput.nextInt());
                    System.out.println("Ok, setting up the game to " + gamePreparer.getNumberOfWinningRounds() + " wins.");
                } else if(playerTextNewGameConfirmation.equals("n")){
                    continue;
                }
            } else if(playerTextRoundStart.equals("x")){
                System.out.println("Oh, quitting already? Was fun though. Type x again, to quit");
                String playerTextExitConfirmation = playerInput.next();
                if(playerTextExitConfirmation.equals("x")){
                    break;
                }
            } else if(playerTextRoundStart.equals("1") || (playerTextRoundStart.equals("2")) || (playerTextRoundStart.equals("3")) ||
                    (playerTextRoundStart.equals("4")) || (playerTextRoundStart.equals("5"))){
                int variantChoice = Integer.parseInt(playerTextRoundStart);
                while(variantChoice > 5){
                    System.out.println("Pick a number from 1 to 5, please.");
                }
                RockPaperScissors playerPlayed = allVariants.get(variantChoice - 1);
                RockPaperScissors computerPlayed = variantValidator.estimateOutcome(playerPlayed, allVariants);
                String winner = winnerValidator.declareFightWinner(playerPlayed, computerPlayed);
                if(winner.equals("computer")){
                    computerScore++;
                } else if (winner.equals("player")){
                    playerScore++;
                } else {
                    continue;
                }

                System.out.println("Score: " + userCreator.getPlayerName() + " " + playerScore + ": " + computerScore + " " + computer.getComputerName());
            } else {
                System.out.println("Pick a number from 1 to 5, please, n for new game, x to exit. Don't play with me *wink* ;)");
            }
        }
        return this;
    }
}