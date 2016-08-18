package br.com.contabilizei.dao.impl;


import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import br.com.contabilizei.controller.model.Produto;
import br.com.contabilizei.dao.ProdutoDAO;

public class ProdutoDAOImpl extends MongoDAO implements ProdutoDAO {

	MongoCollection<Document> col;
	
	@Override
	public int create(Produto produto) {
		if (conectar()) {
			col = db.getCollection("produto");
			Document doc = new Document();
			doc.append(Produto.CODIGO, produto.getCodigo());
			doc.append(Produto.DESCRICAO, produto.getDescricao());
			doc.append(Produto.QUANTIDADE, produto.getQuantidade());
			doc.append(Produto.VALOR, produto.getValor());
			
			col.insertOne(doc);
			desconectar();
			return 1;
		}
		return 0;
	}

	@Override
	public List<Produto> findAll() {
		List<Produto> lista = new ArrayList<Produto>();
		if (conectar()) {
			col = db.getCollection("produto");
			MongoCursor<Document> cursor = col.find().iterator();
			Document doc;
			while (cursor.hasNext()) {
				doc = cursor.next();
				lista.add(new Produto(doc));
			}
			cursor.close();
			desconectar();
		}
		return lista;
	}
	
	public List<Produto> findById() {
		List<Produto> lista = new ArrayList<Produto>();
		if (conectar()) {
			col = db.getCollection("produto");
			MongoCursor<Document> cursor = col.find().iterator();
			Document doc;
			while (cursor.hasNext()) {
				doc = cursor.next();
				lista.add(new Produto(doc));
			}
			cursor.close();
			desconectar();
		}
		return lista;
	}

}
