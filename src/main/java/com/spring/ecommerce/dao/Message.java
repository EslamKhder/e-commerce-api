package com.spring.ecommerce.dao;

import com.spring.ecommerce.model.message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Message  extends JpaRepository<message,Long> {
}
