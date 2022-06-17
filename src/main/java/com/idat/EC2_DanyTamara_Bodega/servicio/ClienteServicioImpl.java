package com.idat.EC2_DanyTamara_Bodega.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC2_DanyTamara_Bodega.Repositorio.ClienteRepositorio;

import com.idat.EC2_DanyTamara_Bodega.model.Cliente;
@Service
public class ClienteServicioImpl implements ClienteServicio{
	@Autowired
	public ClienteRepositorio repositorio;
	
	@Override
	public void guardarCliente(Cliente cliente) {
		repositorio.save(cliente);
		
	}

	@Override
	public void editarCliente(Cliente cliente) {
		repositorio.saveAndFlush(cliente);
		
	}

	@Override
	public void eliminarCliente(Integer id) {
		repositorio.deleteById(id);
		
	}

	@Override
	public List<Cliente> listarCliente() {
		return repositorio.findAll();
	}

	@Override
	public Cliente obtenerClienteId(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

}
