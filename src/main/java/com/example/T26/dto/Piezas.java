package com.example.T26.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="piezas")

public class Piezas {

	//Atributos de la entidad Empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo")
	private Long codigo;
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="codigopieza")
	private List<Suministra> suministra;
	
	//Constructores
	
	public Piezas() {
		
	}
	
	public Piezas(Long codigo, String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
	}

	//Setters y getters
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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
		return "Piezas [codigo = " + codigo +", nombre = " + nombre +" ] ";
	}
}