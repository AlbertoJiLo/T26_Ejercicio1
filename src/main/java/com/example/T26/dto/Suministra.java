package com.example.T26.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="suministra")
public class Suministra implements Serializable{
	
	

	//Atributos de la entidad Empleado

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int precio;
	
	@ManyToOne
	@JoinColumn(name="codigopieza")
	private Piezas piezas;
	
	@ManyToOne
	@JoinColumn(name="idproveedor")
	private Proveedores proveedores;
	
	
	//Constructores
	
	public Suministra() {
		
	}
	
	public Suministra(Long id,Piezas piezas, Proveedores proveedores, int precio) {
		this.id=id;
		this.piezas=piezas;
		this.proveedores=proveedores;
		this.precio=precio;
	}

	//Setters y getters
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Piezas getPiezas() {
		return piezas;
	}


	public void setPiezas(Piezas piezas) {
		this.piezas = piezas;
	}

	public Proveedores getProveedores() {
		return proveedores;
	}

	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	//To string personalizado
	@Override
	public String toString() {
		return "Suministra [id = " +id+ ",piezas = " + piezas +", proveedores = " + proveedores +", precio " +precio+ " ] ";
	}


}
