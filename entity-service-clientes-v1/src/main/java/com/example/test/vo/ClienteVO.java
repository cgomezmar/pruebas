package com.example.test.vo;

import java.io.Serializable;

public class ClienteVO implements Serializable {
	
	private static final long serialVersionUID = 6330556468302076168L;
	private long id;
	private String nombre;
	private String email;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
