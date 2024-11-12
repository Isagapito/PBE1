package com.senaidev.mercado.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "Produto")

public class ProdutoEntitie {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id_produto ; 
   
   @Column 
   private String nome ;
   
   @Column 
   private Double preco ; 
   
   public ProdutoEntitie (Long id_produto, String nome, Double preco) {
	   this.id_produto = id_produto ;
	   this.nome = nome;
	   this.preco = preco ;  
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

public Double getPreco() {
	return preco;
}

public void setPreco(Double preco) {
	this.preco = preco;
}
}
