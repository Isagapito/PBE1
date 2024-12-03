package com.senaidev.mercado.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.mercado.repositories.ProdutoRepository;

@Service
public class ProdutoService { 
	
	@Autowired
	private ProdutoRepository produtorepository;
	
	public ProdutoRepository saveProdutoService(ProdutoService produtoservice) {
		return produtorepository.save(produtoservice); 
	} 
	
	public List <ProdutoRepository> getAllProduto(){
		return produtorepository.findAll();
	}
	
	public ProdutoRepository getProdutoById_Produto (Long Id_Produto) {
		return produtorepository.findById(Id_Produto).orElse(null);
	}
	
	public void deleteProduto(Long Id_produto) {
		produtorepository.deleteById(Id_produto);
	}

}
