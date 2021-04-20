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

import com.example.demo.models.Album;
import com.example.demo.services.AlbumService;

@RestController
@RequestMapping(value="/album")
public class AlbumController {

	@Autowired
	AlbumService albumService;
	
	@GetMapping("/albums")
	public List<Album>listaAlbums(){
		return albumService.listImages();		
	}
	
	@GetMapping("/albums/{id}")
	public Optional<Album> findAlbum(Album album) {
		return albumService.findImage(album);
	}
	
	@PostMapping("/albums")
	public void saveComments(@RequestBody Album album) {
		albumService.saveImage(album);
	}
	
	@PutMapping("/albums")
	public void updateComments(@RequestBody Album album) {
		albumService.updateImage(album);
	}
	
	@DeleteMapping("/albums")
	public void deleComments(@RequestBody Album album) {
		albumService.deleteImage(album);
	}
}
