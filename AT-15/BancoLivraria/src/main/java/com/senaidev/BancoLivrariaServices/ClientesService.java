package com.senaidev.BancoLivrariaServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.BancoLivraria.Entities.Cliente;
import com.senaidev.BancoLivraria.Repositories.ClienteRepository;

@Service
public class ClientesService {
	 @Autowired
	    private ClienteRepository clienteRepository;

	    // Listar todos os clientes
	    public List<Cliente> buscarClientes() {
	        return clienteRepository.findAll();
	    }

	    // Buscar cliente por ID
	    public Cliente buscarClientesPorId(Long id) {
	        return clienteRepository.findById(id).orElse(null);
	    } 
	    //Buscar Cliente por CPF
	    public Cliente buscarClientesPorCpf(String cpf) {
	    	return clienteRepository.findBycpf(cpf);
	    }

	    // Salvar cliente
	    public Cliente criarCliente(Cliente cliente) {
	        return clienteRepository.save(cliente);
	    }

	    // Deletar cliente
	    public void excluirCliente(Long id) {
	        clienteRepository.deleteById(id);
	    }
}
