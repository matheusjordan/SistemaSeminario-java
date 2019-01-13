package com.estudos.UML.SistemaSeminario;

public class Local {
	private String rua;
	private String bairro;
	
	public Local(String rua, String bairro) {
		this.rua = rua;
		this.bairro = bairro;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	public String getBairro() {
		return this.bairro;
	}
}
