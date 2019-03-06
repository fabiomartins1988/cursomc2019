package com.fabiomartins.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabiomartins.cursomc.domain.Pedido;
import com.fabiomartins.cursomc.repositories.PedidoRepository;
import com.fabiomartins.cursomc.services.exceptions.ObjectNotFoundException;




@Service
public class PedidoService {
	
	@Autowired //instanciada automaticamente injecao de dependencia ou inversão de controle  
	private PedidoRepository repo;
	
	
	
	public Pedido find(Integer id){
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
