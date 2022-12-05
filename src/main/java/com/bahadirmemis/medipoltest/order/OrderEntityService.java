package com.bahadirmemis.medipoltest.order;

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
public class OrderEntityService {

    private final OrderDao orderDao;

    public Order save(Order order){
        return orderDao.save(order);
    }

    public List<Order> findAll(){
        return orderDao.findAll();
    }

    public Optional<Order> findById(Long id){
        return orderDao.findById(id);
    }

    public void delete(Long orderId){
        orderDao.deleteById(orderId);
    }
}
