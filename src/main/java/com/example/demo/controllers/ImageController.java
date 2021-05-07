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

import com.example.demo.converter.ImageConverter;
import com.example.demo.dto.ImageDto;
import com.example.demo.models.Image;
import com.example.demo.services.ImageService;

@RestController
@RequestMapping(value="/image")
public class ImageController {
	
	@Autowired
	ImageService imageService;
	
	@Autowired
	ImageConverter imageConverter;
	
	@GetMapping("/images")
	public List<ImageDto> listImages(){
		List<Image> findAll = imageService.listImages();
		return imageConverter.entityToDto(findAll);
	}
	
	@GetMapping("/sql/id")
	public List<ImageDto>sqlId(@RequestBody ImageDto dto){
		Image image = imageConverter.dtoToEntity(dto);
		List<Image> find= imageService.sqlId(image);		
		return imageConverter.entityToDto(find);
	}
	
	@GetMapping("/images/{id}")
	public Optional<Image> findImage(ImageDto dto) {
		Image image = imageConverter.dtoToEntity(dto);
		return imageService.findImage(image);
	}	
	
	@PostMapping("/images")
	public void saveImage(@RequestBody ImageDto dto) {
		Image image = imageConverter.dtoToEntity(dto);
		imageService.saveImages(image);
	}
	
	@PutMapping("/images")
	public void updateImage(@RequestBody ImageDto dto) {
		Image image = imageConverter.dtoToEntity(dto);		
		imageService.updateImage(image);
	}
	
	@DeleteMapping("/images")
	public void deletePost(@RequestBody ImageDto dto) {
		Image image = imageConverter.dtoToEntity(dto);
		imageService.deleteImage(image);		
	}

}
