package com.sisValmart.lsiProject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe Gerente define as caracteristicas de um Produto.
 * @author Equipe SISValmart
 */
@Entity
public class Produto {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "precoInicial")
	private double precoInicial;

	@Column(name = "precoFinal")
	private double precoFinal;

	@Column(name = "categoria")
	private String Categoria;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "quantidade")
	private int quantidade;
/**
* Construtor sobrecarregado da classe Produto.
* @param nome o nome do Produto.
* @param cpf o cpf do Produto.
* @param senha a senha do Produto.
*/
	public Produto(String nome, double precoInicial, String categoria, int quantidade) {
		this.nome = nome;
		this.precoInicial = precoInicial;
		Categoria = categoria;
		this.quantidade = quantidade;
	}
/**
 * Construtor default da classe Produto.
*/
	public Produto() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoInicial() {
		return precoInicial;
	}

	public void setPrecoInicial(double precoInicial) {
		this.precoInicial = precoInicial;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}