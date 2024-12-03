package com.senaidev.atividade.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Livro")
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Livro; 
	
	@Column (name="Titulo")
	private String Titulo;
	
	@Column (name="ISBN")
	private String ISBN ;
	
	@Column (name="Editora")
	private String Editora; 
	
	public Livro () {	
	} 
	
	public Livro (Long Id_Livro, String Titulo, String ISBN, String Editora) {
		this.Id_Livro = Id_Livro;
		this.Titulo = Titulo;
		this.ISBN = ISBN;
		this.Editora = Editora;
	}

	public Long getId_Livro() {
		return Id_Livro;
	}

	public void setId_Livro(Long id_Livro) {
		Id_Livro = id_Livro;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getEditora() {
		return Editora;
	}

	public void setEditora(String editora) {
		Editora = editora;
	} 
	
	
}
