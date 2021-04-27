package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("select u from User u where u.id = :id")
	public List<User>sqlId(@Param("id") Long id);
	
	@Query("select u from User u where u.name = :name")
	public List<User>sqlId(@Param("name") String name);
}
