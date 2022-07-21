package com.beneditorodrigo.logistica.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beneditorodrigo.logistica.domain.model.Cliente;
import com.beneditorodrigo.logistica.domain.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		return clienteRepository.findAll();
		//return clienteRepository.findByNome("HyperTech");
		//return clienteRepository.findByNomeContaining("Hy");
	}
	
}
