package com.beneditorodrigo.logistica.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beneditorodrigo.logistica.domain.model.Entrega;
import com.beneditorodrigo.logistica.domain.service.SolicitacaoEntregaService;

@RestController
@RequestMapping("/entregas")
public class EntregaController {

	@Autowired
	SolicitacaoEntregaService solicitacaoEntregaService;
	
	@PostMapping
	public Entrega solicita(@RequestBody Entrega entrega) {
		return solicitacaoEntregaService.solicitar(entrega);
	}
}
