package com.senaidev.cadastroproduto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.cadastroproduto.entities.Produto;

@Service
public class ProdutoService { 
	@Autowired
	private ProdutoRepositoty produtoRepository;
	
	public Produto saveProduto( Produto produto) {
		return produtoRepository.save(produto);
		} 
	
	public List<Produto> getAllProdutos(){
		return produtoRepository.findAll();
	}

}
