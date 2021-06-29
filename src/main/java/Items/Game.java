package Items;

import Items.Properties.Platform;

public class Game extends CollectorItem{
    public String title;
    public Platform platform;
    String genre;
    boolean completed;

    public static class Builder extends CollectorItem.Builder<Builder> {

        private final String title;
        private final Platform platform;

        private String genre;
        private boolean completed = false;

        public Builder genre(String genre) {
            this.genre = genre;
            return self();
        }

        public Builder completed(boolean completed) {
            this.completed = completed;
            return self();
        }

        public Builder(String title, Platform platform) {
            this.title = title;
            this.platform = platform;
        }

        @Override public Game build() {
            return new Game(this);
        }

        @Override protected Builder self() { return this; }

    }

    private Game(Builder builder) {
        super(builder);
        title = builder.title;
        platform = builder.platform;
        genre = builder.genre;
        completed = builder.completed;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean getCompleted() {
        return this.completed;
    }
}
