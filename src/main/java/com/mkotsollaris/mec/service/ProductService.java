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
import java.util.Stack;

@Service
public class ProductService {
    private RestTemplate rest = new RestTemplate();
    private HttpHeaders headers = new HttpHeaders();
    private HttpEntity<String> requestEntity = new HttpEntity<>("", headers);


    public MECProducts getMECProductFromMecApiByKeywords(String keywords)
            throws IOException {
        String url = "http://www.mec.ca/api/v1/products/search?keywords=";
        ResponseEntity<String>
                responseEntity =
                rest.exchange(url + keywords, HttpMethod.GET, requestEntity,
                        String.class);
        return new ObjectMapper()
                .readValue(responseEntity.getBody(), MECProducts.class);
    }

    public String[][] getThreeMostDominantColours(String[] imageURLs)
            throws IOException {
        if (imageURLs == null) {
            return null;
        }
        String[][] dominantColours = new String[imageURLs.length][3];
        for (int i = 0; i < imageURLs.length; i++) {
            dominantColours[i] = this.getThreeMostDominantColours(imageURLs[i]);
        }
        return dominantColours;
    }

    private String[] getThreeMostDominantColours(String imageURL) {
        String serverURL = "https://mec.imgix.net/";
        String urlPreSuffix = imageURL.split("https://cdn\\.mec\\.ca/")[1];
        String urlSuffix = "?&palette=css&colors=3";
        String url = serverURL + urlPreSuffix + urlSuffix;
        ResponseEntity<String>
                responseEntity =
                rest.exchange(url, HttpMethod.GET, requestEntity, String.class);
        return this.extractThreeColours(responseEntity.getBody());
    }


    private String[] extractThreeColours(String cssResponse) {
        Stack<String> threeColoursStack = new Stack<>();
        String[] lines = cssResponse.split("\n");
        for (String line : lines) {
            if (threeColoursStack.size() == 3) break;
            String
                    wantedColour =
                    line.split("color:")[1].split(" ")[0];
            threeColoursStack.push(wantedColour);
        }
        return threeColoursStack.toArray(new String[3]);
    }
}
