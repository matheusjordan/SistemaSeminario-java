package com.estudos.UML.SistemaSeminario;

import java.util.ArrayList;

public class Seminario {
	private ArrayList<Aluno> alunos;
	private Professor professor;
	private Local local;
	private String titulo;
	private int id;
	
	public Seminario(Professor professor, Local local, String titulo) {
		this.professor = professor;
		this.local = local;
		this.titulo = titulo;
		this.alunos = new ArrayList<>();
	}
	
	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public boolean delAluno(Aluno aluno) {
		if(this.alunos.contains(aluno)) {
			this.alunos.remove(aluno);
			return true;
		}
		return false;
	}
	
	//Setters
	public void setId(int id) {
		this.id = id;
	}
	
	//Getters
	public ArrayList<Aluno> getAlunos(){
		return this.alunos;
	}
	
	public Professor getProfessor() {
		return this.professor;
	}
	
	public Local getLocal() {
		return this.local;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public int getId() {
		return this.id;
	}
}
