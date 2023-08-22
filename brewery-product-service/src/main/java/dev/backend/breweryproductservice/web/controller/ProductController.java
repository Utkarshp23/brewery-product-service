package dev.backend.breweryproductservice.web.controller;


import dev.backend.breweryproductservice.web.model.ProductDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/product")
@RestController
public class ProductController {

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable("productId") UUID productId) {

        return new ResponseEntity<>(ProductDto.builder ().build(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity saveNewProduct (@RequestBody ProductDto productDto) {

        return new ResponseEntity(HttpStatus.CREATED);
    }
    @PutMapping("/{productId}")
    public ResponseEntity updateProductById(@PathVariable("productId") UUID productId, @RequestBody ProductDto productDto) {

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
