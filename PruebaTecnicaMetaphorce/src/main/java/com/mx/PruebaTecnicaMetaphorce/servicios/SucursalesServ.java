package com.mx.PruebaTecnicaMetaphorce.servicios;

import java.util.List;

import com.mx.PruebaTecnicaMetaphorce.dominio.Sucursales;

public interface SucursalesServ {
	public void guardar(Sucursales sucursales);
	public void actualizar(Sucursales sucursales);
	public Sucursales buscar(Sucursales sucursales);
	public void eliminar(Sucursales sucursales);
	public List<Sucursales> listar();
	
	

}
