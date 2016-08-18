package br.com.contabilizei.dao.impl;


import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import br.com.contabilizei.controller.model.Pedido;
import br.com.contabilizei.dao.PedidoDAO;

public class PedidoDAOImpl extends MongoDAO implements PedidoDAO {

	MongoCollection<Document> col;
	
	@Override
	public int create(Pedido pedido) {
		if (conectar()) {
			col = db.getCollection("pedido");
			Document doc = new Document();
			doc.append(Pedido.COD_PEDIDO, pedido.getCodPedido());
			doc.append(Pedido.DATA_EMISSAO, pedido.getDataEmissao());
			doc.append(Pedido.NUMERO, pedido.getNumero());
			doc.append(Pedido.VALOR_TOTAL, pedido.getValorTotal());
			
			col.insertOne(doc);
			desconectar();
			return 1;
		}
		return 0;
	}

	@Override
	public List<Pedido> findAll() {
		List<Pedido> lista = new ArrayList<Pedido>();
		if (conectar()) {
			col = db.getCollection("pedido");
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
	
	public List<Pedido> findById() {
		List<Pedido> lista = new ArrayList<Pedido>();
		if (conectar()) {
			col = db.getCollection("pedido");
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
