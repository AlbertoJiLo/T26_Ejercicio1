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

import com.example.T26.dto.Piezas;
import com.example.T26.service.PiezasServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorPiezas {
	
	@Autowired
	PiezasServiceImpl piezasServiceImpl;
	
	@GetMapping("/piezas")
	public List<Piezas> listarPiezas(){
		return piezasServiceImpl.listarPiezas();
	}
	
	@PostMapping("/piezas")
	public Piezas crearPieza(@RequestBody Piezas pieza) {
		
		return piezasServiceImpl.crearPieza(pieza);
		
	}
	
	
	@GetMapping("/piezas/{codigo}")
	public Piezas leerPieza(@PathVariable(name="codigo") Long codigo) {
		
		Piezas pieza= new Piezas();
		
		pieza=piezasServiceImpl.leerPieza(codigo);
		
		System.out.println("Pieza segun ID: "+pieza);
		
		return pieza;
	}
	
	@PutMapping("/piezas/{codigo}")
	public Piezas actualizarPieza(@PathVariable(name="codigo")Long codigo,@RequestBody Piezas pieza) {
		
		Piezas pieza_seleccionado= new Piezas();
		Piezas pieza_actualizado= new Piezas();
		
		pieza_seleccionado= piezasServiceImpl.leerPieza(codigo);

		pieza_seleccionado.setNombre(pieza.getNombre());
		
		pieza_actualizado = piezasServiceImpl.actualizarPieza(pieza_seleccionado);
		
		System.out.println("La pieza actualizada es: "+ pieza_actualizado);
		
		return pieza_actualizado;
	}
	
	@DeleteMapping("/piezas/{codigo}")
	public void borrarPieza(@PathVariable(name="codigo") Long codigo) {
		piezasServiceImpl.borrarPieza(codigo);
	}
	
	
}
