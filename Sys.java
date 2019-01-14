package com.estudos.UML.SistemaSeminario;

import java.util.ArrayList;

public class Sys {
	private ArrayList<Aluno> alunos;
	private ArrayList<Professor> professores;
	private ArrayList<Seminario> seminarios;
	private ArrayList<Local> locais;
	
	public Sys() {
		this.alunos = new ArrayList<>();
		this.professores = new ArrayList<>();
		this.seminarios = new ArrayList<>();
		this.locais = new ArrayList<>();
	}
	
	//Getters
	public ArrayList<Aluno> getAlunos(){
		return this.alunos;
	}
	
	public ArrayList<Professor> getProfessores(){
		return this.professores;
	}
	
	public ArrayList<Seminario> getSeminarios(){
		return this.seminarios;
	}
	
	public ArrayList<Local> getLocais(){
		return this.locais;
	}
	
	
	//Isses
	public boolean isAluno(Aluno aluno) {
		if(this.alunos.contains(aluno)) {
			return true;
		}
		return false;
	}
	
	public boolean isProfessor(Professor professor) {
		if(this.professores.contains(professor)) {
			return true;
		}
		return false;
	}
	
	public boolean isSeminario(Seminario seminario) {
		if(this.seminarios.contains(seminario)) {
			return true;
		}
		return false;
	}
	
	public boolean isLocal(Local local){
		if(this.locais.contains(local)) {
			return true;
		}
		return false;
	}
	
	//Setters
	public void setAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.setId(this.alunos.size());
	}
	
	public void setProfessor(Professor professor) {
		this.professores.add(professor);
		professor.setId(this.professores.size());
	}
	
	public void setSeminario(Seminario seminario) {
		this.seminarios.add(seminario);
		seminario.setId(this.seminarios.size());
	}
	
	public void setLocal(Local local) {
		this.locais.add(local);
		local.setId(this.locais.size());
	}
}
