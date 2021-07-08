package com.spring.ecommerce.dao;

import com.spring.ecommerce.model.orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<orders,Long> {
}
