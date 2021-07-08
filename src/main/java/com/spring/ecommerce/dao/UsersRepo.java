package com.spring.ecommerce.dao;

import com.spring.ecommerce.model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<users,Long> {
}
