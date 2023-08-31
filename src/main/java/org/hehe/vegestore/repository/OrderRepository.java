package org.hehe.vegestore.repository;

import org.hehe.vegestore.entity.OrdersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrdersEntity, Integer> {
}
