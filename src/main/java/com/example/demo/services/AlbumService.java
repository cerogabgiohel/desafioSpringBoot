package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.AlbumRepository;
import com.example.demo.models.Album;
import com.example.demo.models.Image;

@Service
public class AlbumService {

	@Autowired
	AlbumRepository albumRepository;
	
	public List<Album>listAlbum(){
		return albumRepository.findAll();
	}
	
	public Optional<Album> findAlbum(Album album) {
		if(albumRepository.existsById(album.getId())) {
			return albumRepository.findById(album.getId());
		}
		return null;
	}
	
	public Album saveAlbum(Album album) {
		for(Image image: album.getImage()) {
			image.setAlbum(album);
		}
		return albumRepository.save(album);
	}
	
	public Album updateAlbum(Album album) {
		if(albumRepository.existsById(album.getId())){
			for(Image image: album.getImage()) {
				image.setAlbum(album);		
				return albumRepository.save(album);
			}
		}
		return null;
		
	}
	
	public void deleteAlbum(Album album) {
		if(albumRepository.existsById(album.getId())) {
			albumRepository.deleteById(album.getId());
		}
	}
}
