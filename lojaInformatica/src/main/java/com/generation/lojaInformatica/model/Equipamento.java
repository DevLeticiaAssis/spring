package com.generation.lojaInformatica.model;

public class Equipamento {
	
	private int id;
	private String marca;
	private String produto;
	
	public Equipamento() {
		super();
	}
	
	public Equipamento(int id, String marca, String produto) {
		super();
		this.id = id;
		this.marca = marca;
		this.produto = produto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
}
