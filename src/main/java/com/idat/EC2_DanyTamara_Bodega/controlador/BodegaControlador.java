package com.idat.EC2_DanyTamara_Bodega.controlador;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.EC2_DanyTamara_Bodega.model.Bodega;
import com.idat.EC2_DanyTamara_Bodega.servicio.BodegaServicio;

@RestController
@RequestMapping("/bodega/v1")
public class BodegaControlador {
	
	@Autowired
	private BodegaServicio servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Bodega>> listarBodega(){
		
		return new ResponseEntity<List<Bodega>>(servicio.listarBodega(),HttpStatus.OK); 
	}
	
	@RequestMapping(path="/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void>guardar(@RequestBody Bodega bodega){
		 servicio.guardarBodega(bodega);
		 return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(path = "/listar/{id}")
	public ResponseEntity<Bodega> listarPorId(@PathVariable Integer id) {
		
		Bodega b = servicio.obtenerBodegaId(id);
		if(b != null)
			return new ResponseEntity<Bodega>(b,HttpStatus.OK);
		return new ResponseEntity<Bodega>(HttpStatus.NOT_FOUND);
	
	}
	
	@RequestMapping(path="/editar", method = RequestMethod.PATCH)
	public ResponseEntity<Void>editar(@RequestBody Bodega bodega){
		Bodega b = servicio.obtenerBodegaId(bodega.getIdBodega());
		
		if(b !=null ) {
			servicio.editarBodega(bodega);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		Bodega b =  servicio.obtenerBodegaId(id);
		if (b!= null ) {
			servicio.eliminarBodega(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
			
			 
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
			
	}
	
	

}
