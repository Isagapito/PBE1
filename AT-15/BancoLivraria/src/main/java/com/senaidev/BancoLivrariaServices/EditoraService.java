package com.senaidev.BancoLivrariaServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senaidev.BancoLivraria.Entities.Editora;
import com.senaidev.BancoLivraria.Repositories.EditoraRepository;

@Service
public class EditoraService {
	@Autowired
    private EditoraRepository editoraRepository;

    // Listar todos os clientes
    public List<Editora> buscarEditora() {
        return editoraRepository.findAll();
    }

    // Buscar cliente por ID
    public Editora buscarEditorAPorCnpj(Long cnpj) {
        return editoraRepository.findByCnpj(cnpj).orElse(null);
    } 
    //Buscar Cliente por CPF
    public Editora buscarEditoraPorCnpj(String cnpj) {
    	return editoraRepository.findByCnpj(cnpj);
    }

    // Salvar cliente
    public Editora criarEditora(Editora editora) {
        return editoraRepository.save(editora);
    }

    // Deletar cliente
    public void excluirEditora(Long cnpj) {
        editoraRepository.deleteByCnpj(cnpj);
    }
}
