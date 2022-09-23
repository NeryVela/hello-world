package com.mx.PruebaTecnicaTruper.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mx.PruebaTecnicaTruper.dao.SucursalesDao;
import com.mx.PruebaTecnicaTruper.dominio.Sucursales;

@Service
public class SucursalesServImp implements SucursalesServ {
	
	@Autowired 
	SucursalesDao Sucursalesdao;
	public void guardar(Sucursales sucursales) {
		
		Sucursalesdao.save(sucursales);
	}

	@Override
	public void actualizar(Sucursales sucursales) {
		Sucursalesdao.save(sucursales);
		
	}

	@Override
	public Sucursales buscar(Sucursales sucursales) {
		
		return Sucursalesdao.findById(sucursales.getId()).orElse(null);
	}
	
	@Override
	public void eliminar(Sucursales sucursales) {
		Sucursalesdao.delete(sucursales);
		
	}
	

	@Override
	public List<Sucursales> listar() {
		
		return Sucursalesdao.findAll();
	}
}
