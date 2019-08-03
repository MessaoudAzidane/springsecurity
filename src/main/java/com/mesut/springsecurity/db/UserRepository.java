package com.mesut.springsecurity.db;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mesut.springsecurity.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username) ;


}
