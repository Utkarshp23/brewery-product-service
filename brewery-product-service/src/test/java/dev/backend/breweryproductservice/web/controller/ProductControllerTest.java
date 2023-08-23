package dev.backend.breweryproductservice.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.*;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Test
    void getProductById() {
//        mockMvc.perform(get());
    }

    @Test
    void saveNewProduct() {
    }

    @Test
    void updateProductById() {
    }
}