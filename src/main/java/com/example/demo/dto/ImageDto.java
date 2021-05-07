package com.example.demo.dto;

import com.example.demo.models.Album;
import com.example.demo.models.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ImageDto {
	
	private Long id;
	private String urlImage;
	private User user;
	private Album album;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	
	@JsonIgnore
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@JsonIgnore
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	
	

}
