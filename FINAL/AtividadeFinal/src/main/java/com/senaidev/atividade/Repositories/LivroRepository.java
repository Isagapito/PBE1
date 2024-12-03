package com.senaidev.atividade.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.atividade.entities.Livro;

public interface LivroRepository extends JpaRepository <Livro, Long> {

}
