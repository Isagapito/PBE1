package com.senaidev.BancoLivraria.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.BancoLivraria.Entities.Cliente;

 public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	Cliente findBycpf(String cpf);
 }


