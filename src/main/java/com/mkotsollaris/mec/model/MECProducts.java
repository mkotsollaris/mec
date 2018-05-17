package com.mkotsollaris.mec.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) public class MECProducts
        implements Serializable
{
    private long id;
    private MECProduct[] mecProduct;

    public MECProducts()
    {

    }

    public MECProduct[] getProducts()
    {
        return mecProduct;
    }

    public void setProducts(MECProduct[] products)
    {
        this.mecProduct = products;
    }

    // gets first 5 images found in MECProduct's default_image_urls
    public String[] getFiveImageURLs()
    {
        List<String> list = new ArrayList<>();
        for(MECProduct mecProduct : this.mecProduct)
        {
            list.add(mecProduct.getDefault_image_urls().getLarge_image_url());
            list.add(mecProduct.getDefault_image_urls().getMain_image_url());
            list.add(mecProduct.getDefault_image_urls().getSmall_image_url());
            list.add(mecProduct.getDefault_image_urls().getZoom_image_url());
            if(list.size() > 5) break;
        }
        return list.subList(0, 5).toArray(new String[0]);
    }

    public String[] getThreeDominantColours()
    {
        //todo
        return null;
    }
}
