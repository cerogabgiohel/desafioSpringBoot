package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User>listUsers(){
		return userRepository.findAll();
	}
	
	public Optional<User> findUser(User user) {
		if(userRepository.existsById(user.getId())) {
			return userRepository.findById(user.getId());
		}
		return null;
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public void updateUser(User user) {
		if(userRepository.existsById(user.getId())) {
			userRepository.save(user);
		}			
	}
	
	public void delete(User user) {
		if(userRepository.existsById(user.getId())) {
			userRepository.delete(user);
		}
	}
	

}
