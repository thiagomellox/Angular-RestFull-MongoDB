package br.com.contabilizei.dao;

import java.util.List;

import br.com.contabilizei.controller.model.Pedido;


public interface PedidoDAO {

	int create(Pedido Pedido);

	List<Pedido> findAll();

	
	
	
}
