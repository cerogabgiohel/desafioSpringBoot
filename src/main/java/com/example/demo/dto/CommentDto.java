package com.example.demo.dto;

import com.example.demo.models.Post;
import com.example.demo.models.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class CommentDto {
	
	private Long idComment;
	private String text;
	private Post post;	
	private User user;
	
	public Long getIdComment() {
		return idComment;
	}
	public void setIdComment(Long idComment) {
		this.idComment = idComment;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@JsonIgnore
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	
	@JsonIgnore
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	

}
