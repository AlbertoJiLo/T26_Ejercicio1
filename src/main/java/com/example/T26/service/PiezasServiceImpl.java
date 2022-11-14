package com.example.T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.T26.dao.IPiezasDAO;
import com.example.T26.dto.Piezas;

@Service
public class PiezasServiceImpl implements IPiezasService{
	
	//Utilizamos los metodos de la interface IPiezaDAO, es como si instanciaramos.
	@Autowired
	IPiezasDAO iPiezaDAO;
	
	@Override
	public List<Piezas> listarPiezas() {
		return iPiezaDAO.findAll();
	}
	
	@Override
	public Piezas crearPieza(Piezas codigo) {
		return iPiezaDAO.save(codigo);
	}

	@Override
	public Piezas leerPieza(Long codigo) {
		return iPiezaDAO.findById(codigo).get();
	}


	@Override
	public Piezas actualizarPieza(Piezas pieza) {
		return iPiezaDAO.save(pieza);
	}

	@Override
	public void borrarPieza(Long codigo) {
		iPiezaDAO.deleteById(codigo);
	}

}