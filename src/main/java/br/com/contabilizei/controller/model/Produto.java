package br.com.contabilizei.controller.model;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import br.com.contabilizei.entity.ProdutoEntity;
import br.com.contabilizei.util.NumberConverter;

// TODO: Auto-generated Javadoc
/**
 * The Class Produto.
 */
public class Produto {

	private String id;
	
	/** The codigo. */
	private String codigo;
	
	/** The descricao. */
	private String descricao;
	
	/** The quantidade. */
	private String quantidade;
	
	/** The valor. */
	private String valor;


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
	 * Gets the codigo.
	 *
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Sets the codigo.
	 *
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Gets the descricao.
	 *
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Sets the descricao.
	 *
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Gets the quantidade.
	 *
	 * @return the quantidade
	 */
	public String getQuantidade() {
		return quantidade;
	}

	/**
	 * Sets the quantidade.
	 *
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * Gets the valor.
	 *
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * Sets the valor.
	 *
	 * @param valor the valor to set
	 */
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	/**
	 * Instantiates a new produto.
	 */
	public Produto (){
		
	}
	
	/** The id. */
	public static String ID = "_id";
	
	/** The cod produto. */
	public static String COD_PRODUTO = "codProduto";
	
	/** The codigo. */
	public static String CODIGO = "codigo";
	
	/** The descricao. */
	public static String DESCRICAO = "descricao";
	
	/** The quantidade. */
	public static String QUANTIDADE = "quantidade";
	
	/** The valor. */
	public static String VALOR = "valor";


	
	/**
	 * Instantiates a new produto.
	 *
	 * @param document the document
	 */
	public Produto (Document document){
		this.setId(String.valueOf(document.get(ID)));
		this.setCodigo(document.getString(CODIGO));
		this.setDescricao(document.getString(DESCRICAO));
		this.setQuantidade(document.getString(QUANTIDADE));
		this.setValor(document.getString(VALOR));
	}
	
	
}
