package com.nkkize.shiksha.repository;

import com.nkkize.shiksha.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  User findByName(String name);
  
}
