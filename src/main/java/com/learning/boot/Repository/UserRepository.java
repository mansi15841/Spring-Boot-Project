package com.learning.boot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.boot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
