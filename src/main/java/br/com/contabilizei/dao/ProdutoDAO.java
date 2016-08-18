package br.com.contabilizei.dao;

import java.util.List;

import br.com.contabilizei.controller.model.Produto;


public interface ProdutoDAO {

	int create(Produto cliente);

	List<Produto> findAll();

	
	
}
