package com.example.demo.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.dto.ImageDto;
import com.example.demo.models.Image;

@Component
public class ImageConverter{

	public ImageDto entityToDto(Image image) {
		
		ImageDto dto = new ImageDto();		
		dto.setId(image.getId());		
		dto.setUrlImage(image.getImageUrl());
		dto.setAlbum(image.getAlbum());
		dto.setUser(image.getUser());
		return dto;
	}
	
	public List<ImageDto> entityToDto(List<Image> image){
		
		return image.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
	}
	
	public Image dtoToEntity(ImageDto dto) {
		Image image = new Image();
		if(dto.getId()==null) {
			image.setImageUrl(dto.getUrlImage());
			image.setAlbum(dto.getAlbum());	
			image.setUser(dto.getUser());
		}else {
			image.setId(dto.getId());
			image.setAlbum(dto.getAlbum());
			image.setUser(dto.getUser());
			image.setImageUrl(dto.getUrlImage());	
		}
		
		return image;
	}
	
	public List<Image> dtoToEntity(List<ImageDto> dto){
		
		return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}
	
}
