package com.example.demoReplay.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
public class User {
	@Id
	@GeneratedValue( strategy=GenerationType.AUTO )
	private int id;
	
	@Valid
	@Size( min=1, max=32, message="Name must be between 1-32 characters!" )
	private String name;

	@Email( message="Invalid Email Format. Example: example@example.com")
	private String email;
	
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
}