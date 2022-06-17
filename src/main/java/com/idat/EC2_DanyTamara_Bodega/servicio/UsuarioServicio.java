package com.idat.EC2_DanyTamara_Bodega.servicio;

import java.util.List;

import com.idat.EC2_DanyTamara_Bodega.model.Usuario;



public interface UsuarioServicio {
	
	public void guardarUsuario(Usuario usuario);
	public void editarUsuario(Usuario usuario);
	public void eliminarUsuario(Integer id);
	public List<Usuario> listarUsuario();
	public Usuario obtenerUsuarioId(Integer id);


}
