package com.beneditorodrigo.logistica.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beneditorodrigo.logistica.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Benedito Rodrigo de Sousa Cunha");
		cliente1.setTelefone("99 98888-3333");
		cliente1.setEmail("rodrigodacunha7@gmail.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("HyperTech Tecnologia");
		cliente2.setTelefone("88 93333-1111");
		cliente2.setEmail("aghypertech@gmail.com");
		return Arrays.asList(cliente1, cliente2);
	}
	
}
