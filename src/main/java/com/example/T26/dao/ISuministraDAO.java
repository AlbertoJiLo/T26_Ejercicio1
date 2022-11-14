package com.example.T26.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.T26.dto.Suministra;


public interface ISuministraDAO extends JpaRepository<Suministra, Long>{
	
}
