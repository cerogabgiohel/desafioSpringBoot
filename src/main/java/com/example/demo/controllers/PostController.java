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

import com.example.demo.services.PostService;
import com.example.demo.converter.PostConverter;
import com.example.demo.dto.PostDto;
import com.example.demo.models.Post;

@RestController
@RequestMapping(value="/post")
public class PostController {

	@Autowired
	PostService postService;
	
	@Autowired
	PostConverter postConverter;
	
	@GetMapping("/posts")
	public List<PostDto> listPosts(){
		List<Post> findAll = postService.listPosts();
		return postConverter.entityToDto(findAll);
	}
	
	@GetMapping("/sql/id")
	public List<PostDto>sqlId(@RequestBody PostDto dto){
		Post post = postConverter.dtoToEntity(dto);
		List<Post> find = postService.sqlId(post);
		return postConverter.entityToDto(find);
	}
	
	@GetMapping("/sql/contains")
	public List<PostDto>sqlPost(@RequestBody PostDto dto){
		Post post = postConverter.dtoToEntity(dto);
		List<Post> find = postService.sqlPost(post);
		return postConverter.entityToDto(find);
	}
	
	@GetMapping("/posts/{id}")
	public Optional<Post> findPost(PostDto dto) {
		Post post = postConverter.dtoToEntity(dto);
		return postService.findPost(post);
	}
	
	@PostMapping("/posts")
	public PostDto savePost(@RequestBody PostDto dto) {
		Post post = postConverter.dtoToEntity(dto);
		post = postService.savePost(post);
		return postConverter.entityToDto(post);
	}
	
	@PutMapping("/posts")
	public PostDto updatePost(@RequestBody PostDto dto) {
		Post post = postConverter.dtoToEntity(dto);
		post = postService.updatePost(post);
		return postConverter.entityToDto(post);
	}
	
	@DeleteMapping("/posts")
	public void deletePost(@RequestBody PostDto dto) {
		Post post = postConverter.dtoToEntity(dto);
		postService.deletePost(post);		
	}
}
