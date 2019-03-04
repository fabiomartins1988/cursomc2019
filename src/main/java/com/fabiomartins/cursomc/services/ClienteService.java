package com.fabiomartins.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiomartins.cursomc.domain.Cliente;
import com.fabiomartins.cursomc.repositories.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;


@Service
public class ClienteService {
	
	@Autowired //instanciada automaticamente injecao de dependencia ou inversão de controle  
	private ClienteRepository repo;
	
	
	
	public Cliente find(Integer id) throws ObjectNotFoundException {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
