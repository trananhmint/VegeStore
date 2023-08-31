package org.hehe.vegestore.repository;

import org.hehe.vegestore.entity.OrderItemsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItemsEntity, Integer> {
}
