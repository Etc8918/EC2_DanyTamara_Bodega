package com.idat.EC2_DanyTamara_Bodega.servicio;

import java.util.List;

import com.idat.EC2_DanyTamara_Bodega.model.Bodega;

public interface BodegaServicio {
	
	public void guardarBodega(Bodega bodega);
	public void editarBodega(Bodega bodega);
	public void eliminarBodega(Integer id);
	public List<Bodega> listarBodega();
	public Bodega obtenerBodegaId(Integer id);

}
