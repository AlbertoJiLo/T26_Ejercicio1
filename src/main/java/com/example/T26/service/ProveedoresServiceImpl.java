package com.example.T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.T26.dao.IProveedoresDAO;
import com.example.T26.dto.Proveedores;

@Service
public class ProveedoresServiceImpl implements IProveedoresService{
	
	//Utilizamos los metodos de la interface IProveedorDAO, es como si instanciaramos.
	@Autowired
	IProveedoresDAO iProveedorDAO;
	
	@Override
	public List<Proveedores> listarProveedores() {
		return iProveedorDAO.findAll();
	}
	
	@Override
	public Proveedores crearProveedor(Proveedores proveedor) {
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public Proveedores leerProveedor(String id) {
		return iProveedorDAO.findById(id).get();
	}


	@Override
	public Proveedores actualizarProveedor(Proveedores proveedor) {
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public void borrarProveedor(String id) {
		iProveedorDAO.deleteById(id);
	}


}
