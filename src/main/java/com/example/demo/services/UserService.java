package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Album;
import com.example.demo.models.Comment;
import com.example.demo.models.Image;
import com.example.demo.models.Post;
import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User>listUsers(){
		return userRepository.findAll();
	}
	
	public List<User>sqlId(User user){
		return userRepository.sqlId(user.getId());
	}	
	
	public List<User>sqlName(User user){
		return userRepository.sqlId(user.getName());
	}	
	
	public Optional<User> findUser(User user) {
		if(userRepository.existsById(user.getId())) {
			return userRepository.findById(user.getId());
		}
		return null;
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public User updateUser(User user) {
		if(userRepository.existsById(user.getId())) {				
			return userRepository.save(user);		
		}
		return null;
	}
	
	public User updateUserPost(User user) {
		if(userRepository.existsById(user.getId())) {			
			for(Post post:user.getPost()) {
				post.setUser(user);						
			}
			return userRepository.save(user);		
		}
		return null;
	}
	
	public User updateUserComment(User user) {
		if(userRepository.existsById(user.getId())) {			
			for(Comment comment:user.getComment()) {
				comment.setUser(user);						
			}
			return userRepository.save(user);		
		}
		return null;
	}
	
	public User updateUserImage(User user) {
		if(userRepository.existsById(user.getId())) {			
			for(Image image:user.getImage()) {
				image.setUser(user);						
			}
			return userRepository.save(user);		
		}
		return null;
	}
	
	public User updateUserAlbum(User user) {
		if(userRepository.existsById(user.getId())) {			
			for(Album album:user.getAlbum()) {
				album.setUser(user);						
			}
			return userRepository.save(user);		
		}
		return null;
	}
	public void delete(User user) {
		if(userRepository.existsById(user.getId())) {
			userRepository.delete(user);
		}
	}
	

}
