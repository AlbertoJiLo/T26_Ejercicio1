package com.example.T26.service;

import java.util.List;

import com.example.T26.dto.Piezas;

public interface IPiezasService {

	//Metodos del CRUD
	
	public List<Piezas> listarPiezas(); //Listar All 
	
	public Piezas crearPieza(Piezas piezas);	//CREATE
	
	public Piezas leerPieza(Long codigo); // READ
		
	public Piezas actualizarPieza(Piezas pieza); // UPDATE
	
	public void borrarPieza(Long codigo);// DELETE
	
	
}