package com.generation.lojaInformatica.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.lojaInformatica.model.Equipamento;
import com.generation.lojaInformatica.service.EquipamentoService;
import com.generation.lojaInformatica.service.impl.EquipamentoServiceImpl;

@CrossOrigin("*")
@RestController
public class EquipamentoController {
	
EquipamentoService equipamentoService = new EquipamentoServiceImpl(); 
	
	@GetMapping("/equipamento/")
	public List<Equipamento> getAll(){
		return equipamentoService.getAll();
	}
	
	@GetMapping("/equipamento/{id}")
	public ResponseEntity<Equipamento> getById(@PathVariable int id) {
		Equipamento equipamento = equipamentoService.getById(id);
		
		if(equipamento == null)
			ResponseEntity.notFound();
		
		return ResponseEntity.ok(equipamento);
	}
	
	@PostMapping("/equipamento/")
	public ResponseEntity<Equipamento> insert(@RequestBody Equipamento equipamento) {
			
		return ResponseEntity.ok(equipamentoService.insert(equipamento));
	}
	
	@PutMapping("/equipamento/")
	public Equipamento alterar(@RequestBody Equipamento equipamento) {
		equipamentoService.update(equipamento);
		return equipamento;
	}
	
	
	@DeleteMapping("/equipamento/{id}")
	public void delete(@PathVariable int id) {
		equipamentoService.delete(id);
	}
	
}
