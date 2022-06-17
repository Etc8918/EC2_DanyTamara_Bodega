package com.idat.EC2_DanyTamara_Bodega.model;

import java.io.Serializable;

public class Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8357641905061211467L;
	private int idProducto;
	private String producto;
	private String descripcion;
	private double precio;
	private int stock;
	
	
	public Producto() {
		super();
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

}
