package com.spring.ecommerce.dao;

import com.spring.ecommerce.model.branches;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchesRepo extends JpaRepository<branches,Long> {
}
