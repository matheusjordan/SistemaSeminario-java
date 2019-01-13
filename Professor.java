package com.estudos.UML.SistemaSeminario;

import java.util.ArrayList;

public class Professor {
	private ArrayList<Seminario> seminarios;
	private String nome;
	private String especialidade;
	
	public Professor(String nome, String especialidade) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.seminarios = new ArrayList<>();
	}
	
	public void addSeminario(Seminario seminario) {
		this.seminarios.add(seminario);
	}
	
	public boolean delSeminario(Seminario seminario) {
		if(this.seminarios.contains(seminario)) {
			this.seminarios.remove(seminario);
			return true;
		}
		return false;
	}
	
	public ArrayList<Seminario> getSeminarios() {
		return this.seminarios;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEspecialidade() {
		return this.especialidade;
	}
}
