package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.CommentRepository;
import com.example.demo.models.Comment;

@Service
public class CommentService {
	
	@Autowired
	CommentRepository commentRepository;
	
	public List<Comment>listComments(){
		return commentRepository.findAll();
	}
	
	public List<Comment>sqlId(Comment comment){
		return commentRepository.sqlId(comment.getIdComment());
	}	
	
	public List<Comment>sqlContains(Comment comment){
		return commentRepository.sqlComment(comment.getText());
	}	
	
	public Optional<Comment> findComment(Comment comment){
		
		return commentRepository.findById(comment.getIdComment());
	}
	
	public void saveComment(Comment comment) {
		commentRepository.save(comment);
	}
	
	public void updateComment(Comment comment) {
		if(commentRepository.existsById(comment.getIdComment())) {
			commentRepository.save(comment);
		}
	}
	
	public void deleteComment(Comment comment) {
		if(commentRepository.existsById(comment.getIdComment())){
			commentRepository.deleteById(comment.getIdComment());
		}

	}
	
}
