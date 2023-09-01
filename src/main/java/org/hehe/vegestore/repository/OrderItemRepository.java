package org.hehe.vegestore.repository;

import org.hehe.vegestore.entity.OrderItemsEntity;
import org.hehe.vegestore.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItemsEntity, Integer> {
    List<OrderItemsEntity> findByOrder(OrdersEntity ordersEntity);
}
