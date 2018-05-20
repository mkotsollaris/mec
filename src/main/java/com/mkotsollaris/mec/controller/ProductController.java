package com.mkotsollaris.mec.controller;

import com.mkotsollaris.mec.model.MECProducts;
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
    public Product[] getProduct(@PathVariable("keywords") String keywords)
            throws IOException
    {
        MECProducts
                mecProducts =
                this.productService.getMECProductFromMecApiByKeywords(keywords);
        String[] maxFiveImageURLs = mecProducts.getFiveImageURLs();
        String[][]
                threeDominantColours =
                this.productService
                        .getThreeMostDominantColours(maxFiveImageURLs);
        Product[] products = new Product[5];
        for(int i=0;i<maxFiveImageURLs.length;i++) {
            products[i] = new Product(maxFiveImageURLs[i], threeDominantColours[i]);
        }
        return products;
    }

}
