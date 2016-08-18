package br.com.contabilizei.entity;

public class ClienteEntity {
	
	private Long codCliente;
	
	private String cpfCnpj;
	
	private String nomeRazao;
	
	private String email;

	/**
	 * @return the codCliente
	 */
	public Long getCodCliente() {
		return codCliente;
	}

	/**
	 * @param codCliente the codCliente to set
	 */
	public void setCodCliente(Long codCliente) {
		this.codCliente = codCliente;
	}

	/**
	 * @return the cpfCnpj
	 */
	public String getCpfCnpj() {
		return cpfCnpj;
	}

	/**
	 * @param cpfCnpj the cpfCnpj to set
	 */
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	/**
	 * @return the nomeRazao
	 */
	public String getNomeRazao() {
		return nomeRazao;
	}

	/**
	 * @param nomeRazao the nomeRazao to set
	 */
	public void setNomeRazao(String nomeRazao) {
		this.nomeRazao = nomeRazao;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
