package rps.game.processors;

public class GameFinisher {
    private GameProcessor gameProcessor;

    public GameFinisher(GameProcessor gameProcessor){
        this.gameProcessor = gameProcessor;
    }

    public void finishGame(){
        if(gameProcessor.getPlayerScore() > gameProcessor.getComputerScore()){
            System.out.println("Congratulations, you've bested me " + gameProcessor.getPlayerScore() +
                    " to " + gameProcessor.getComputerScore() + "!");
        } else {
            System.out.println("I've won " + gameProcessor.getComputerScore() + " to " +
                            gameProcessor.getPlayerScore() + ". Told you so!");
        }

    }
}
