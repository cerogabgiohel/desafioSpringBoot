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

import com.example.demo.repositories.PostRepository;
import com.example.demo.services.PostService;
import com.example.demo.models.Post;

@RestController
@RequestMapping(value="/post")
public class PostController {

	@Autowired
	PostService postService;
	
	@GetMapping("/posts")
	public List<Post> listPosts(){
		return postService.listPosts();
	}
	
	@GetMapping("/sql/id")
	public List<Post>sqlId(@RequestBody Post post){
		return postService.sqlId(post);
	}
	
	@GetMapping("/sql/contains")
	public List<Post>sqlPost(@RequestBody Post post){
		return postService.sqlPost(post);
	}
	
	@GetMapping("/posts/{id}")
	public Optional<Post> findPost(Post post) {
		return postService.findPost(post);
	}
	
	@PostMapping("/posts")
	public Post savePost(@RequestBody Post post) {
		return postService.savePost(post);
	}
	
	@PutMapping("/posts")
	public Post updatePost(@RequestBody Post post) {
		return postService.updatePost(post);
	}
	
	@DeleteMapping("/posts")
	public void deletePost(@RequestBody Post post) {
		postService.deletePost(post);		
	}
}
