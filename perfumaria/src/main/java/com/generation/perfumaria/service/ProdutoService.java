package com.generation.perfumaria.service;

import java.util.List;

import com.generation.perfumaria.model.Produto;

public interface ProdutoService {

	Produto insert(Produto produto);

	Produto update(Produto produto);

	void delete(Produto produto);

	void delete(int id);

	Produto getById(int id);

	List<Produto> getAll();
}
