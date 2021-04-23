package com.example.demo.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Tb_User")
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="idUser")
	@SequenceGenerator(name="idUser",initialValue = 1, allocationSize = 1, sequenceName = "IdUserSeq")	
	private long id;
	
	@NotBlank
	private String name;	
	
	@NotBlank
	private String password;
	
	@OneToMany(targetEntity = Post.class, mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL) 
	private List<Post> post;	

	@OneToMany(targetEntity = Comment.class, mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	private List<Comment> comment;	
	
	@OneToMany(targetEntity = Album.class, mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	private List<Album> album;
	
	@OneToMany(targetEntity = Image.class, mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)	
	private List<Image> image;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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