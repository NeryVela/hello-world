package com.mx.PruebaTecnicaMetaphorce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.PruebaTecnicaMetaphorce.dominio.Ordenes;
import com.mx.PruebaTecnicaMetaphorce.servicios.OrdenesServ;


@RestController
@RequestMapping("OrdenesWs")
@CrossOrigin

public class OrdenesWs {
	@Autowired
	OrdenesServ ordenesServ;
	
	@GetMapping("listar")
	public List<Ordenes>lista(){
		return ordenesServ.listar();
		
	}
	
	@PostMapping("buscar")
		public Ordenes buscar(@RequestBody Ordenes ordenes) {
			return ordenesServ.buscar(ordenes);
	}
	
	@PostMapping("guardar")
		public void guardar(@RequestBody Ordenes ordenes) {
		ordenesServ.guardar(ordenes);
}
	
	@PutMapping("actualizar")
	public void actualizar(@RequestBody Ordenes ordenes) {
	ordenesServ.actualizar(ordenes);
}
	
	

}
