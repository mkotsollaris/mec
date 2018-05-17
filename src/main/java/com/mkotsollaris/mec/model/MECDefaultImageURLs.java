package com.mkotsollaris.mec.model;

import java.io.Serializable;

public class MECDefaultImageURLs implements Serializable
{
    private long id;
    private String small_image_url;
    private String large_image_url;
    private String main_image_url;
    private String zoom_image_url;

    public MECDefaultImageURLs() {

    }

    public String getSmall_image_url()
    {
        return small_image_url;
    }

    public void setSmall_image_url(String small_image_url)
    {
        this.small_image_url = small_image_url;
    }

    public String getLarge_image_url()
    {
        return large_image_url;
    }

    public void setLarge_image_url(String large_image_url)
    {
        this.large_image_url = large_image_url;
    }

    public String getMain_image_url()
    {
        return main_image_url;
    }

    public void setMain_image_url(String main_image_url)
    {
        this.main_image_url = main_image_url;
    }

    public String getZoom_image_url()
    {
        return zoom_image_url;
    }

    public void setZoom_image_url(String zoom_image_url)
    {
        this.zoom_image_url = zoom_image_url;
    }
}
