package com.idat.EC2_DanyTamara_Bodega.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2_DanyTamara_Bodega.Repositorio.BodegaRepositorio;
import com.idat.EC2_DanyTamara_Bodega.model.Bodega;

@Service
public class BodegaServicioImpl implements BodegaServicio {

	@Autowired
	public BodegaRepositorio repositorio;
	@Override
	public void guardarBodega(Bodega bodega) {
		repositorio.save(bodega);

	}

	@Override
	public void editarBodega(Bodega bodega) {
		repositorio.saveAndFlush(bodega);

	}

	@Override
	public void eliminarBodega(Integer id) {
		repositorio.deleteById(id);

	}

	@Override
	public List<Bodega> listarBodega() {
		
		return repositorio.findAll();
	}

	@Override
	public Bodega obtenerBodegaId(Integer id) {
		
		return repositorio.findById(id).orElse(null);
	}

}
