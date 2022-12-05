package com.bahadirmemis.medipoltest.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerEntityService customerEntityService;

    @GetMapping
    public ResponseEntity findAll(){

        List<Customer> customerList = customerEntityService.findAll();

        return ResponseEntity.ok(customerList);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){

        Customer customer = customerEntityService.findById(id).orElseThrow();

        return ResponseEntity.ok(customer);
    }

    @PostMapping
    public ResponseEntity save(@RequestBody Customer customer){

        Customer savedCustomer = customerEntityService.save(customer);

        return ResponseEntity.ok(savedCustomer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){

        customerEntityService.delete(id);

        return ResponseEntity.ok().build();
    }
}
