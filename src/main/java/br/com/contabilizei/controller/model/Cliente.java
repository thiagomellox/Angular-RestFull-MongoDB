package br.com.contabilizei.controller.model;

import org.bson.Document;

// TODO: Auto-generated Javadoc
/**
 * The Class Cliente.
 */
public class Cliente {
	
	/** The id. */
	private String id;
	
	/** The cpf cnpj. */
	private String cpfCnpj;
	
	/** The nome razao. */
	private String nomeRazao;
	
	/** The email. */
	private String email;
	
	/** The id. */
	public static String ID = "_id";
	
	/** The cpf cnpj. */
	public static String CPF_CNPJ = "cpfCnpj";
	
	/** The nome razao. */
	public static String NOME_RAZAO = "nomeRazao";
	
	/** The email. */
	public static String EMAIL = "email";

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the cpf cnpj.
	 *
	 * @return the cpfCnpj
	 */
	public String getCpfCnpj() {
		return cpfCnpj;
	}

	/**
	 * Sets the cpf cnpj.
	 *
	 * @param cpfCnpj the cpfCnpj to set
	 */
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	/**
	 * Gets the nome razao.
	 *
	 * @return the nomeRazao
	 */
	public String getNomeRazao() {
		return nomeRazao;
	}

	/**
	 * Sets the nome razao.
	 *
	 * @param nomeRazao the nomeRazao to set
	 */
	public void setNomeRazao(String nomeRazao) {
		this.nomeRazao = nomeRazao;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Instantiates a new cliente.
	 */
	public Cliente (){
		
	}
	
	

	/**
	 * Instantiates a new cliente.
	 *
	 * @param document the entity
	 */
	public Cliente (Document document){
		this.setId(String.valueOf(document.get(ID)));
		this.setCpfCnpj(document.getString(CPF_CNPJ));
		this.setEmail(document.getString(EMAIL));
		this.setNomeRazao(document.getString(NOME_RAZAO));
	}
	

}
