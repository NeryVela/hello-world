package com.mx.PruebaTecnicaMetaphorce.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.*;



@Entity
@Table(name="prodcutos")
public class Productos {
	
	@Id
	@Column
	int id;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ORDEN_ID")
	Ordenes ordenes;
	@Column
	String codigo;
	@Column
	String descripcion;
	@Column
	double precio;
	
	
	
	public Productos() {
		
	}
	
	public Productos(int id) {
		this.id=id;
	}

	public Productos(int id, String codigo, String descripcion, double precio, Ordenes ordenes) {
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.ordenes = ordenes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Ordenes getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(Ordenes ordenes) {
		this.ordenes = ordenes;
	}

	@Override
	public String toString() {
		return "Productos [id=" + id + ", codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", ordenes=" + ordenes + "]";
	}

	
	
	
}
