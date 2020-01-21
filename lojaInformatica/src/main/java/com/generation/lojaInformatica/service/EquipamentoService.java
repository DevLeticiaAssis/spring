package com.generation.lojaInformatica.service;

import java.util.List;

import com.generation.lojaInformatica.model.Equipamento;

public interface EquipamentoService {

	Equipamento insert(Equipamento equipamento);

	Equipamento update(Equipamento equipamento);

	void delete(Equipamento equipamento);

	void delete(int id);

	Equipamento getById(int id);

	List<Equipamento> getAll();

}
