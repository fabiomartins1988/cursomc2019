package com.fabiomartins.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiomartins.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
}
