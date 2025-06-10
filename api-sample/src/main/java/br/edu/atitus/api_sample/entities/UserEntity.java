package br.edu.atitus.api_sample.entities;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserEntity {
	
	private UUID id;
	
	private String name;
	
	private String email;
	
	@JsonIgnore
	private String password;
	
	private UserType type;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}
	
	

}
