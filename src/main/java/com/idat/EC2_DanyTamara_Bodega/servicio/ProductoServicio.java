package com.idat.EC2_DanyTamara_Bodega.servicio;

import java.util.List;

import com.idat.EC2_DanyTamara_Bodega.model.Producto;



public interface ProductoServicio {

	public void guardarProducto(Producto producto);
	public void editarProducto(Producto producto);
	public void eliminarProducto(Integer id);
	public List<Producto> listarProducto();
	public Producto obtenerProductoId(Integer id);
}
