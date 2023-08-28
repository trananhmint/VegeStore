package org.hehe.vegestore.repository;

import org.hehe.vegestore.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Integer> {
    List<UsersEntity> findByUserNameAndPassword(String username, String password);
    UsersEntity findByUserName(String username);
}
