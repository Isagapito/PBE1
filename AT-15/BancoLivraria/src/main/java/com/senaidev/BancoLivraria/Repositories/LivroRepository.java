package com.senaidev.BancoLivraria.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.BancoLivraria.Entities.Livro;

public interface LivroRepository extends JpaRepository <Livro, Long>{
	Livro findByIsbn (String isbn);
}
