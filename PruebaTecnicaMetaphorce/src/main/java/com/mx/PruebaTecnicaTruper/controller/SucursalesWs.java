package com.mx.PruebaTecnicaTruper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.PruebaTecnicaTruper.dominio.Sucursales;
import com.mx.PruebaTecnicaTruper.servicios.SucursalesServ;

@RestController
@RequestMapping("SucursalesWs")
@CrossOrigin
public class SucursalesWs {
	@Autowired
	SucursalesServ sucursalesServ;
	
	@GetMapping("listar")
	public List<Sucursales>lista(){
		return sucursalesServ.listar();
		
	}
	
	@PostMapping("buscar")
		public Sucursales buscar(@RequestBody Sucursales sucursales) {
			return sucursalesServ.buscar(sucursales);
	}
	
	@PostMapping("guardar")
		public void guardar(@RequestBody Sucursales sucursales) {
		sucursalesServ.guardar(sucursales);
}
	
	@PostMapping("eliminar")
		public void eliminar(@RequestBody Sucursales sucursales) {
		sucursalesServ.eliminar(sucursales);
	}
	
	
	@PutMapping("actualizar")
	public void actualizar(@RequestBody Sucursales sucursales) {
	sucursalesServ.actualizar(sucursales);
}
	
	
	
	

}
