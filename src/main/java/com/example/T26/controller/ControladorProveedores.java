package com.example.T26.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.T26.dto.Proveedores;
import com.example.T26.service.ProveedoresServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorProveedores {
	
	@Autowired
	ProveedoresServiceImpl proveedoresServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedores> listarProveedores(){
		return proveedoresServiceImpl.listarProveedores();
	}
	
	@PostMapping("/proveedores")
	public Proveedores crearProveedor(@RequestBody Proveedores proveedor) {
		
		return proveedoresServiceImpl.crearProveedor(proveedor);
		
	}
	
	@GetMapping("/proveedores/{id}")
	public Proveedores leerProveedor(@PathVariable(name="id") String id) {
		
		Proveedores proveedor= new Proveedores();
		
		proveedor=proveedoresServiceImpl.leerProveedor(id);
		
		System.out.println("Proveedor segun ID: "+proveedor);
		
		return proveedor;
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedores actualizarProveedor(@PathVariable(name="id")String id,@RequestBody Proveedores proveedor) {
		
		Proveedores proveedor_seleccionado= new Proveedores();
		Proveedores proveedor_actualizado= new Proveedores();
		
		proveedor_seleccionado= proveedoresServiceImpl.leerProveedor(id);

		proveedor_seleccionado.setNombre(proveedor.getNombre());
		
		proveedor_actualizado = proveedoresServiceImpl.actualizarProveedor(proveedor_seleccionado);
		
		System.out.println("La proveedor actualizada es: "+ proveedor_actualizado);
		
		return proveedor_actualizado;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void borrarProveedor(@PathVariable(name="id")String id) {
		proveedoresServiceImpl.borrarProveedor(id);
	}
	
	
}
