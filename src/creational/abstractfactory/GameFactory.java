package creational.abstractfactory;

interface GameFactory {

    Level createLevel();
    Arena createArena();

}

class GameFactoryEasy implements GameFactory {

    @Override
    public Level createLevel() {
        return new LevelEasy();
    }

    @Override
    public Arena createArena() {
        return new ArenaEasy();
    }
}


class GameFactoryMedium implements GameFactory {

    @Override
    public Level createLevel() {
        return new LevelMedium();
    }

    @Override
    public Arena createArena() {
        return new ArenaMedium();
    }
}

class GameFactoryHard implements GameFactory {

    @Override
    public Level createLevel() {
        return new LevelHard();
    }

    @Override
    public Arena createArena() {
        return new ArenaHard();
    }
}