package Items;

import java.util.ArrayList;

public class Collection {

    private final ArrayList<Game> gamesList;
    private final ArrayList<GameConsole> consolesList;

    public Collection() {
        gamesList = new ArrayList<>();
        consolesList = new ArrayList<>();
    }

    public void add(Game game) {
        gamesList.add(game);
    }

    public void add(GameConsole gameConsole) {
        consolesList.add(gameConsole);
    }

    public void remove(Game game){
        gamesList.remove(game);
    }

    public void remove(GameConsole gameConsole) {
        consolesList.remove(gameConsole);
    }

    public ArrayList<Game> getGames() {
        return gamesList;
    }

    public ArrayList<GameConsole> getConsoles() {
        return consolesList;
    }

}
