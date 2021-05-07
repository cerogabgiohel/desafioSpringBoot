package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Comment;
import com.example.demo.models.Post;
import com.example.demo.repositories.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public List<Post>listPosts(){
		return postRepository.findAll();
	}
	
	public List<Post>sqlId(Post post){
		return postRepository.sqlId(post.getId());
	}
	
	public List<Post>sqlPost(Post post){
		return postRepository.sqlPost(post.getText());
	}
	
	public Optional<Post> findPost(Post post) {
			
		return postRepository.findById(post.getId());	
	}
	
	public Post savePost(Post post) {
		for(Comment comment:post.getComments()) {
			comment.setPost(post);			
		}
		return postRepository.save(post);
	}
	
	public Post updatePost(Post post) {
		if(postRepository.existsById(post.getId())) {			
			for(Comment comment:post.getComments()) {
				comment.setPost(post);
			}

			return postRepository.save(post);
		}
		return null;
		
	}
	
	public void deletePost(Post post) {
		if(postRepository.existsById(post.getId())){
			postRepository.delete(post);
		}
	}
}
