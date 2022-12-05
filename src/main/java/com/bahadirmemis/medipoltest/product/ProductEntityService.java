package com.bahadirmemis.medipoltest.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Service
@RequiredArgsConstructor
public class ProductEntityService {

    private final ProductDao productDao;

    public Product save(Product product){
        return productDao.save(product);
    }

    public List<Product> findAll(){
        return productDao.findAll();
    }

    public Optional<Product> findById(Long id){
        return productDao.findById(id);
    }

    public void delete(Long productId){
        productDao.deleteById(productId);
    }
}
