package com.estudos.UML.SistemaSeminario;

import java.util.Scanner;

public class Main {
	public static MenuCad menuCad = new MenuCad();
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int opc;
		
		while(true) {
			String nome;
			String especialidade;
			int idade;
			
			
			
//			System.out.printf("1- Cadastrar Aluno\n2- Cadastrar Professor\n3- Cadastrar Seminario\n4- Cadastrar Local\nEscolha uma opção: ");
			System.out.printf("1- Cadastrar Aluno\n2- Cadastrar Professor\n3- Alunos cadastrados\n4- Professores cadastrados\nEscolha uma opção: ");
			opc = read.nextInt();
			
			switch(opc) {
				case 1:
					System.out.printf("Digite o nome do aluno: ");
					read.nextLine();
					nome = read.nextLine(); read = new Scanner(System.in);
					System.out.printf("Digite a idade do aluno: ");
					idade = read.nextInt();
					menuCad.cadastroAluno(nome, idade);
					System.out.println("Aluno cadastrado com sucesso!");
					break;
				
				case 2:
					System.out.printf("Digite o nome do professor: ");
					nome = read.nextLine(); read.nextLine();
					System.out.printf("Digite a especialidade do professor: ");
					especialidade = read.next();
					menuCad.cadastroProfessor(nome, especialidade);
					System.out.println("Professor cadastrado com sucesso!");
					break;
					
				case 3:
					for(Aluno aluno : menuCad.sys.getAlunos()) {
						System.out.println(aluno.getNome() +" "+ aluno.getIdade());
					}
					break;
				
				case 4:
					for(Professor professor : menuCad.sys.getProfessores()) {
						System.out.println(professor.getNome());
					}
					break;
					
				default:
					System.out.println("Opção digitada inválida!");
			}
		}
		
		
		
	}

}
