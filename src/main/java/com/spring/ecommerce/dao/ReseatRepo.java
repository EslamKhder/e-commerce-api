package com.spring.ecommerce.dao;

import com.spring.ecommerce.model.reseat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReseatRepo extends JpaRepository<reseat,Long> {
}
