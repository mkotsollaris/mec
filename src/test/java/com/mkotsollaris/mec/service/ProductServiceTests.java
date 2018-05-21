package com.mkotsollaris.mec.service;

import com.mkotsollaris.mec.model.MECDefaultImageURLs;
import com.mkotsollaris.mec.model.MECProduct;
import com.mkotsollaris.mec.model.MECProducts;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProductService.class)
public class ProductServiceTests {

    @Mock
    private ProductService productService;

    @Test
    public void whenUserProductIsRequested_thenThreeDomColAreComputedCorrectly() throws IOException {
        String[][] expectedMostDomColours = initMostDomColours();
        MECProducts mecProducts = initMecProducts();
        Mockito.when(productService.getMECProductFromMecApiByKeywords("bike")).thenReturn(mecProducts);
        Mockito.when(productService.getThreeMostDominantColours(mecProducts.getFiveImageURLs())).thenReturn(expectedMostDomColours);
        String[][] actualMostDomColours = productService.getThreeMostDominantColours(mecProducts.getFiveImageURLs());
        Assert.assertEquals(actualMostDomColours.length, expectedMostDomColours.length);
        Assert.assertEquals(actualMostDomColours[0][0], expectedMostDomColours[0][0]);
    }

    private MECProducts initMecProducts() {
        MECDefaultImageURLs mecDefaultImageURLs = new MECDefaultImageURLs();
        mecDefaultImageURLs.setLarge_image_url("imageUrl1");
        mecDefaultImageURLs.setMain_image_url("imageUrl2");
        mecDefaultImageURLs.setSmall_image_url("imageUrl3");
        mecDefaultImageURLs.setZoom_image_url("imageUrl4");
        MECProducts mecProducts = new MECProducts();
        MECProduct mecProduct = new MECProduct();
        mecProduct.setDefault_image_urls(mecDefaultImageURLs);
        mecProducts.setProducts(new MECProduct[]{mecProduct});
        return mecProducts;
    }

    public String[][] initMostDomColours() {
        return new String[][]{
                {"#FFFFFF", "#000000", "FF00FF"},
                {"#FFFFFF", "#000000", "FF00FF"},
                {"#FFFFFF", "#000000", "FF00FF"},
                {"#FFFFFF", "#000000", "FF00FF"},
                {"#FFFFFF", "#000000", "FF00FF"}
        };
    }
}
