package com.estudos.UML.SistemaSeminario;

import java.util.Scanner;

public class Main {
	public static MenuCad menuCad = new MenuCad();
	public static void main(String[] args) {
		
		while(true) {
			Scanner read = new Scanner(System.in);
			
			String nome;
			String especialidade;
			String rua, bairro;
			int id;
			int opc;
			int idProf, idLocal;
			int idade;
			
			
			
			System.out.printf("1- Cadastrar Aluno\n2- Cadastrar Professor\n3- Cadastrar Local\n4- Cadastrar Seminario\n"
							+ "\n5- Alunos cadastrados\n6- Professores cadastrados\n7- Locais cadastrados\n8- Seminarios cadastrados\nEscolha uma opção: ");
			opc = read.nextInt();
			
			switch(opc) {
				case 1:
					System.out.printf("\nDigite o nome do aluno: ");
					read.nextLine();
					nome = read.nextLine(); read = new Scanner(System.in);
					System.out.printf("Digite a idade do aluno: ");
					idade = read.nextInt();
					menuCad.cadastroAluno(nome, idade);
					System.out.println("Aluno cadastrado com sucesso!\n");
					break;
				
				case 2:
					System.out.printf("\nDigite o nome do professor: ");
					read.nextLine();
					nome = read.nextLine(); read = new Scanner(System.in);
					System.out.printf("Digite a especialidade do professor: ");
					especialidade = read.nextLine();
					menuCad.cadastroProfessor(nome, especialidade);
					System.out.println("Professor cadastrado com sucesso!\n");
					break;
					
				case 3:
					System.out.printf("\nDigite o nome da rua: ");
					read.nextLine();
					rua = read.nextLine(); read = new Scanner(System.in);
					System.out.printf("Digite o nome do bairro: ");
					bairro = read.nextLine();
					menuCad.cadastroLocal(rua, bairro);
					System.out.println("Local cadastrado com sucesso!\n");
					break;
				
				case 4:
					System.out.printf("Digite o nome do seminário: ");
					read.nextLine();
					nome = read.nextLine();
					
					//Algoritmo de profesores
					Professor[] professores = new Professor[menuCad.sys.getProfessores().size()];
					int i = 0;
					
					System.out.println("+------------");
					for(Professor professor : menuCad.sys.getProfessores()) {
						System.out.println(professor.getId() +" "+ professor.getNome());
						professores[i] = professor; i++;
					}
					System.out.println("------------+");
					
					System.out.printf("\nEscolha o professor pelo ID: ");
					idProf = read.nextInt();
					
					//Algoritmo de locais
					Local[] locais = new Local[menuCad.sys.getLocais().size()];
					i = 0;
					System.out.println("\n+------------");
					for(Local local : menuCad.sys.getLocais()) {
						System.out.println(local.getId() +" "+ local.getRua() +" "+ local.getBairro());
						locais[i] = local; i++;
					}
					System.out.println("------------+");
					
					System.out.printf("\nEscolha o local pelo ID: ");
					idLocal = read.nextInt();
					menuCad.cadastroSeminario(professores[idProf -1], locais[idLocal -1], nome);
					System.out.println("Seminário cadastrado com sucesso!\n");
					break;
				
				case 5:
					System.out.println("\n+------------");
					for(Aluno aluno : menuCad.sys.getAlunos()) {
						System.out.println(aluno.getId() +" "+ aluno.getNome() +" "+ aluno.getIdade());
					}
					System.out.println("------------+\n");
					break;
					
				case 6:			
					System.out.println("\n+------------");
					for(Professor professor : menuCad.sys.getProfessores()) {
						System.out.println(professor.getId() +" "+ professor.getNome() +" "+ professor.getEspecialidade());
					}
					System.out.println("------------+\n");
					break;
					
				case 7:
					System.out.println("\n+------------");
					for(Local local : menuCad.sys.getLocais()) {
						System.out.println(local.getId() +" "+ local.getRua() +" "+ local.getBairro());
					}
					System.out.println("------------+\n");
					break;
					
				case 8:
					System.out.println("\n+------------");
					for(Seminario seminario : menuCad.sys.getSeminarios()) {
						System.out.println(seminario.getId() +" "+ seminario.getTitulo() +" "+ seminario.getProfessor().getNome());
					}
					System.out.println("------------+\n");
					break;
					
				default:
					System.out.println("Opção digitada inválida!\n");
					break;
			}
		}
		
		
		
	}

}
