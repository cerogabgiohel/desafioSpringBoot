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

import com.example.demo.converter.CommentConverter;
import com.example.demo.dto.CommentDto;
import com.example.demo.models.Comment;
import com.example.demo.services.CommentService;

@RestController
@RequestMapping(value="/comment")
public class CommentController {

	@Autowired
	CommentService commentService;
	
	@Autowired
	CommentConverter commentConverter;
	
	@GetMapping("/comments")
	public List<CommentDto>listComments(){
		List<Comment> findAll = commentService.listComments();
		return commentConverter.entityToDto(findAll);		
	}
	
	@GetMapping("/sql/id")
	public List<CommentDto>sqlId(@RequestBody CommentDto dto){
		Comment comment = commentConverter.dtoToEntity(dto);
		List<Comment> find = commentService.sqlId(comment);
		return commentConverter.entityToDto(find);
	}
	
	@GetMapping("/sql/contains")
	public List<CommentDto>sqlComment(@RequestBody CommentDto dto){
		Comment comment = commentConverter.dtoToEntity(dto);
		List<Comment> find = commentService.sqlContains(comment);
		return commentConverter.entityToDto(find);
	}
	
	@GetMapping("/comments/{idComment}")
	public Optional<Comment> findComment(CommentDto dto) {
		Comment comment = commentConverter.dtoToEntity(dto);
		
		return commentService.findComment(comment);
	}
	
	@PostMapping("/comments")
	public void saveComments(@RequestBody CommentDto dto) {
		Comment comment = commentConverter.dtoToEntity(dto);		
		commentService.saveComment(comment);
	}
	
	@PutMapping("/comments")
	public void updateComments(@RequestBody CommentDto dto) {
		Comment comment = commentConverter.dtoToEntity(dto);		
		commentService.updateComment(comment);
	}	
	
	@DeleteMapping("/comments")
	public void deleteComments(@RequestBody CommentDto dto) {
		Comment comment = commentConverter.dtoToEntity(dto);		
		commentService.deleteComment(comment);
	}
}
