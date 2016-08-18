package br.com.contabilizei.entity;

public class ProdutoEntity {

	private Long codProduto;
	
	private Long codigo;
	
	private String descricao;
	
	private Integer quantidade;
	
	private Double valor;

	/**
	 * @return the codProduto
	 */
	public Long getCodProduto() {
		return codProduto;
	}

	/**
	 * @param codProduto the codProduto to set
	 */
	public void setCodProduto(Long codProduto) {
		this.codProduto = codProduto;
	}

	/**
	 * @return the codigo
	 */
	public Long getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the quantidade
	 */
	public Integer getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * @return the valor
	 */
	public Double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	
}
