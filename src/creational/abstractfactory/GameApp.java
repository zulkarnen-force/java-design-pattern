    package creational.abstractfactory;

    public class GameApp {

        public static void main(String[] args) {
            
            Game gameEasy =  new Game(new GameFactoryEasy());
            gameEasy.start();

            Game gameMedium =  new Game(new GameFactoryMedium());
            gameMedium.start();

        }
        
    }
