package com.senaidev.BancoLivraria.Entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="tb_livro")
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto ;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "isbn", nullable = false, length = 13, unique = true)
	private String isbn; 
	
	@Column(name = "categoria", nullable = false, length = 100)
	private String categoria;
	
	@Column(name = "estoque")
	private int estoque; 
	
	public Livro() {
	}
	
	public Livro(Long id_produto, String isbn, String categoria, int estoque) {
		this.id_produto = id_produto;
		this.isbn = isbn;
		this.categoria = categoria;
		this.estoque = estoque;
		}

	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	} 
	
	
}
