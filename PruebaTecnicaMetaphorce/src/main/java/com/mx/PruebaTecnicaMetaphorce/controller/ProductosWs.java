package com.mx.PruebaTecnicaMetaphorce.controller;

import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.PruebaTecnicaMetaphorce.dominio.Productos;
import com.mx.PruebaTecnicaMetaphorce.servicios.ProductosServ;

@RestController
@RequestMapping("ProductosWs")
@CrossOrigin
public class ProductosWs {
	
	
	
	
	@Autowired
	ProductosServ productosServ;
	
	@GetMapping("listar")
	
	public List<Productos>lista(){
		return productosServ.listar();
		
	}
	
	@PostMapping("buscar")
		public Productos buscar(@RequestBody Productos prodcutos) {
			return productosServ.buscar(prodcutos);
	}
	
	@PostMapping("guardar")
		public void guardar(@RequestBody Productos prodcutos) {
		productosServ.guardar(prodcutos);
}
	
	@PutMapping("actualizar")
	public void actualizar(@RequestBody Productos prodcutos) {
	productosServ.actualizar(prodcutos);
}
	

}
