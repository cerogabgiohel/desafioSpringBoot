package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

	@Query("select p from Post p where p.id = :id")
	public List<Post>sqlId(@Param("id") Long id);
}
