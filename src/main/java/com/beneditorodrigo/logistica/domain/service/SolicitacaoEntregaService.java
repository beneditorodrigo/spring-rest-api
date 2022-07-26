package com.beneditorodrigo.logistica.domain.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.beneditorodrigo.logistica.domain.model.Cliente;
import com.beneditorodrigo.logistica.domain.model.Entrega;
import com.beneditorodrigo.logistica.domain.model.StatusEntrega;
import com.beneditorodrigo.logistica.domain.repository.EntregaRepository;

@Service
public class SolicitacaoEntregaService {

	@Autowired
	private CatalogoClienteService catalogoClienteService;
	@Autowired
	private EntregaRepository entregaRepository;
	
	@Transactional
	public Entrega solicitar(Entrega entrega) {
		
		Cliente cliente = catalogoClienteService.buscar(entrega.getCliente().getId());
		
		entrega.setCliente(cliente);
		entrega.setStatus(StatusEntrega.PENDENTE);
		entrega.setDataPedido(LocalDateTime.now());
		
		return entregaRepository.save(entrega);
	}
}
