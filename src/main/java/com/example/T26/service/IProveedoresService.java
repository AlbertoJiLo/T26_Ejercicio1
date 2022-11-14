package com.example.T26.service;

import java.util.List;

import com.example.T26.dto.Proveedores;

public interface IProveedoresService {

	//Metodos del CRUD
	
	public List<Proveedores> listarProveedores(); //Listar All 
	
	public Proveedores crearProveedor(Proveedores proveedores);	//CREATE
	
	public Proveedores leerProveedor(String id); // READ
		
	public Proveedores actualizarProveedor(Proveedores proveedor); // UPDATE
	
	public void borrarProveedor(String id);// DELETE
	
	
}