package br.com.lp3.trabalho.dto;

public class FornecedorDTO {
	
	private Long id;
	private String nome;
	private String endereco;
	private Long cnpj;
	private String razao_social;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Long getCnpj() {
		return cnpj;
	}
	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazao_social() {
		return razao_social;
	}
	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}
	public FornecedorDTO(Long id, String nome, String endereco, Long cnpj, String razao_social) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.razao_social = razao_social;
	}
	public FornecedorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
