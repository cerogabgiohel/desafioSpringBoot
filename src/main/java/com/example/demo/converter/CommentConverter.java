package com.example.demo.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.demo.dto.CommentDto;
import com.example.demo.models.Comment;

@Component
public class CommentConverter {
	

	public CommentDto entityToDto(Comment comment) {
		
		CommentDto dto = new CommentDto();		
		dto.setIdComment(comment.getIdComment());		
		dto.setText(comment.getText());
		dto.setPost(comment.getPost());
		dto.setUser(comment.getUser());
		return dto;
	}
	
	public List<CommentDto> entityToDto(List<Comment> comment){
		
		return comment.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
	}
	
	public Comment dtoToEntity(CommentDto dto) {
		Comment comment = new Comment();
		if(dto.getIdComment()==null) {
			comment.setText(dto.getText());
			comment.setPost(dto.getPost());
			comment.setUser(dto.getUser());
		}else {
			comment.setIdComment(dto.getIdComment());
			comment.setText(dto.getText());
			comment.setPost(dto.getPost());	
			comment.setUser(dto.getUser());
		}
		
		return comment;
	}
	
	public List<Comment> dtoToEntity(List<CommentDto> dto){
		
		return dto.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
	}


}
