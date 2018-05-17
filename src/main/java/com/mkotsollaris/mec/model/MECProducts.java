package com.mkotsollaris.mec.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MECProducts implements Serializable
{
    private long id;
    private MECProduct[] mecProduct;

    public MECProducts(){

    }

    public MECProduct[] getProducts()
    {
        return mecProduct;
    }

    public void setProducts(MECProduct[] products)
    {
        this.mecProduct = products;
    }
}
