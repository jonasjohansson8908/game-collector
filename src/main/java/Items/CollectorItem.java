package Items;

import Items.Properties.Platform;
import Items.Properties.Region;
import Items.Properties.Types;

import java.io.Serializable;
import java.util.Date;

public abstract class CollectorItem implements Serializable{

    private String sortingTitle;
    private double purchasePrice;
    private Platform platform;
    private Types type;
    private String description;
    private Region region;
    private Date purchaseDate;
    private Date releaseDate;

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

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
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

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
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
        Platform platform;
        String description = "";
        Region region;
        Date purchaseDate;
        Date releaseDate;

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

        public T purchaseDate(Date date) {
            this.purchaseDate = date;
            return self();
        }

        public T releaseDate(Date date) {
            this.releaseDate = date;
            return self();
        }

        abstract CollectorItem build();
        protected abstract T self();
    }
}
