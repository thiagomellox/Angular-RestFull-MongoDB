package br.com.contabilizei.dao;

import java.util.List;

import br.com.contabilizei.controller.model.Cliente;


public interface ClienteDAO {

	int create(Cliente cliente);

	List<Cliente> findAll();

	
	
	
}
