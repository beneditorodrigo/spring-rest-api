package com.beneditorodrigo.logistica.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beneditorodrigo.logistica.domain.model.Entrega;
import com.beneditorodrigo.logistica.domain.repository.EntregaRepository;

@Service
public class FinalizacaoEntregaService {

	@Autowired
	private EntregaRepository entregaRepository;
	
	@Autowired
	private BuscaEntregaService buscaEntregaService;
	
	public void finalizar(Long entregaId) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		
		entrega.finalizar();
		
		entregaRepository.save(entrega);
	}
}
