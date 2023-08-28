package org.hehe.vegestore.repository;

import org.hehe.vegestore.entity.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductsRepository extends JpaRepository<ProductsEntity, Integer> {

}
