package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.Album;

public interface AlbumRepository extends  JpaRepository<Album, Long>{

	@Query("select a from Album a where a.id = :id")
	public List<Album>sqlId(@Param("id") Long id);

}
