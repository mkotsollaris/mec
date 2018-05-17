package com.mkotsollaris.mec.controller;

import com.mkotsollaris.mec.model.Product;
import com.mkotsollaris.mec.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController @RequestMapping("/product") public class ProductController
{

    @Autowired ProductService productService;

    @RequestMapping(value = "search&keywords={keywords}",
            method = RequestMethod.GET)
    public Product getProduct(@PathVariable("keywords") String keywords)
            throws IOException
    {
        String[]
                productUrls =
                {"productUrl1", "productUrl2", "productUrl3", "productUrl4",
                        "productUrl5"};
        String[]
                dominantColours =
                {"dominantColour1", "dominantColour2", "dominantColour3"};
        this.productService.getProductFromMecApiByKeywords(keywords);
        return new Product(null, null);
    }

}
