package com.example.test.services;

import java.io.File;

import org.springframework.stereotype.Service;

import com.example.test.vo.ClienteVO;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Override
	public Object consultaCliente(long id) {
		// TODO Auto-generated method stub
		return leerArchivoJson();
	}

	@Override
	public Object actualizarCliente(long id, String nombre, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object agregarCliente(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object eliminarCliente(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private Object leerArchivoJson () {
		ObjectMapper mapper = new ObjectMapper();
		Object object = null;
		try {
			object = mapper.readValue (new File("../resources/test.json"), Object.class);
		} catch (Exception e) {
			e.printStackTrace();
			ClienteVO cliente = new ClienteVO();
			cliente.setId(1);
			cliente.setNombre("Nombre APaterno AMaterno");
			cliente.setEmail("test88686@gamil.com");
			return (Object) cliente;
		}
		return object;
	}

}
