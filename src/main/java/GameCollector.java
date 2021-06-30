import Items.Collection;
import Items.Game;
import Items.Properties.Platform;
import Items.Properties.Region;

import java.time.LocalDate;

public class GameCollector {

    public static void main(String[] args) {
        System.out.println("Welcome to Game Collector!");

        Game castlevania = new Game.Builder("Castlevania", Platform.NES)
                .genre("Whipping platformer")
                .description("Stairs are soooo hard")
                .purchasePrice(200.0)
                .purchaseDate(LocalDate.now())
                .region(Region.NTSC_US)
                .completed(true)
                .build();

        Game mario = new Game.Builder("Mario World", Platform.SNES)
                .genre("Platformer")
                .description("Yoshi!")
                .purchasePrice(100.0)
                .purchaseDate(LocalDate.of(2005, 2, 14))
                .region(Region.NTSC_US)
                .completed(true)
                .build();

        Collection collection = new Collection();
        collection.add(castlevania);
        collection.add(mario);

        for (Game game : collection.getGames()){

            System.out.println("\nTitle:       " + game.getTitle());
            System.out.println("Description: " + game.getDescription());
            System.out.println("genre:       " + game.getGenre());
            System.out.println("console:     " + game.getPlatform());
            System.out.println("price:       " + game.getPurchasePrice() + " SEK");
            System.out.println("bought:      " + game.getPurchaseDate());
            System.out.println("region:      " + game.getRegion().toString());
            System.out.println("completed:   " + game.isCompleted());
        }



        System.exit(1);
    }
}
