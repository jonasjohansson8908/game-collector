import Items.Game;
import Items.Properties.Platform;
import Items.Properties.Region;

import java.time.LocalDate;

public class GameCollector {

    public static void main(String[] args) {
        System.out.println("Welcome to Game Collector!");

        Game castlevania = new Game.Builder("Castlevania", Platform.NES)
                .genre("Platform")
                .description("Stairs are soooo hard")
                .purchasePrice(200.0)
                .region(Region.NTSC_US)
                .completed(true)
                .build();

        System.out.println("Title: " + castlevania.getTitle());
        System.out.println("Description: " + castlevania.getDescription());
        System.out.println("price: " + castlevania.getPurchasePrice());
        System.out.println("region: " + castlevania.getRegion().toString());
        System.out.println("completed: " + castlevania.getCompleted());

        System.exit(1);
    }
}
