package com.idat.EC2_DanyTamara_Bodega.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.idat.EC2_DanyTamara_Bodega.Repositorio.UsuarioRepositorio;
import com.idat.EC2_DanyTamara_Bodega.model.Usuario;
@Service
public class UsuarioServicioImpl implements UsuarioServicio{

	@Autowired
	public UsuarioRepositorio repositorio;
	@Override
	public void guardarUsuario(Usuario usuario) {
		repositorio.save(usuario);
		
	}

	@Override
	public void editarUsuario(Usuario usuario) {
		repositorio.saveAndFlush(usuario);
		
	}

	@Override
	public void eliminarUsuario(Integer id) {
		repositorio.deleteById(id);
		
	}

	@Override
	public List<Usuario> listarUsuario() {
		return repositorio.findAll();
	}

	@Override
	public Usuario obtenerUsuarioId(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

}
