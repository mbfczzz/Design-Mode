package test.Design01;

/**
 * @author gudeixin
 * @description:
 * @date 2022-11-12 21:52
 */
public class PlayGameStarage implements PlayGame{

    private PlayGame playGame;

    @Override
    public void playGame() {
        if (playGame == null){
            System.out.println("对象为空!");
        }
        playGame.playGame();
    }

    public PlayGameStarage(PlayGame playGame){
        this.playGame = playGame;
    }

    public static void main(String[] args) {
        new PlayGameStarage(new GaoPlay()).playGame();
    }

}
