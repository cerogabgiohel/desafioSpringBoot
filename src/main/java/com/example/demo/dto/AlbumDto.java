package com.example.demo.dto;

import java.util.List;

import com.example.demo.models.Image;
import com.example.demo.models.User;

public class AlbumDto {

	private Long id;
	private List<Image>image;
	private User user;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Image> getImage() {
		return image;
	}
	public void setImage(List<Image> image) {
		this.image = image;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
