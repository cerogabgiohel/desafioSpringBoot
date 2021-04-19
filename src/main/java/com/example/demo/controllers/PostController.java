package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositories.PostRepository;
import com.example.demo.models.Post;

@RestController
@RequestMapping(value="/post")
public class PostController {

	@Autowired
	PostRepository postRepository;
	
	@GetMapping("/posts")
	public List<Post> listPosts(){
		return postRepository.findAll();
	}
	
	@PostMapping("/posts")
	public Post savePost(@RequestBody Post post) {
		return postRepository.save(post);
	}
	
	@PutMapping("/posts")
	public Post updatePost(@RequestBody Post post) {
		return postRepository.save(post);
	}
	
	@DeleteMapping("/posts")
	public void deletePost(@RequestBody Post post) {
		postRepository.deleteById(post.getId());		
	}
}
