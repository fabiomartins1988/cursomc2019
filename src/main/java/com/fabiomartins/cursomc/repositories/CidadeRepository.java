package com.fabiomartins.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiomartins.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{
	
}
