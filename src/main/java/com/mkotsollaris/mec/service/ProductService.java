package com.mkotsollaris.mec.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ProductService
{
    public void getProductFromMecApiByKeywords(String... keywords)
            throws IOException
    {
        URL url = new URL("http://example.com");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
    }

}
