package com.ecommerce.repository;

import com.ecommerce.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  User findByUsername(String username);

  @Transactional
  void deleteByUsername(String username);

  @Query("SELECT u FROM User u WHERE u.username =?1")
  User findUserByUsername(String username);

}
