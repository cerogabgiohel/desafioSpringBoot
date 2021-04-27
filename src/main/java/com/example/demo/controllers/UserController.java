package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;

@RestController
@RequestMapping(value ="/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public List<User>listAll(){
		return userService.listUsers();
	}
	
	@GetMapping("/sql/id")
	public List<User>sqlId(@RequestBody User user){
		return userService.sqlId(user);
	}

	@GetMapping("/sql/name")
	public List<User>sqlName(@RequestBody User user){
		return userService.sqlName(user);
	}
	
	@GetMapping("/users/{id}")
	public Optional<User> listUser(User user) {
		return userService.findUser(user);		
	}
	
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@PutMapping("/users/post")
	public User updateUserPost(@RequestBody User user) {
		return userService.updateUserPost(user);
	}
	
	@PutMapping("/users/comment")
	public User updateUserComment(@RequestBody User user) {
		return userService.updateUserComment(user);
	}

	@PutMapping("/users/image")
	public User updateUserImage(@RequestBody User user) {
		return userService.updateUserImage(user);
	}	
	
	@PutMapping("/users/album")
	public User updateUserAlbum(@RequestBody User user) {
		return userService.updateUserAlbum(user);
	}	
	
	@DeleteMapping("/users")
	public void deleteUser(@RequestBody User user) {
		userService.delete(user);
	}
}
