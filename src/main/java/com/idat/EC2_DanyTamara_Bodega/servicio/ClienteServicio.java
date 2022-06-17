package com.idat.EC2_DanyTamara_Bodega.servicio;

import java.util.List;


import com.idat.EC2_DanyTamara_Bodega.model.Cliente;

public interface ClienteServicio {
	
	public void guardarCliente(Cliente cliente);
	public void editarCliente(Cliente cliente);
	public void eliminarCliente(Integer id);
	public List<Cliente> listarCliente();
	public Cliente obtenerClienteId(Integer id);
}
