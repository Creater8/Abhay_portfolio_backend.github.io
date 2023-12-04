package com.files.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "formdata")
public class recivedPersistenet 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
	String name;
	String email;
	String message;
	
	public recivedPersistenet() {
		// TODO Auto-generated constructor stub
	}
	
	public recivedPersistenet(String name, String email, String message,int id) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.message = message;
		
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "recivedPersistenet [id=" + id + ", name=" + name + ", email=" + email + ", message=" + message + "]";
	}
	
}
