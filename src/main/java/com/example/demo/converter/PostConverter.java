package com.example.demo.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.dto.PostDto;
import com.example.demo.models.Post;

@Component
public class PostConverter {

	
	public PostDto entityToDto(Post post) {
		
		PostDto dto = new PostDto();		
		dto.setId(post.getId());		
		dto.setText(post.getText());
		dto.setComment(post.getComments());
		dto.setUser(post.getUser());
		return dto;
	}
	
	public List<PostDto> entityToDto(List<Post> post){
		
		return post.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
	}
	
	public Post dtoToEntity(PostDto dto) {
		Post post = new Post();
		if(dto.getId()==null) {
			post.setComments(dto.getComment());
			post.setText(dto.getText());
			post.setUser(dto.getUser());
		}else {
			post.setId(dto.getId());
			post.setComments(dto.getComment());
			post.setText(dto.getText());
			post.setUser(dto.getUser());	
		}
		
		return post;
	}
	
	public List<Post> dtoToEntity(List<PostDto> dto){
		
		return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}

}
