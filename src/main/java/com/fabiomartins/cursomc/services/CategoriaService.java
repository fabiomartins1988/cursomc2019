package com.fabiomartins.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiomartins.cursomc.domain.Categoria;
import com.fabiomartins.cursomc.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;


@Service
public class CategoriaService {
	
	@Autowired //instanciada automaticamente injecao de dependencia ou inversão de controle  
	private CategoriaRepository repo;
	
	
	
	public Categoria find(Integer id) throws ObjectNotFoundException {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Categoria update(Categoria obj) throws ObjectNotFoundException {
		find(obj.getId()); //chama o metodo find, para realizar a busca do id
		return repo.save(obj);
	}
}
