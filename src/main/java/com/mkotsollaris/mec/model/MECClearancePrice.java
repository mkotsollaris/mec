package com.mkotsollaris.mec.model;

public class MECClearancePrice
{

    private Float amount;
    private String currency;

    public MECClearancePrice()
    {

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
