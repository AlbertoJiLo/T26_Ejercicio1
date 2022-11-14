package com.example.T26.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="proveedores")

public class Proveedores {

	//Atributos de la entidad Empleado
	@Id
	private String id;
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="idproveedor")
	private List<Suministra> suministra;
	
	//Constructores
	
	public Proveedores() {
		
	}
	
	public Proveedores(String id, String nombre) {
		this.id=id;
		this.nombre=nombre;
	}

	//Getters setters
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
	public List<Suministra> getSuministra() {
		return suministra;
	}

	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	//To string personalizado
	@Override
	public String toString() {
		return "Proveedores [id = " + id +", nombre = " + nombre +" ] ";
	}
}
