package br.com.contabilizei.dao.impl;


import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import br.com.contabilizei.controller.model.Cliente;
import br.com.contabilizei.controller.model.Pedido;
import br.com.contabilizei.dao.ClienteDAO;

public class ClienteDAOImpl extends MongoDAO implements ClienteDAO {

	MongoCollection<Document> col;
	
	@Override
	public int create(Cliente cliente) {
		if (conectar()) {
			col = db.getCollection("cliente");
			Document doc = new Document();
			doc.append(Cliente.CPF_CNPJ, cliente.getCpfCnpj());
			doc.append(Cliente.NOME_RAZAO, cliente.getNomeRazao());
			doc.append(Cliente.EMAIL, cliente.getEmail());
			
			col.insertOne(doc);
			desconectar();
			return 1;
		}
		return 0;
	}

	@Override
	public List<Cliente> findAll() {
		List<Cliente> lista = new ArrayList<Cliente>();
		if (conectar()) {
			col = db.getCollection("cliente");
			MongoCursor<Document> cursor = col.find().iterator();
			Document doc;
			while (cursor.hasNext()) {
				doc = cursor.next();
				lista.add(new Cliente(doc));
			}
			cursor.close();
			desconectar();
		}
		return lista;
	}
	
	public List<Pedido> findById() {
		List<Pedido> lista = new ArrayList<Pedido>();
		if (conectar()) {
			col = db.getCollection("cliente");
			MongoCursor<Document> cursor = col.find().iterator();
			Document doc;
			while (cursor.hasNext()) {
				doc = cursor.next();
				lista.add(new Pedido(doc));
			}
			cursor.close();
			desconectar();
		}
		return lista;
	}

}
