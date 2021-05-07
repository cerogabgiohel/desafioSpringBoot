package com.example.demo.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.dto.UserDto;
import com.example.demo.models.User;

@Component
public class UserConverter {
	
	public UserDto entityToDto(User user) {
		
		UserDto dto = new UserDto();		
		dto.setId(user.getId());		
		dto.setName(user.getName());
		dto.setPassword(user.getPassword());
		dto.setImage(user.getImage());
		dto.setAlbum(user.getAlbum());
		dto.setPost(user.getPost());
		dto.setComment(user.getComment());
		return dto;
	}
	
	public List<UserDto> entityToDto(List<User> user){
		
		return user.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
	}
	
	public User dtoToEntity(UserDto dto) {
		User user = new User();
		if(dto.getId()==null) {
			user.setName(dto.getName());
			user.setPassword(dto.getPassword());
			user.setAlbum(dto.getAlbum());
			user.setImage(dto.getImage());
			user.setPost(dto.getPost());
			user.setComment(dto.getComment());
		}else {
			user.setId(dto.getId());			
			user.setName(dto.getName());
			user.setPassword(dto.getPassword());	
			user.setAlbum(dto.getAlbum());
			user.setImage(dto.getImage());
			user.setPost(dto.getPost());
			user.setComment(dto.getComment());
		}
		
		return user;
	}
	
	public List<User> dtoToEntity(List<UserDto> dto){
		
		return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
