package com.senaidev.BancoLivraria.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.BancoLivraria.Entities.Editora;

public interface EditoraRepository  extends JpaRepository<Editora, Long>{
	Editora findByCnpj(String cnpj);
}
