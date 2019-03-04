package com.fabiomartins.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiomartins.cursomc.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer>{
	
}
