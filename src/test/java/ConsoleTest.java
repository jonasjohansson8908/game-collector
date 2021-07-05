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

    /**
     * Create a GameConsole and add a modification through the builder. Check if the mod is persisted.
     */
    @Test
    void testSingleModBuilder() {
        GameConsole pcEngine = new GameConsole.Builder("PC Engine Duo R", Platform.PC_ENGINE)
                .mods("RGB-mod")
                .build();
        Assertions.assertEquals("RGB-mod", pcEngine.getMods().get(0));
    }

    /**
     * Create a GameConsole and add multiple modifications through the builder. Check if the mods are persisted.
     */
    @Test
    void testMultipleModsBuilder() {
        GameConsole pcEngine = new GameConsole.Builder("PC Engine Duo R", Platform.PC_ENGINE)
                .mods("RGB-mod", "Recap", "ODE")
                .build();
        Assertions.assertEquals("[RGB-mod, Recap, ODE]", pcEngine.getMods().toString());
    }

    /**
     * Create a GameConsole and add a single modification through the add method.
     */
    @Test
    void testSingleModChange() {
        GameConsole pcEngine = new GameConsole.Builder("PC Engine Duo R", Platform.PC_ENGINE).build();
        pcEngine.addMods("Region mod");
        Assertions.assertEquals("Region mod", pcEngine.getMods().get(0));
    }

    /**
     * Create a GameConsole and add a multiple modifications through the add method.
     */
    @Test
    void testMultipleModsChange() {
        GameConsole pcEngine = new GameConsole.Builder("PC Engine Duo R", Platform.PC_ENGINE).build();
        pcEngine.addMods("Region mod", "Added fan", "HDMI mod");
        Assertions.assertEquals("[Region mod, Added fan, HDMI mod]", pcEngine.getMods().toString());
    }

    /**
     * Create a GameConsole and remove the modification of a given index from the modifications list.
     */
    @Test
    void testModRemove() {
        GameConsole pcEngine = new GameConsole.Builder("PC Engine Duo R", Platform.PC_ENGINE)
                .mods("Region mod", "Added fan", "HDMI mod")
                .build();
        pcEngine.removeMod(1);
        Assertions.assertEquals("[Region mod, HDMI mod]", pcEngine.getMods().toString());
    }
}
