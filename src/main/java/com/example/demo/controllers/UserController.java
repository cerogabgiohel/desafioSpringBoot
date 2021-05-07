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

import com.example.demo.converter.UserConverter;
import com.example.demo.dto.UserDto;
import com.example.demo.models.User;
import com.example.demo.services.UserService;

@RestController
@RequestMapping(value ="/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	UserConverter userConverter;
	
	@GetMapping("/users")
	public List<UserDto>listAll(){
		List<User> findAll = userService.listUsers();
		return userConverter.entityToDto(findAll);
	}
	
	@GetMapping("/sql/id")
	public List<UserDto>sqlId(@RequestBody UserDto dto){
		User user = userConverter.dtoToEntity(dto);	
		List<User> find = userService.sqlId(user);
		
		return userConverter.entityToDto(find);
	}

	@GetMapping("/sql/name")
	public List<UserDto>sqlName(@RequestBody UserDto dto){
		User user = userConverter.dtoToEntity(dto);	
		List<User> find = userService.sqlName(user);
		
		return userConverter.entityToDto(find);
	}
	
	@GetMapping("/sql/contains")
	public List<UserDto>sqlNameContains(@RequestBody UserDto dto){
		User user = userConverter.dtoToEntity(dto);	
		List<User> find = userService.sqlNameContains(user);
		
		return userConverter.entityToDto(find);
	}
	
	@GetMapping("/sql/starts")
	public List<UserDto>sqlStartsBy(@RequestBody UserDto dto){
		User user = userConverter.dtoToEntity(dto);	
		List<User> find = userService.sqlStartsBy(user);
		
		return userConverter.entityToDto(find);
	}
	
	@GetMapping("/sql/ends")
	public List<UserDto>sqlEndsBy(@RequestBody UserDto dto){
		User user = userConverter.dtoToEntity(dto);	
		List<User> find = userService.sqlEndsBy(user);
		
		return userConverter.entityToDto(find);
	}	
	
	@GetMapping("/sql/join")
	public List<UserDto>sqlJoin(@RequestBody UserDto dto){
		User user = userConverter.dtoToEntity(dto);	
		List<User> find = userService.sqlJoin(user);
		
		return userConverter.entityToDto(find);
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> listUser(UserDto dto) {
		User user = userConverter.dtoToEntity(dto);
		
		return userService.findUser(user);		
	}
	
	@PostMapping("/users")
	public UserDto saveUser(@RequestBody UserDto dto) {
		
		User user = userConverter.dtoToEntity(dto);		
		user = userService.saveUser(user);
		
		return userConverter.entityToDto(user);
	}
	
	@PutMapping("/users")
	public UserDto updateUser(@RequestBody UserDto dto) {

		User user = userConverter.dtoToEntity(dto);
		user = userService.updateUser(user);
		return userConverter.entityToDto(user);
	}
	
	@PutMapping("/users/post")
	public UserDto updateUserPost(@RequestBody UserDto dto) {

		User user = userConverter.dtoToEntity(dto);
		user = userService.updateUserPost(user);
		return userConverter.entityToDto(user);
	}
	
	@PutMapping("/users/comment")
	public UserDto updateUserComment(@RequestBody UserDto dto) {
		User user = userConverter.dtoToEntity(dto);
		user = userService.updateUserComment(user);
		return userConverter.entityToDto(user);
	}

	@PutMapping("/users/image")
	public UserDto updateUserImage(@RequestBody UserDto dto) {
		User user = userConverter.dtoToEntity(dto);
		user = userService.updateUserImage(user);
		return userConverter.entityToDto(user);
	}	
	
	@PutMapping("/users/album")
	public UserDto updateUserAlbum(@RequestBody UserDto dto) {
		User user = userConverter.dtoToEntity(dto);
		user = userService.updateUserAlbum(user);
		return userConverter.entityToDto(user);
	}	
	
	@DeleteMapping("/users")
	public void deleteUser(@RequestBody UserDto dto) {
		User user = userConverter.dtoToEntity(dto);
		userService.delete(user);
	}
}
