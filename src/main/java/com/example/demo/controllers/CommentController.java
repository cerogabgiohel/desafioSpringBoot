package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Comment;
import com.example.demo.repositories.CommentRepository;
import com.example.demo.services.CommentService;

@RestController
@RequestMapping(value="/comment")
public class CommentController {

	@Autowired
	CommentService commentService;
	
	@GetMapping("/comments")
	public List<Comment>listComments(){
		return commentService.listComments();		
	}
	
	@GetMapping("/comments/{idComment}")
	public Optional<Comment> findComment(Comment comment) {
		return commentService.findComment(comment);
	}
	
	@PostMapping("/comments")
	public void saveComments(@RequestBody Comment comment) {
		commentService.saveComment(comment);
	}
	
	@PutMapping("/comments")
	public void updateComments(@RequestBody Comment comment) {
		commentService.updateComment(comment);
	}
	
	@DeleteMapping("/comments")
	public void deleComments(@RequestBody Comment comment) {
		commentService.deleteComment(comment);
	}
}
