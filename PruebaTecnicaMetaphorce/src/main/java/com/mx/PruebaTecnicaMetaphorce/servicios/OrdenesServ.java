package com.mx.PruebaTecnicaMetaphorce.servicios;

import java.util.List;

import com.mx.PruebaTecnicaMetaphorce.dominio.*;

public interface OrdenesServ {
	
	public void guardar(Ordenes ordenes);
	public void actualizar(Ordenes ordenes);
	public Ordenes buscar(Ordenes ordenes);
	public List<Ordenes> listar();

}
