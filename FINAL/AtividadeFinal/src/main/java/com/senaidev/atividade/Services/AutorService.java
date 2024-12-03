package com.senaidev.atividade.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senaidev.atividade.entities.Autor;


@Service
public class AutorService {
	private AutorRepository autorRepository;
	
	public Autor saveAutor(Autor autor) {
		return autorRepository.save(Autor);
	}
	public List <AutorRepository> getAllAutor(){
		return autorRepository.findAll();
	}
	public AutorRepository getAutorByid(Long id) {
		return autorRepository.findById(id).orElse(null);
	} 
	public void deleteAutor(Long id) {
		autorRepository.deleteById(id);
	}
}
