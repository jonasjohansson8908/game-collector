package test.java.Items;

import Items.Collection;
import Items.Game;
import Items.Properties.Platform;
import org.junit.jupiter.api.*;

public class GameTest {

    @Test
    void testTitleBuilder() {
        Collection collection = new Collection();
        Game castlevania = new Game.Builder("Castlevania: Rondo of Blood", Platform.PC_ENGINE).build();
        collection.add(castlevania);

        Assertions.assertSame("Castlevania: Rondo of Blood", collection.getGames().get(0).getTitle());
    }

    @Test
    void testTitleChange() {
        Collection collection = new Collection();
        Game castlevania = new Game.Builder("Castlevania: Generations", Platform.GENESIS).build();
        collection.add(castlevania);

        collection.getGames().get(0).setTitle("Castlevania: Bloodlines");

        Assertions.assertSame("Castlevania: Bloodlines", collection.getGames().get(0).getTitle());
    }

    @Test
    void testPlatformBuilder() {
        Collection collection = new Collection();
        Game castlevania = new Game.Builder("Castlevania: Rondo of Blood", Platform.PC_ENGINE).build();
        collection.add(castlevania);

        Assertions.assertSame(Platform.PC_ENGINE, collection.getGames().get(0).getPlatform());
    }

    @Test
    void testPlatformChange() {
        Collection collection = new Collection();
        Game castlevania = new Game.Builder("Castlevania: Bloodlines", Platform.SNES).build();
        collection.add(castlevania);

        collection.getGames().get(0).setPlatform(Platform.GENESIS);

        Assertions.assertSame("Castlevania: Bloodlines", collection.getGames().get(0).getTitle());
    }

    /*
    TODO test:
        genre
        completed
        completedDate
     */
}
