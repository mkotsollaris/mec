package com.mkotsollaris.mec.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mkotsollaris.mec.model.MECProducts;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service public class ProductService
{

    private RestTemplate rest = new RestTemplate();
    private HttpHeaders headers = new HttpHeaders();

    public MECProducts getProductFromMecApiByKeywords(String keywords)
            throws IOException
    {
        HttpEntity<String> requestEntity = new HttpEntity<>("", headers);
        String server = "http://www.mec.ca/api/v1/products/search?keywords=";
        ResponseEntity<String>
                responseEntity =
                rest.exchange(server + keywords, HttpMethod.GET, requestEntity,
                              String.class);
        return new ObjectMapper()
                .readValue(responseEntity.getBody(), MECProducts.class);
    }
}
