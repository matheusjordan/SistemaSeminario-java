package com.estudos.UML.SistemaSeminario;

public class Aluno {
	private Seminario seminario;
	private int idade;
	private String nome;
	private int id;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//Setters
	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	//Getters
	public int getId() {
		return this.id;
	}
	
	public Seminario getSeminario() {
		return this.seminario;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
}
