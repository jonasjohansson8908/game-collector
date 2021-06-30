package Items;

import Items.Properties.Region;
import Items.Properties.Types;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class CollectorItem implements Serializable{

    private String sortingTitle;
    private double purchasePrice;
    private Types type;
    private String description;
    private Region region;
    private LocalDate purchaseDate;
    private LocalDate releaseDate;

    public String getSortingTitle() {
        return sortingTitle;
    }

    public void setSortingTitle(String sortingTitle) {
        this.sortingTitle = sortingTitle;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    CollectorItem(Builder<?> builder) {
        sortingTitle = builder.sortingTitle;
        purchasePrice = builder.purchasePrice;
        description = builder.description;
        region = builder.region;
        purchaseDate = builder.purchaseDate;
        releaseDate = builder.releaseDate;
    }

    abstract static class Builder<T extends Builder<T>> {

        String sortingTitle;
        double purchasePrice = 0.0;
        String description = "";
        Region region;
        LocalDate purchaseDate;
        LocalDate releaseDate;

        // optional
        double price = 0.0;

        public T sortingTitle(String title) {
            this.sortingTitle = title;
            return self();
        }

        public T purchasePrice(double purchasePrice){
            this.purchasePrice = purchasePrice;
            return self();
        }

        public T description(String description) {
            this.description = description;
            return self();
        }

        public T region(Region region) {
            this.region = region;
            return self();
        }

        public T purchaseDate(LocalDate date) {
            this.purchaseDate = date;
            return self();
        }

        public T releaseDate(LocalDate date) {
            this.releaseDate = date;
            return self();
        }

        abstract CollectorItem build();
        protected abstract T self();
    }
}
