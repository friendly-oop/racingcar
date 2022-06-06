package racingcar;

public class Game {
    private int count;

    private Game() {
    }

    public static Game of(int gameCount) {
        Game game = new Game();
        game.count = gameCount;
        return game;
    }
}
