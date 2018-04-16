package br.com.lp3.trabalho.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

public class Produto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nome;
	private String descricao;
	private double valor;
	@JoinColumn(name="fornecedor")
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
	public Produto(int id, String nome, String descricao, double valor, Fornecedor fornecedor) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}
	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
