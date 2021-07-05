import Items.GameConsole;
import Items.Properties.Platform;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConsoleTest {

    /**
     * Create a GameConsole with its builder. Check if the title is persisted.
     */
    @Test
    void testTitleBuilder() {
        GameConsole snes = new GameConsole.Builder("Childhood SNES", Platform.SNES).build();
        Assertions.assertEquals("Childhood SNES", snes.getTitle());
    }

    /**
     * Create a GameConsole with its builder. Check if the title can be modified.
     */
    @Test
    void testTitleChange() {
        GameConsole snes = new GameConsole.Builder("SNES Jr", Platform.SNES).build();
        snes.setTitle("1CHIP SNES");
        Assertions.assertEquals("1CHIP SNES", snes.getTitle());
    }

    /**
     * Create a GameConsole with its builder. Check if the platform is persisted.
     */
    @Test
    void testPlatformBuilder() {
        GameConsole genesis = new GameConsole.Builder("Sega Genesis", Platform.GENESIS).build();
        Assertions.assertSame(Platform.GENESIS, genesis.getPlatform());
    }

    /**
     * Create a GameConsole with its builder. Check if the platform can be modified.
     */
    @Test
    void testPlatformChange() {
        GameConsole genesis = new GameConsole.Builder("Sega Genesis", Platform.PS5).build();
        genesis.setPlatform(Platform.GENESIS);
        Assertions.assertEquals(Platform.GENESIS, genesis.getPlatform());
    }
}
