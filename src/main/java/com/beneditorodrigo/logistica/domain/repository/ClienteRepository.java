package com.beneditorodrigo.logistica.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beneditorodrigo.logistica.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	//conversao por nome
	List<Cliente> findByNome(String nome);
	
	//conversao por parte do nome existente
	List<Cliente> findByNomeContaining(String nome);
}
