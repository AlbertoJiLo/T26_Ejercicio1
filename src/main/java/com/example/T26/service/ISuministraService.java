package com.example.T26.service;

import java.util.List;

import com.example.T26.dto.Proveedores;
import com.example.T26.dto.Suministra;

public interface ISuministraService {

	//Metodos del CRUD
	
	public List<Suministra> listarSuministras(); //Listar All 
	
	public Suministra crearSuministra(Suministra suministras);	//CREATE
			
	public Suministra actualizarSuministra(Suministra suministra); // UPDATE
	
	public void borrarSuministra(Long id);// DELETE

	public Suministra leerSuministra(Long id); // READ
		
}
