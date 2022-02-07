package com.mouritech.ordermanagementswithspringdatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.ordermanagementswithspringdatajpa.entity.Order;

@Repository("orderRepository")
public interface OrderRepository extends JpaRepository<Order, Long> {

}