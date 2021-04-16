package com.example.demo.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	private List post;
	
	@Column(name="comments")
	@OneToMany(targetEntity = Comment.class)
	private List comment;	

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

}