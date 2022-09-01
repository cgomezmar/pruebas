package com.example.test.services;

public interface ClienteService {
	
	public Object consultaCliente (long id);

	public Object actualizarCliente (long id, String nombre, String email);
	
	public Object agregarCliente (long id);
	
	public Object eliminarCliente (long id);

}
