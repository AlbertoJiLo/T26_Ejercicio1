package com.example.T26.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.T26.dto.Proveedores;


public interface IProveedoresDAO extends JpaRepository<Proveedores, String>{
	
}
