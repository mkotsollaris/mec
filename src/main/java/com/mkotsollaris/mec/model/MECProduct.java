package com.mkotsollaris.mec.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MECProduct implements Serializable {
    private long id;
    private MECDefaultImageURLs default_image_urls;
    private Boolean all_skus_clearance;
    private String product_code;
    private String full_name;
    private String name;
    private String brand;
    private Integer review_count;
    private Float review_rating;
    private Boolean can_add_to_cart;
    private Boolean can_add_to_wish_list;
    private Boolean new_to_mec;
    private String default_colour_code;
    private String web_url;
    private Boolean clearance;
    private String product_details_url;

    public MECProduct() {

    }


    public Boolean getAll_skus_clearance() {
        return all_skus_clearance;
    }

    public void setAll_skus_clearance(Boolean all_skus_clearance) {
        this.all_skus_clearance = all_skus_clearance;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getReview_count() {
        return review_count;
    }

    public void setReview_count(Integer review_count) {
        this.review_count = review_count;
    }

    public Float getReview_rating() {
        return review_rating;
    }

    public void setReview_rating(Float review_rating) {
        this.review_rating = review_rating;
    }

    public Boolean getCan_add_to_cart() {
        return can_add_to_cart;
    }

    public void setCan_add_to_cart(Boolean can_add_to_cart) {
        this.can_add_to_cart = can_add_to_cart;
    }

    public Boolean getCan_add_to_wish_list() {
        return can_add_to_wish_list;
    }

    public void setCan_add_to_wish_list(Boolean can_add_to_wish_list) {
        this.can_add_to_wish_list = can_add_to_wish_list;
    }

    public Boolean getNew_to_mec() {
        return new_to_mec;
    }

    public void setNew_to_mec(Boolean new_to_mec) {
        this.new_to_mec = new_to_mec;
    }

    public String getDefault_colour_code() {
        return default_colour_code;
    }

    public void setDefault_colour_code(String default_colour_code) {
        this.default_colour_code = default_colour_code;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public Boolean getClearance() {
        return clearance;
    }

    public void setClearance(Boolean clearance) {
        this.clearance = clearance;
    }

    public String getProduct_details_url() {
        return product_details_url;
    }

    public void setProduct_details_url(String product_details_url) {
        this.product_details_url = product_details_url;
    }

    public MECDefaultImageURLs getDefault_image_urls() {
        return default_image_urls;
    }

    public void setDefault_image_urls(MECDefaultImageURLs default_image_urls) {
        this.default_image_urls = default_image_urls;
    }
}
