package com.mkotsollaris.mec.model;

import java.io.Serializable;

public class MECTracking implements Serializable
{
    private long id;
    private String erp_category;
    private String category;

    public MECTracking(){

    }

    public String getErp_category()
    {
        return erp_category;
    }

    public void setErp_category(String erp_category)
    {
        this.erp_category = erp_category;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }
}
