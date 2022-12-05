package com.bahadirmemis.medipoltest.product;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity save(@RequestBody Product product){

        Product savedProduct = productService.saveProduct(product);

        return ResponseEntity.ok(savedProduct);
    }

    @GetMapping
    public ResponseEntity findAll(){

        List<Product> productList = productService.findAll();

        return ResponseEntity.ok(productList);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){

        Product product = productService.findById(id);

        return ResponseEntity.ok(product);
    }

    @PostMapping("/{id}/stocks/add")
    public ResponseEntity addStock(@PathVariable Long id, Long amount){

        Long newStock = productService.addStock(id, amount);

        return ResponseEntity.ok(newStock);
    }
}
