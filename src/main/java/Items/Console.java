package Items;

import Items.Properties.Platform;

public class Console extends CollectorItem{
    private String title;
    private Platform platform;

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
