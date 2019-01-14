package com.estudos.UML.SistemaSeminario;

public class Local {
	private String rua;
	private String bairro;
	private int id;
	
	public Local(String rua, String bairro) {
		this.rua = rua;
		this.bairro = bairro;
	}
	
	//Setters
	public void setId(int id) {
		this.id = id;
	}
	
	//Getters
	public int getId() {
		return this.id;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	public String getBairro() {
		return this.bairro;
	}
}
