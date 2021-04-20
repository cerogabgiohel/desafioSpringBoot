package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.AlbumRepository;
import com.example.demo.models.Album;

@Service
public class AlbumService {

	@Autowired
	private AlbumRepository albumRepository;
	
	public List<Album>listImages(){
		return albumRepository.findAll();
	}
	
	public Optional<Album> findImage(Album album) {
		if(albumRepository.existsById(album.getId())) {
			return albumRepository.findById(album.getId());
		}
		return null;
	}
	
	public void saveImage(Album album) {
		albumRepository.save(album);
	}
	
	public void updateImage(Album album) {
		if(albumRepository.existsById(album.getId())){
			albumRepository.save(album);
		}
	}
	
	public void deleteImage(Album album) {
		if(albumRepository.existsById(album.getId())) {
			albumRepository.deleteById(album.getId());
		}
	}
}
