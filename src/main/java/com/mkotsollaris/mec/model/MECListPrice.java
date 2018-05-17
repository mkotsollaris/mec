package com.mkotsollaris.mec.model;

import java.io.Serializable;

public class MECListPrice implements Serializable
{
    private long id;
    private Float amount;
    private String currency;

    public MECListPrice(){

    }

    public Float getAmount()
    {
        return amount;
    }

    public void setAmount(Float amount)
    {
        this.amount = amount;
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }
}
