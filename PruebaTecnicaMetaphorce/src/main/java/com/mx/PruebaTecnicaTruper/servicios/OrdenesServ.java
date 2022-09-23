package com.mx.PruebaTecnicaTruper.servicios;

import java.util.List;


import com.mx.PruebaTecnicaTruper.dominio.*;

public interface OrdenesServ {
	
	public void guardar(Ordenes ordenes);
	public void actualizar(Ordenes ordenes);
	public Ordenes buscar(Ordenes ordenes);
	public List<Ordenes> listar();

}
