package com.example.demo.dto;

import java.util.List;
import com.example.demo.models.Album;
import com.example.demo.models.Comment;
import com.example.demo.models.Image;
import com.example.demo.models.Post;

public class UserDto {	

	private Long id;	
	private String name;
	private String password;
	private List<Post> post;	
	private List<Comment> comment;
	private List<Album> album;
	private List<Image> image;		
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Post> getPost() {
		return post;
	}
	public void setPost(List<Post> post) {
		this.post = post;
	}
	public List<Comment> getComment() {
		return comment;
	}
	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}
	public List<Album> getAlbum() {
		return album;
	}
	public void setAlbum(List<Album> album) {
		this.album = album;
	}
	public List<Image> getImage() {
		return image;
	}
	public void setImage(List<Image> image) {
		this.image = image;
	}
	
	
	
	
	
}
