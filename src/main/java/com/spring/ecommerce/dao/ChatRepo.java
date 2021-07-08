package com.spring.ecommerce.dao;

import com.spring.ecommerce.model.chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepo extends JpaRepository<chat,Long> {
}
