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

import com.example.T26.dto.Suministra;
import com.example.T26.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorSuministra {
	
	@Autowired
	SuministraServiceImpl suministrasServiceImpl;
	
	@GetMapping("/suministras")
	public List<Suministra> listarSuministras(){
		return suministrasServiceImpl.listarSuministras();
	}
	
	@PostMapping("/suministras")
	public Suministra crearSuministra(@RequestBody Suministra suministra) {
		
		return suministrasServiceImpl.crearSuministra(suministra);
		
	}
	
	
	@GetMapping("/suministras/{id}")
	public Suministra leerSuministra(@PathVariable(name="id") Long id) {
		
		Suministra suministra= new Suministra();
		
		suministra=suministrasServiceImpl.leerSuministra(id);
		
		System.out.println("Suministra segun ID: "+suministra);
		
		return suministra;
	}
	
	@PutMapping("/suministras/{id}")
	public Suministra actualizarSuministra(@PathVariable(name="id")Long id,@RequestBody Suministra suministra) {
		
		Suministra suministra_seleccionado= new Suministra();
		Suministra suministra_actualizado= new Suministra();
		
		suministra_seleccionado= suministrasServiceImpl.leerSuministra(id);

		suministra_seleccionado.setPrecio(suministra.getPrecio());
		suministra_seleccionado.setPiezas(suministra.getPiezas());
		suministra_seleccionado.setProveedores(suministra.getProveedores());

		
		suministra_actualizado = suministrasServiceImpl.actualizarSuministra(suministra_seleccionado);
		
		System.out.println("El suministra actualizado es: "+ suministra_actualizado);
		
		return suministra_actualizado;
	}
	
	@DeleteMapping("/suministras/{id}")
	public void borrarSuministra(@PathVariable(name="id")Long id) {
		suministrasServiceImpl.borrarSuministra(id);
	}
	
	
}
