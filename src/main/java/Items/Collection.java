package Items;

import java.util.ArrayList;

public class Collection {

    private ArrayList<Game> gamesList;
    private ArrayList<Console> consolesList;

    public Collection() {

        gamesList = new ArrayList<>();
        consolesList = new ArrayList<>();

    }

    public void add(Game game) {
        gamesList.add(game);
    }

    public void add(Console console) {
        consolesList.add(console);
    }

    public void remove(Game game){
        gamesList.remove(game);
    }

    public void remove(Console console) {
        consolesList.remove(console);
    }

    public ArrayList<Game> getGames() {
        return gamesList;
    }

    public ArrayList<Console> getConsoles() {
        return consolesList;
    }

}
