package com.mx.PruebaTecnicaMetaphorce.dominio;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="sucursales")
public class Sucursales {
	@Id
	@Column
	int id;
	@Column
	String nombre;
	
	@OneToMany(mappedBy="sucursales", cascade=CascadeType.ALL)
	List<Ordenes>lista=new ArrayList<Ordenes>();
	
	
	public Sucursales() {
		
	}
	
	public Sucursales(int id) {
		this.id=id;
	}
	
	
	
	public Sucursales(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Sucursales [id=" + id + ", nombre=" + nombre + "]";
	}

	
	
}
