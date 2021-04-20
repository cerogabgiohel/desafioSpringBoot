package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Post;
import com.example.demo.repositories.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public List<Post>listPosts(){
		return postRepository.findAll();
	}
	
	public Optional<Post> findPost(Post post) {
		if(postRepository.existsById(post.getId())) {
			return postRepository.findById(post.getId());
		}
		return null;
	}
	
	public void savePost(Post post) {
		postRepository.save(post);
	}
	
	public void updatePost(Post post) {
		if(postRepository.existsById(post.getId())) {
			postRepository.save(post);
		}
	}
	
	public void deletePost(Post post) {
		if(postRepository.existsById(post.getId())){
			postRepository.delete(post);
		}
	}
}
