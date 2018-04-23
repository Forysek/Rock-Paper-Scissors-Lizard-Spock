package rps.participants;

import java.util.Scanner;

public class UserCreator {
    private String playerName;

    public void greetUser(){
        Scanner playerInput = new Scanner(System.in);
        System.out.println("Welcome to 'Rock-Paper-Scissors-Lizard-Spock'. Ready to lose with me?");
        System.out.println("What's your name?");

        playerName = playerInput.nextLine();
        if(playerName.equals("")){
            playerName = "Stranger";
        }
    }

    public String getPlayerName(){
        return playerName;
    }
}
