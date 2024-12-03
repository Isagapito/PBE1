package com.senaidev.atividade.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senaidev.atividade.Repositories.LivroRepository;
import com.senaidev.atividade.entities.Livro;



@Service
public class LivroService {
private LivroRepository livroRepository ;
	
	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}
	public List <LivroRepository> getAllLivro(){
		return livroRepository.findAll();
	}
	public LivroRepository getLivroByid(Long id) {
		return livroRepository.findById(id).orElse(null);
	} 
	public void deleteLivro(Long id) {
		livroRepository.deleteById(id);
	}
}
