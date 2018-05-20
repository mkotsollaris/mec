package com.mkotsollaris.mec.model;

public class Product {
    private String productUrl;

    private String[] dominantColours;

    public Product(String productUrl, String[] dominantColours) {
        this.productUrl = productUrl;
        this.dominantColours = dominantColours;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrls) {
        this.productUrl = productUrls;
    }

    public String[] getDominantColours() {
        return dominantColours;
    }
}
