package com.mx.PruebaTecnicaMetaphorce.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.PruebaTecnicaMetaphorce.dao.OrdenesDao;
import com.mx.PruebaTecnicaMetaphorce.dominio.Ordenes;


@Service
public class OrdenesServImp implements OrdenesServ {
	
	

	@Autowired
	OrdenesDao Ordenesdao;
	public void guardar(Ordenes ordenes) {
		Ordenesdao.save(ordenes);
		
	}

	

	@Override
	public void actualizar(Ordenes ordenes) {
		Ordenesdao.save(ordenes);
		
	}

	@Override
	public Ordenes buscar(Ordenes ordenes) {
		
		return Ordenesdao.findById(ordenes.getId()).orElse(null);
	}

	@Override
	public List<Ordenes> listar() {
		
		return Ordenesdao.findAll();
	}
	

}
