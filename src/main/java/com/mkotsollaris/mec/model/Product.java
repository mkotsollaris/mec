package com.mkotsollaris.mec.model;

public class Product
{
    private String[] productUrls;

    private String[] dominantColours;

    public Product(String[] productUrls, String[] dominantColours) {
        this.productUrls = productUrls;
        this.dominantColours = dominantColours;
    }

    public String[] getProductUrls()
    {
        return productUrls;
    }

    public void setProductUrls(String[] productUrls)
    {
        this.productUrls = productUrls;
    }

    public String[] getDominantColours()
    {
        return dominantColours;
    }
}
