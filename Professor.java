package com.estudos.UML.SistemaSeminario;

import java.util.ArrayList;

public class Professor {
	private ArrayList<Seminario> seminarios;
	private String nome;
	private String especialidade;
	private int id;
	
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
	
	//Setters
	public void setId(int id) {
		this.id = id;
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}
	
	public String getEspecialidade() {
		return this.especialidade;
	}
	
	public int getId() {
		return this.id;
	}
}
