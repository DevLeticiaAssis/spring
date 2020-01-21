package com.eletronicos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eletronicos.model.Computador;
import com.eletronicos.model.Smartphone;
import com.eletronicos.model.Televisao;

@RestController
public class EletronicosController {
	
	@GetMapping("/computador")
	
	public List<Computador> getComputador() {
		List<Computador> listComputador = new ArrayList<Computador>();

		listComputador.add(new Computador(2525, "modelo1", "tipo1"));
		listComputador.add(new Computador(2626, "modelo2", "tipo2"));
		listComputador.add(new Computador(2727, "modelo3", "tipo3"));
		listComputador.add(new Computador(2828, "modelo4", "tipo4"));

		return listComputador;
	}
	
	@GetMapping("/smartphone")
	
	public List<Smartphone> getSmartphone() {
		
		List<Smartphone> listSmartphone = new ArrayList<Smartphone>();

		listSmartphone.add(new Smartphone(2929, "modelo5", "tipo5"));
		listSmartphone.add(new Smartphone(3030, "modelo6", "tipo6"));
		listSmartphone.add(new Smartphone(3131, "modelo7", "tipo7"));
		listSmartphone.add(new Smartphone(3232, "modelo8", "tipo8"));

		return listSmartphone;

	}
	
	@GetMapping("/televisao")
	
	public List<Televisao> getTelevisao() {
		
		List<Televisao> listTelevisao = new ArrayList<Televisao>();

		listTelevisao.add(new Televisao(3333, "modelo9", "tipo9"));
		listTelevisao.add(new Televisao(3434, "modelo10", "tipo10"));
		listTelevisao.add(new Televisao(3535, "modelo11", "tipo11"));
		listTelevisao.add(new Televisao(3636, "modelo12", "tipo12"));

		return listTelevisao;

	}
}
