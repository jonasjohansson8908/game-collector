package Items;

import Items.Properties.Platform;

// TODO check this class. Only copy/pasted from Game

public class Console extends CollectorItem{
    public String title;
    public Platform platform;

    public static class Builder extends CollectorItem.Builder<Builder> {

        private final String title;
        private final Platform platform;

        public Builder(String title, Platform platform) {
            this.title = title;
            this.platform = platform;
        }

        @Override public Console build() {
            return new Console(this);
        }

        @Override protected Builder self() { return this; }

    }

    private Console(Builder builder) {
        super(builder);
        title = builder.title;
        platform = builder.platform;
    }
}
