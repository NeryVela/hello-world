package com.mx.PruebaTecnicaTruper.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.PruebaTecnicaTruper.dao.OrdenesDao;
import com.mx.PruebaTecnicaTruper.dominio.Ordenes;


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
