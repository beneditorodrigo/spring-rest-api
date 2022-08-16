package com.beneditorodrigo.logistica.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beneditorodrigo.logistica.domain.exception.EntidadeNaoEncontradaException;
import com.beneditorodrigo.logistica.domain.model.Entrega;
import com.beneditorodrigo.logistica.domain.repository.EntregaRepository;

@Service
public class BuscaEntregaService {

	@Autowired
	private EntregaRepository entregaRepository;
	
	public Entrega buscar (Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
}
