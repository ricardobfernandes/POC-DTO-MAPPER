package com.ricardo.POCdtomapper.model;

//This is a simple POC not drive by DDD architecture

public class Client {

	private Long id;
	private String name;
	private String email;

	public Client(Long id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
}
