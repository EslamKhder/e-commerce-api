package com.spring.ecommerce.dao;

import com.spring.ecommerce.model.category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoryRepo extends JpaRepository<category,Long> {
}
