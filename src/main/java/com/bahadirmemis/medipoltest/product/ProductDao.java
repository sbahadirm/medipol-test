package com.bahadirmemis.medipoltest.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Repository
public interface ProductDao extends JpaRepository<Product, Long> {


}
