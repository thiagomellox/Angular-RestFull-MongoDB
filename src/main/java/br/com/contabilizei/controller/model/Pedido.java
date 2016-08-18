package br.com.contabilizei.controller.model;

import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;

public class Pedido {
	
	private String id;

	private String codPedido;
	
	private String numero;
	
	private String dataEmissao;
	
	private Cliente cliente;
	
	private List<Produto> produtos;
	
	private String valorTotal;

	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the codPedido
	 */
	public String getCodPedido() {
		return codPedido;
	}

	/**
	 * @param codPedido the codPedido to set
	 */
	public void setCodPedido(String codPedido) {
		this.codPedido = codPedido;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the dataEmissao
	 */
	public String getDataEmissao() {
		return dataEmissao;
	}

	/**
	 * @param dataEmissao the dataEmissao to set
	 */
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the produtos
	 */
	public List<Produto> getProdutos() {
		return produtos;
	}

	/**
	 * @param produtos the produtos to set
	 */
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	/**
	 * @return the valorTotal
	 */
	public String getValorTotal() {
		return valorTotal;
	}

	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}

	/**
	 * Instantiates a new pedido.
	 */
	public Pedido (){
		
	}
	
	
	public static String ID = "_id";
	public static String COD_PEDIDO = "codPedido";
	public static String DATA_EMISSAO = "dataEmissao";
	public static String NUMERO = "numero";
	public static String VALOR_TOTAL = "valorTotal";

	/**
	 * Instantiates a new pedido.
	 *
	 * @param document the entity
	 */
	public Pedido (Document document){
		this.setId(String.valueOf(document.get(ID)));
		this.setCodPedido(document.getString(COD_PEDIDO));
//		this.setCliente(new Cliente(document.getCliente()));
		this.setDataEmissao(document.getString(DATA_EMISSAO));
		this.setNumero(document.getString(NUMERO));
		this.setValorTotal(document.getString(VALOR_TOTAL));
//		this.setProdutos(Produto.entityToModelList(document.getProdutos()));
	}
	
	/**
	 * Entity to model list.
	 *
	 * @param list the list
	 * @return the list
	 */
//	public static List<Pedido> entityToModelList(List<PedidoEntity> list ){
//		List<Pedido>  resultado = new ArrayList<Pedido>();
//
//		for(PedidoEntity entity : list){
//			resultado.add(new Pedido(entity));
//		}
//		return resultado;
//	}
	
}
