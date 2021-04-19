package com.example.demo.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

@Entity
@Table(name="Tb_Post")
public class Post implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="idPost")
	@SequenceGenerator(name="idPost",initialValue = 1, allocationSize = 1, sequenceName = "IdPostSeq")	
	private long id;
	
	@Column(name="post")
	@NotBlank
	private String text;	
	
	@OneToMany(targetEntity = Comment.class)	
	@Column(name="comment")
	private List<Comment> comments;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List getComments() {
		return comments;
	}

	public void setComments(List comments) {
		this.comments = comments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}		
	
}
