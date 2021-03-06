package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Image;
import com.example.demo.repositories.ImageRepository;

@Service
public class ImageService {
	
	@Autowired
	private ImageRepository imageRepository;
	
	public List<Image>listImages(){
		return imageRepository.findAll();
	}
	
	public List<Image>sqlId(Image image){
		return imageRepository.sqlId(image.getId());
	}
	
	
	public Optional<Image> findImage(Image image) {
		
		return imageRepository.findById(image.getId());
		
	}
	
	public void saveImages(Image image) {
		imageRepository.save(image);
	}
	
	public void updateImage(Image image) {
		if(imageRepository.existsById(image.getId())){
			imageRepository.save(image);
		}
	}
	
	public void deleteImage(Image image) {
		if(imageRepository.existsById(image.getId())) {
			imageRepository.deleteById(image.getId());
		}
	}

}
