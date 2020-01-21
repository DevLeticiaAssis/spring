package com.generation.lojaInformatica.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.generation.lojaInformatica.model.Equipamento;
import com.generation.lojaInformatica.service.EquipamentoService;

public class EquipamentoServiceImpl implements EquipamentoService {
	
	static List<Equipamento> equipamentos = new ArrayList<Equipamento>();
	private static int incr = 0;
	
	@Override
	public Equipamento insert(Equipamento equipamento) {
		incr++;
		equipamento.setId(incr);
		this.equipamentos.add(equipamento);
		return equipamento;
	}

	@Override
	public Equipamento update(Equipamento equipamento) {
		Equipamento aux = getById(equipamento.getId());

		if (aux != null) { 
			aux.setMarca(equipamento.getMarca());
			aux.setProduto(equipamento.getProduto());
		}

		return aux;
	}

	@Override
	public void delete(Equipamento equipamento) {
		delete(equipamento.getId());
	}

	@Override
	public void delete(int id) {
		int posicao = -1;
		for (int i = 0; i < this.equipamentos.size(); i++) {
			if (this.equipamentos.get(i).getId() == id) {
				posicao = i;
				break;
			}
		}
		if (posicao >= 0)
			this.equipamentos.remove(posicao);

	}

	@Override
	public Equipamento getById(int id) {
		for (Equipamento equipamento : equipamentos) {
			if (equipamento.getId() == id) {
				return equipamento;
			}
		}
		return null;
	}

	@Override
	public List<Equipamento> getAll() {
		return equipamentos;
	}

}
