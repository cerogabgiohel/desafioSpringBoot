package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Album;

public interface AlbumRepository extends  JpaRepository<Album, Long>{

}
