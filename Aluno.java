package com.estudos.UML.SistemaSeminario;

public class Aluno {
	private Seminario seminario;
	private int idade;
	private String nome;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
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
