package com.mx.PruebaTecnicaMetaphorce.servicios;

import java.util.List;

import com.mx.PruebaTecnicaMetaphorce.dominio.*;

public interface ProductosServ {
	public void guardar(Productos prodcutos);
	public void actualizar(Productos prodcutos);
	public Productos buscar(Productos prodcutos);
	public List<Productos> listar();
	
	

}

