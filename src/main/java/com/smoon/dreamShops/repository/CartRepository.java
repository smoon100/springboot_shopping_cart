package com.smoon.dreamShops.repository;

import com.smoon.dreamShops.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
