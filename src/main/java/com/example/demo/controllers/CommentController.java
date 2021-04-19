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

import com.example.demo.models.Comment;
import com.example.demo.repositories.CommentRepository;

@RestController
@RequestMapping(value="/comment")
public class CommentController {

	@Autowired
	CommentRepository commentRepository;
	
	@GetMapping("/comments")
	public List<Comment>listComments(){
		return commentRepository.findAll();		
	}
	
	@PostMapping("/comments")
	public Comment saveComments(@RequestBody Comment comment) {
		return commentRepository.save(comment);
	}
	
	@PutMapping("/comments")
	public Comment updateComments(@RequestBody Comment comment) {
		return commentRepository.save(comment);
	}
	
	@DeleteMapping("/comments")
	public void deleComments(@RequestBody Comment comment) {
		commentRepository.deleteById(comment.getIdComment());
	}
}
