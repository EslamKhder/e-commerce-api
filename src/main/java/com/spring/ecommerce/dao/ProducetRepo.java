package com.spring.ecommerce.dao;

import com.spring.ecommerce.model.Producet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProducetRepo extends JpaRepository<Producet,Long> {
}
