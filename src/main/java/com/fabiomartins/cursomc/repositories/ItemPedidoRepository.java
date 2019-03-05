package com.fabiomartins.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiomartins.cursomc.domain.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer>{
	
}
