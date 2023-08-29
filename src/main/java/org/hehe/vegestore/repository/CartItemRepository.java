package org.hehe.vegestore.repository;

import org.hehe.vegestore.entity.CartEntity;
import org.hehe.vegestore.entity.CartItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItemsEntity, Integer> {
    List<CartItemsEntity> findByCart(CartEntity cart);
}
