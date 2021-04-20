package com.example.demo.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

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
	
	@Column(name="posts")
	@OneToMany(targetEntity = Post.class)
	private List<Post> post;
	
	@Column(name="comments")
	@OneToMany(targetEntity = Comment.class)
	private List<Comment> comment;	
	
	@Column(name = "albums")
	@OneToMany(targetEntity = Album.class)
	private List<Album> album;
	
	@Column(name = "images")
	@OneToMany(targetEntity = Image.class)
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

	public List getPost() {
		return post;
	}

	public void setPost(List post) {
		this.post = post;
	}

	public List getComment() {
		return comment;
	}

	public void setComment(List comment) {
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