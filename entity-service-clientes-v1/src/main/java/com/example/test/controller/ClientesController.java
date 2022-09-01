package com.example.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.test.services.ClienteService;

@RestController
@RequestMapping("/api/v1.0/entity/service/clientes")
public class ClientesController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getCliente (@PathVariable (required = true) long id){
		return new ResponseEntity<>(clienteService.consultaCliente(id), HttpStatus.OK);
	}
	
	@PutMapping("/{id}/{nombre}/{email}")
	public ResponseEntity<?> updateCliente (@PathVariable (required = true) long id, @PathVariable String nombre, @PathVariable String email){
		Map<String, String> response = new HashMap<String, String>();
		response.put("descripcionError", "Se actualiza correctamente la información del id: " + id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PostMapping("/{id}/{nombre}/{email}")
	public ResponseEntity<?> agregarCliente (@PathVariable (required = true) long id, @PathVariable (required = true) String nombre, @PathVariable String email){
		Map<String, String> response = new HashMap<String, String>();
		response.put("descripcionError", "Se registro correctamente la información proporcionada.");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminarCliente (@PathVariable (required = true) long id){
		Map<String, String> response = new HashMap<String, String>();
		response.put("descripcionError", "Se dio de baja correctamente la información del id: " + id);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
