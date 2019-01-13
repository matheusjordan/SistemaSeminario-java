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
	
	public boolean setAluno(Aluno aluno) {
		if(this.alunos.contains(aluno)) {
			this.alunos.add(aluno);
			return true;
		}
		return false;
	}
	
	public boolean setProfessor(Professor professor) {
		if(this.professores.contains(professor)) {
			this.professores.add(professor);
			return true;
		}
		return false;
	}
	
	public boolean setSeminario(Seminario seminario) {
		if(this.seminarios.contains(seminario)) {
			this.seminarios.add(seminario);
			return true;
		}
		return false;
	}
	
	public boolean setLocal(Local local) {
		if(this.locais.contains(local)) {
			this.locais.add(local);
			return true;
		}
		return false;
	}
}
