package com.fabiomartins.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiomartins.cursomc.domain.Categoria;
import com.fabiomartins.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired //instanciada automaticamente injecao de dependencia ou inversão de controle  
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
