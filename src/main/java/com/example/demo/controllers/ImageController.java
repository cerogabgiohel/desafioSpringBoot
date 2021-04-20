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

import com.example.demo.models.Image;
import com.example.demo.services.ImageService;

@RestController
@RequestMapping(value="/image")
public class ImageController {
	
	@Autowired
	ImageService imageService;
	
	@GetMapping("/images")
	public List<Image> listImages(){
		return imageService.listImages();
	}
	
	@GetMapping("/images/{id}")
	public Optional<Image> findImage(Image image) {
		return imageService.findImage(image);
	}	
	
	@PostMapping("/images")
	public void saveImage(@RequestBody Image image) {
		imageService.saveImages(image);
	}
	
	@PutMapping("/images")
	public void updateImage(@RequestBody Image image) {
		imageService.updateImage(image);
	}
	
	@DeleteMapping("/images")
	public void deletePost(@RequestBody Image image) {
		imageService.deleteImage(image);		
	}

}
