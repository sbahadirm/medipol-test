package com.bahadirmemis.medipoltest.order;

import com.bahadirmemis.medipoltest.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Repository
public interface OrderDao extends JpaRepository<Order, Long> {


}
