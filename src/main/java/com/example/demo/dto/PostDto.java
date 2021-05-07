package com.example.demo.dto;

import java.util.List;
import com.example.demo.models.Comment;
import com.example.demo.models.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class PostDto {

	private Long id;
	private String text;
	private List<Comment> comment;
	private User user;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	
	@JsonIgnore
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
