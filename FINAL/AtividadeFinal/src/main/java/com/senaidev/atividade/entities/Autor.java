package com.senaidev.atividade.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table (name="Autor")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Autor; 
	
	@Column (name="Nome")
	private String Nome;
	
	@Column (name="Email")
	private String Email ;
	
	@Column (name="Editora")
	private String Editora; 
	
	public Autor () {	
	}
	
	public Autor(Long Id_Autor, String Nome, String Email, String Editora) {
		this.Id_Autor = Id_Autor;
		this.Nome = Nome;
		this.Email = Email;
		this.Editora = Editora;
	}

	public Long getId_Autor() {
		return Id_Autor;
	}

	public void setId_Autor(Long id_Autor) {
		Id_Autor = id_Autor;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getEditora() {
		return Editora;
	}

	public void setEditora(String editora) {
		Editora = editora;
	} 
	
	
}
