package com.beneditorodrigo.logistica.api.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beneditorodrigo.logistica.domain.model.Cliente;

@RestController
public class ClienteController {

	@PersistenceContext
	private EntityManager manager;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		return manager.createQuery("from Cliente", Cliente.class).getResultList();
	}
	
}
