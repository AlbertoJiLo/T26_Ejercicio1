package com.example.T26.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.T26.dto.Piezas;


public interface IPiezasDAO extends JpaRepository<Piezas, Long>{
	
}
