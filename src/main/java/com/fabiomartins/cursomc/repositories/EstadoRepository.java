package com.fabiomartins.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiomartins.cursomc.domain.Estado;



public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	
}
