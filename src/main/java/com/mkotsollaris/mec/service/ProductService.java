package com.mkotsollaris.mec.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class ProductService
{
    public void getProductFromMecApiByKeywords(String... keywords)
            throws IOException
    {
        //e.g., http://www.mec.ca/api/v1/products/search?keywords=bike&doll&phone
//        URL
//                url =
//                new URL("http://www.mec.ca/api/v1/products/search?keywords=" +
//                                keywords);
        URL url = new URL("http://www.mec.ca/api/v1/products/search?keywords=bike");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int status = con.getResponseCode();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        System.out.println("content: "+content);
        in.close();
        con.disconnect();
    }

}
