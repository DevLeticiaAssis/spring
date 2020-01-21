package com.eletronicos.model;

public class Televisao {
	
	private int id;
	private String modelo;
	private String tipo;
	
	public Televisao() {
		super();	
	}
	
	public Televisao(int id, String modelo, String tipo) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
