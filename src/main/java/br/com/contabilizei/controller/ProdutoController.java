package br.com.contabilizei.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.contabilizei.controller.model.Cliente;
import br.com.contabilizei.controller.model.Produto;
import br.com.contabilizei.controller.model.Response;
import br.com.contabilizei.dao.ProdutoDAO;
import br.com.contabilizei.dao.impl.ProdutoDAOImpl;

/**
 * Essa classe vai expor os nossos métodos para serem acessasdos via http
 * 
 * @Path - Caminho para a chamada da classe que vai representar o nosso serviço
 * */
@Path("/produto")
public class ProdutoController {
	
	ProdutoDAO dao = new ProdutoDAOImpl();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listar")
	public List<Produto> listar(){
		
		return dao.findAll();
	}
	
	/**
	 * @Consumes - determina o formato dos dados que vamos postar
	 * @Produces - determina o formato dos dados que vamos retornar
	 * 
	 * */
	@POST	
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/salvar")
	public Response salvar(Produto request){
		Response res = new Response();
		if(dao.create(request) == 1){
			res.setStatus("Salvo com sucesso");
			return res;
		}
		res.setStatus("Erro ao salvar");
		return res;
	}

}
