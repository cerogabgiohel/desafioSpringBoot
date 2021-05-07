package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("select u from User u where u.id = :id" )
	public List<User> sqlId(@Param("id") Long id);
	
	@Query("select u from User u where lower(u.name) like lower(:name)")
	public List<User> sqlName(@Param("name") String name);
	
	@Query("select u from User u where lower(u.name) like lower(concat('%', :name, '%'))")
	public List<User> sqlNameContains(@Param("name") String name);
	
	@Query("select u from User u where lower(u.name) like lower(concat(:name, '%'))")
	public List<User> sqlStartsBy(@Param("name") String name);
	
	@Query("select u from User u where lower(u.name) like lower(concat('%', :name))")
	public List<User> sqlEndsBy(@Param("name") String name);
	
	@Query("select u from User u left join Image i ON u.id = i.user.id where u.id = :id")
	public List<User> sqlJoin(@Param("id")Long id);
}
