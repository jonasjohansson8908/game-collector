package Items;

import Items.Properties.Platform;

import java.util.ArrayList;
import java.util.Arrays;

public class GameConsole extends CollectorItem{
    private String title;
    private Platform platform;
    private final ArrayList<String> mods;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public ArrayList<String> getMods() {
        return mods;
    }

    public void removeMod(int index) {
        mods.remove(index);
    }

    public void addMods(String... mods) { this.mods.addAll(Arrays.asList(mods)); }

    public static class Builder extends CollectorItem.Builder<Builder> {

        private final String title;
        private final Platform platform;

        private final ArrayList<String> mods; // Console modifications, such as RGB mod.

        public Builder(String title, Platform platform) {
            this.title = title;
            this.platform = platform;
            this.mods = new ArrayList<>();
        }

        public GameConsole.Builder mods(String... mods) {
            this.mods.addAll(Arrays.asList(mods));
            return self();
        }

        @Override public GameConsole build() {
            return new GameConsole(this);
        }

        @Override protected Builder self() { return this; }

    }

    private GameConsole(Builder builder) {
        super(builder);
        title = builder.title;
        platform = builder.platform;
        mods = builder.mods;
    }
}
