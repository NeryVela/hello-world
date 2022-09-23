package com.mx.PruebaTecnicaTruper.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.PruebaTecnicaTruper.dao.ProductosDao;
import com.mx.PruebaTecnicaTruper.dominio.Productos;

@Service
public class ProductosServImp implements ProductosServ{
	
	@Autowired 
	ProductosDao Productosdao;

	public void guardar(Productos prodcutos) {
		
		Productosdao.save(prodcutos);
	}

	@Override
	public void actualizar(Productos prodcutos) {
		Productosdao.save(prodcutos);
		
	}

	@Override
	public Productos buscar(Productos prodcutos) {
		
		return Productosdao.findById(prodcutos.getId()).orElse(null);
	}

	@Override
	public List<Productos> listar() {
		
		return Productosdao.findAll();
	}

}
