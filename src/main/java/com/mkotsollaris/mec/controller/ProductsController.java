package com.mkotsollaris.mec.controller;

import com.mkotsollaris.mec.model.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ProductsController {

    @RequestMapping("/products&keywords={keywords}")
    public Product getProduct(@PathVariable("keywords") String... keywords) {
        String[] productUrls = {"productUrl1","productUrl2","productUrl3","productUrl4","productUrl5"};
        String[] dominantColours = {"dominantColour1","dominantColour2","dominantColour3"};
        return new Product(null,null);
    }

}
