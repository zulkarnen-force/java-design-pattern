package creational.abstractfactory;

public class Game {

    private Level level;
    private Arena arena;

    public Game(GameFactory gameFactory) {
        this.level = gameFactory.createLevel();
        this.arena = gameFactory.createArena();
    }

    public void start(){
        this.level.start();
        this.arena.start();
    }
    
}
