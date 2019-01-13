package com.estudos.UML.SistemaSeminario;

public class MenuCad {
	public Sys sys;
	
	public MenuCad() {
		this.sys = new Sys();
		System.out.println(" --Seminario sys 1.0--");
	}

	public void cadastroAluno(String nome, int idade) {
		Aluno aluno = new Aluno(nome, idade);
		this.sys.setAluno(aluno);
	}
	
	public void cadastroProfessor(String nome, String especialidade) {
		Professor professor = new Professor(nome, especialidade);
		this.sys.setProfessor(professor);
	}
	
	public void cadastroSeminario(Professor professor, Local local, String titulo) {
		Seminario seminario = new Seminario(professor, local, titulo);
		this.sys.setSeminario(seminario);
	}
	
	public void cadastroLocal(String rua, String bairro) {
		Local local = new Local(rua, bairro);
		this.sys.setLocal(local);
	}
}
