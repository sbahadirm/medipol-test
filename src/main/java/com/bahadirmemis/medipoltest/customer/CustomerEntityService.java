package com.bahadirmemis.medipoltest.customer;

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
public class CustomerEntityService  {

    private final CustomerDao customerDao;

    public Customer save(Customer customer){
        return customerDao.save(customer);
    }

    public List<Customer> findAll(){
        return customerDao.findAll();
    }

    public Optional<Customer> findById(Long id){
        return customerDao.findById(id);
    }

    public void delete(Long customerId){
        customerDao.deleteById(customerId);
    }
}
