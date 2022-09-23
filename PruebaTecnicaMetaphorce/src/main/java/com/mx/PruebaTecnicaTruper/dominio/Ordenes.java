package com.mx.PruebaTecnicaTruper.dominio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="ordenes")

public class Ordenes {


	@Id
	@Column
	int id;
	@Column
	Date fecha= new Date();
	@Column
	 int total;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ID_SUCURSALES")
	Sucursales sucursales;
	
	
	@OneToMany(mappedBy="ordenes", cascade=CascadeType.ALL)
	List<Productos>lista=new ArrayList<Productos>();
	
    
	public Ordenes() {
		
	}
	
public Ordenes(int id) {
		this.id=id;
	}
	

	public Ordenes(int id, Date fecha, int total, Sucursales sucursales) {
		
		this.id = id;
		this.fecha = fecha;
		this.total = total;
		this.sucursales = sucursales;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Sucursales getSucursales() {
		return sucursales;
	}

	public void setOrdenes(Sucursales sucursales) {
		this.sucursales = sucursales;
	}

	@Override
	public String toString() {
		return "Ordenes [id=" + id + ", fecha=" + fecha + ", total=" + total + ",sucursales=" + sucursales + "]";
	}

	
	
	
}
