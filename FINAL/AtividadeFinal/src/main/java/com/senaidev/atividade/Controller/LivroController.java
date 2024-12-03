package com.senaidev.atividade.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.senaidev.atividade.Services.LivroService;
import com.senaidev.atividade.entities.Livro;


public class LivroController {
	@Autowired
	public LivroController(LivroService livroService) {
		this.LivroService = livroService;
	}
	
	@GetMapping
	public List<Livro> buscarTodos(){
		return livroService.buscarTodosLivros();
	}
	
	
}
