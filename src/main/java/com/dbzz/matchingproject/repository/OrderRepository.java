package com.dbzz.matchingproject.repository;

import com.dbzz.matchingproject.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findByOrderId(long orderId);
//    Optional<Order> findByCustomerId(String customerId);
    List<Order> findAllByCustomerId(String customerId);
    List<Order> findAllBySellerId(String sellerId);
}
