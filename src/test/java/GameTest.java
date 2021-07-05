

import Items.Collection;
import Items.Game;
import Items.Properties.Platform;
import org.junit.jupiter.api.*;

public class GameTest {

    @Test
    void testTitleBuilder() {
        Game castlevania = new Game.Builder("Castlevania: Rondo of Blood", Platform.PC_ENGINE).build();
        Assertions.assertEquals("Castlevania: Rondo of Blood", castlevania.getTitle());
    }

    @Test
    void testTitleChange() {
        Game castlevania = new Game.Builder("Castlevania: Generations", Platform.GENESIS).build();
        castlevania.setTitle("Castlevania: Bloodlines");
        Assertions.assertEquals("Castlevania: Bloodlines", castlevania.getTitle());
    }

    @Test
    void testPlatformBuilder() {
        Game castlevania = new Game.Builder("Castlevania: Rondo of Blood", Platform.PC_ENGINE).build();
        Assertions.assertSame(Platform.PC_ENGINE, castlevania.getPlatform());
    }

    @Test
    void testPlatformChange() {
        Game castlevania = new Game.Builder("Castlevania: Bloodlines", Platform.SNES).build();
        castlevania.setPlatform(Platform.GENESIS);

        Assertions.assertEquals("Castlevania: Bloodlines", castlevania.getTitle());
    }

    /**
     * Create a game with its builder. Check if property "genre" is persisted.
     */
    @Test
    void testGenreBuilder() {
        Game castlevania = new Game.Builder("Castlevania", Platform.NES)
                .genre("Whipping platformer")
                .build();
        Assertions.assertEquals("Whipping platformer", castlevania.getGenre());
    }

    /**
     * Create a game with its builder Check if property "genre" can be modified.
     */
    @Test
    void testGenreChange() {
        Collection collection = new Collection();
        Game castlevania = new Game.Builder("Castlevania", Platform.NES)
                .genre("Platformer")
                .build();
        collection.add(castlevania);
        collection.getGames().get(0).setGenre("Whipping platformer");
        Assertions.assertEquals("Whipping platformer", collection.getGames().get(0).getGenre());
    }

    /**
     * Create a game and set the "completed" property to true with the builder. Check that "completed" is persisted.
     */
    @Test
    void testCompletedBuilder() {
        Game castlevania = new Game.Builder("Castlevania", Platform.NES)
                .completed(true)
                .build();
        Assertions.assertTrue(castlevania.isCompleted());
    }

    /**
     * Create a game with its builder. Check that property "completed" false by default.
     */
    @Test
    void testCompletedDefault() {
        Game castlevania = new Game.Builder("Castlevania", Platform.NES).build();
        Assertions.assertFalse(castlevania.isCompleted());
    }

    /**
     * Create a game and set completed to true through the builder. Check that property "completed" can be modified.
     */
    @Test
    void testCompletedChange() {
        Game castlevania = new Game.Builder("Castlevania", Platform.NES)
                .completed(true)
                .build();
        castlevania.setCompleted(false);
        Assertions.assertFalse(castlevania.isCompleted());
    }

    /**
     * Create a game with its builder. Check that completedDate is reset when completed is set to false.
     */
    @Test
    void testCompletedResetDate() {
        Game castlevania = new Game.Builder("Castlevania", Platform.NES)
                .completed(true)
                .completedDate(2008, 5, 23)
                .build();
        castlevania.setCompleted(false);
        Assertions.assertNull(castlevania.getCompletedDate());
    }

    /**
     * Create a game and set the date through the builder. Check that date is persisted.
     */
    @Test
    void testCompletedDateBuilder() {
        Game castlevania = new Game.Builder("Castlevania", Platform.NES)
                .completed(true)
                .completedDate(2008, 5, 23)
                .build();
        Assertions.assertEquals("2008-05-23" , castlevania.getCompletedDate().toString());
    }

    /**
     * Create a game without a completed date. Check that date can be changed through setter.
     */
    @Test
    void testCompletedDateChange() {
        Game castlevania = new Game.Builder("Castlevania", Platform.NES)
                .completed(true)
                .build();
        castlevania.setCompletedDate(2008, 5, 23);
        Assertions.assertEquals("2008-05-23" , castlevania.getCompletedDate().toString());
    }
}
