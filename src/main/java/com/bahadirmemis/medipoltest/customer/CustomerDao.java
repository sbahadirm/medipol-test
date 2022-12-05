package com.bahadirmemis.medipoltest.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {


}
