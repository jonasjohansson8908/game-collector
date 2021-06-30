package Items;

import Items.Properties.Platform;

import java.time.LocalDate;

public class Game extends CollectorItem{
    private String title;
    private Platform platform;
    private String genre;
    private boolean completed;
    private LocalDate completedDate;

    public String getTitle() {
        return this.title;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDate getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(LocalDate completedDate) {
        this.completedDate = completedDate;
    }

    public static class Builder extends CollectorItem.Builder<Builder> {

        private final String title;
        private final Platform platform;

        private String genre;
        private boolean completed = false;
        private LocalDate completedDate;

        public Builder genre(String genre) {
            this.genre = genre;
            return self();
        }

        public Builder completed(boolean completed) {
            this.completed = completed;
            return self();
        }

        public Builder completedDate(LocalDate completedDate) {
            this.completedDate = completedDate;
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
        completedDate = builder.completedDate;
    }
}
