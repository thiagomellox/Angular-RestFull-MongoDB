package br.com.contabilizei.dao.impl;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import br.com.contabilizei.controller.model.Pedido;
import br.com.contabilizei.dao.PedidoDAO;

public class MongoDAO {

	protected MongoDatabase db;
	protected MongoClient mongo;

	protected boolean conectar() {
		try {
			mongo = new MongoClient("localhost", 27017);
			db = mongo.getDatabase("contabilizei");
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	protected boolean desconectar() {
		try {
			mongo.close();
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
//	public class JavaAggregation {
//
//	        MongoClient mongo = new MongoClient();
//	        DB db = mongo.getDB("test");
//
//	        DBCollection coll = db.getCollection("employee");
//
//	        // create the pipeline operations, first with the $match
//	        DBObject match = new BasicDBObject("$match",
//	            new BasicDBObject("_id", "11111")
//	        );
//
//	        // build the $lookup operations
//	        DBObject lookupFields = new BasicDBObject("from", "company");
//	        lookupFields.put("localField", "companyId");
//	        lookupFields.put("foreignField", "_id");
//	        lookupFields.put("as", "company");      
//	        DBObject lookup = new BasicDBObject("$lookup", lookupFields);
//
//	        // build the $project operations
//	        DBObject projectFields = new BasicDBObject("name", 1);
//	        projectFields.put("lastName", 1);
//	        projectFields.put("companyId", 1);
//	        projectFields.put("companyName", "$company.companyName");       
//	        DBObject project = new BasicDBObject("$project", projectFields);
//
//	        List<DBObject> pipeline = Arrays.asList(match, lookup, project);
//
//	        AggregationOutput output = coll.aggregate(pipeline);
//
//	        for (DBObject result : output.results()) {
//	            System.out.println(result);
//	        }
//	}
	
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		pedido.setCodPedido("1");
		pedido.setDataEmissao("09/05/1985");
		pedido.setNumero("3");
		pedido.setValorTotal("123");
		
		PedidoDAO dao = new PedidoDAOImpl();
		System.out.println(dao.create(pedido));
		
		System.out.println(dao.findAll().size());
	}

}
