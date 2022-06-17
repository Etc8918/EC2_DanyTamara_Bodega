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

import com.idat.EC2_DanyTamara_Bodega.model.Producto;
import com.idat.EC2_DanyTamara_Bodega.servicio.ProductoServicio;



@RestController
@RequestMapping("/producto/v1")
public class ProductoControlador {
	
	@Autowired
	private ProductoServicio servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Producto>> listarProducto(){
		
		return new ResponseEntity<List<Producto>>(servicio.listarProducto(),HttpStatus.OK); 
	}
	
	@RequestMapping(path="/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void>guardar(@RequestBody Producto producto){
		 servicio.guardarProducto(producto);
		 return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(path = "/listar/{id}")
	public ResponseEntity<Producto> listarPorId(@PathVariable Integer id) {
		
		Producto p = servicio.obtenerProductoId(id);
		if(p != null)
			return new ResponseEntity<Producto>(p,HttpStatus.OK);
		return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
	
	}
	
	@RequestMapping(path="/editar", method = RequestMethod.PATCH)
	public ResponseEntity<Void>editar(@RequestBody Producto bodega){
		Producto p = servicio.obtenerProductoId(bodega.getIdProducto());
		
		if(p !=null ) {
			servicio.editarProducto(bodega);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		Producto p =  servicio.obtenerProductoId(id);
		if (p!= null ) {
			servicio.eliminarProducto(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
			
			 
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);	
			
	}

}
