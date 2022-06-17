package com.idat.EC2_DanyTamara_Bodega.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC2_DanyTamara_Bodega.model.Bodega;

@Repository
public interface BodegaRepositorio extends JpaRepository<Bodega, Integer> {

	
	
}
