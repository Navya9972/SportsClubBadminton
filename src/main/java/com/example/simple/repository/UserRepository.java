package com.example.simple.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.simple.model.User;



public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUserName(String userName); 
}
