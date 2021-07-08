package com.spring.ecommerce.dao;

import com.spring.ecommerce.model.favoriteorder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteOrderRepo  extends JpaRepository<favoriteorder,Long> {
}
