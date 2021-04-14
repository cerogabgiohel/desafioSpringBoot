package models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import javassist.SerialVersionUID;

@Entity
@Table(name="TB_Post")
public class Post implements Serializable{
	
	private static final long SerialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String text;
	private String links;
	
	
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
	public String getLinks() {
		return links;
	}
	public void setLinks(String links) {
		this.links = links;
	}
		
	

	
	

}
