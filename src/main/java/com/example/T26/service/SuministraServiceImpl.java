package com.example.T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.T26.dao.ISuministraDAO;
import com.example.T26.dto.Piezas;
import com.example.T26.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService{
	
	//Utilizamos los metodos de la interface ISuministraDAO, es como si instanciaramos.
	@Autowired
	ISuministraDAO iSuministraDAO;
	
	@Override
	public List<Suministra> listarSuministras() {
		return iSuministraDAO.findAll();
	}
	
	@Override
	public Suministra leerSuministra(Long id) {
		return iSuministraDAO.findById(id).get();
	}
	
	@Override
	public Suministra crearSuministra(Suministra suministra) {
		return iSuministraDAO.save(suministra);
	}


	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		return iSuministraDAO.save(suministra);
	}

	@Override
	public void borrarSuministra(Long id) {
		iSuministraDAO.deleteById(id);
	}

		



}
