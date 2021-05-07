package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.converter.AlbumConverter;
import com.example.demo.dto.AlbumDto;
import com.example.demo.models.Album;
import com.example.demo.services.AlbumService;

@RestController
@RequestMapping(value="/album")
public class AlbumController {

	@Autowired
	AlbumService albumService;
	
	@Autowired
	AlbumConverter albumConverter;
	
	@GetMapping("/albums")
	public List< AlbumDto>listAll(){
		List<Album> findAll = albumService.listAlbum();
		return albumConverter.entityToDto(findAll);
	}
	
	@GetMapping("/sql/id")
	public List<AlbumDto>sqlId(@RequestBody AlbumDto dto){
		
		Album album = albumConverter.dtoToEntity(dto);
		List<Album> find = albumService.sqlId(album);
		
		return albumConverter.entityToDto(find);
	}
	
	@GetMapping("/albums/{id}")
	public Optional<Album> findAlbum(AlbumDto dto) {
		Album album = albumConverter.dtoToEntity(dto);		
		return albumService.findAlbum(album);
	}
	
	@PostMapping("/albums")
	public AlbumDto saveAlbum(@RequestBody AlbumDto dto) {
		
		Album album = albumConverter.dtoToEntity(dto);
		album = albumService.saveAlbum(album);
		return albumConverter.entityToDto(album);
	}
	
	@PutMapping("/albums")
	public AlbumDto updateAlbum(@RequestBody AlbumDto dto) {
		
		Album album = albumConverter.dtoToEntity(dto);
		album = albumService.updateAlbum(album);
		
		return albumConverter.entityToDto(album);
	}
	
	@DeleteMapping("/albums")
	public void deleComments(@RequestBody AlbumDto dto) {
		Album album = albumConverter.dtoToEntity(dto);
		albumService.deleteAlbum(album);
	}
}
