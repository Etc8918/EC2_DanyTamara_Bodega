package com.idat.EC2_DanyTamara_Bodega.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.idat.EC2_DanyTamara_Bodega.Repositorio.ProductoRepositorio;
import com.idat.EC2_DanyTamara_Bodega.model.Producto;

@Service
public class ProductoServicioImpl implements ProductoServicio {

	@Autowired
	public ProductoRepositorio repositorio;
	@Override
	public void guardarProducto(Producto producto) {
		repositorio.save(producto);
		
	}

	@Override
	public void editarProducto(Producto producto) {
		repositorio.saveAndFlush(producto);
		
	}

	@Override
	public void eliminarProducto(Integer id) {
		repositorio.deleteById(id);
		
	}

	@Override
	public List<Producto> listarProducto() {
		return repositorio.findAll();
	}

	@Override
	public Producto obtenerProductoId(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

}
