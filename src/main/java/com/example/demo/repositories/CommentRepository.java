package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{
	@Query("select c from Comment c where c.idComment = :idComment")
	public List<Comment>sqlId(@Param("idComment") Long id);
}
