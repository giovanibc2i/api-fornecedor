package br.com.lp3.trabalho.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	public Fornecedor(Long id, String nome, String endereco, Long cnpj, String razao_social) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.razao_social = razao_social;
	}
	public Fornecedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
