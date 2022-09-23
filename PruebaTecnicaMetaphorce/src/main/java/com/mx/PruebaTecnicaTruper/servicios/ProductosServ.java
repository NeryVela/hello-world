package com.mx.PruebaTecnicaTruper.servicios;

import java.util.List;

import com.mx.PruebaTecnicaTruper.dominio.*;

public interface ProductosServ {
	public void guardar(Productos prodcutos);
	public void actualizar(Productos prodcutos);
	public Productos buscar(Productos prodcutos);
	public List<Productos> listar();
	
	

}

