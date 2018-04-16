package br.com.lp3.trabalho.dto;

import br.com.lp3.trabalho.model.Fornecedor;


public class ProdutoDTO {

	private int id;
	private String nome;
	private String descricao;
	private double valor;
	private Fornecedor fornecedor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public ProdutoDTO(int id, String nome, String descricao, double valor, Fornecedor fornecedor) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}
	public ProdutoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
