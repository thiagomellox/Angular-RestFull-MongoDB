package br.com.contabilizei.entity;

import java.util.Date;
import java.util.List;

public class PedidoEntity {

	private Long codPedido;
	
	private Long numero;
	
	private Date dataEmissao;
	
	private ClienteEntity cliente;
	
	private List<ProdutoEntity> produtos;
	
	private Double valorTotal;

	/**
	 * @return the codPedido
	 */
	public Long getCodPedido() {
		return codPedido;
	}

	/**
	 * @param codPedido the codPedido to set
	 */
	public void setCodPedido(Long codPedido) {
		this.codPedido = codPedido;
	}

	/**
	 * @return the numero
	 */
	public Long getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(Long numero) {
		this.numero = numero;
	}

	/**
	 * @return the dataEmissao
	 */
	public Date getDataEmissao() {
		return dataEmissao;
	}

	/**
	 * @param dataEmissao the dataEmissao to set
	 */
	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	/**
	 * @return the cliente
	 */
	public ClienteEntity getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the produtos
	 */
	public List<ProdutoEntity> getProdutos() {
		return produtos;
	}

	/**
	 * @param produtos the produtos to set
	 */
	public void setProdutos(List<ProdutoEntity> produtos) {
		this.produtos = produtos;
	}

	/**
	 * @return the valorTotal
	 */
	public Double getValorTotal() {
		return valorTotal;
	}

	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
