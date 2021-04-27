package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

	@Query("select i from Image i where i.id = :id")
	public List<Image>sqlId(@Param("id") Long id);
}
