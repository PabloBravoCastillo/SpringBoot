package com.registro.usuarios.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registro.usuarios.interfaceService.IproductoService;
import com.registro.usuarios.interfaces.IProducto;
import com.registro.usuarios.modelo.Producto;

@Service
public class ProductoService implements IproductoService{
	
	@Autowired
	private IProducto data;

	@Override
	public List<Producto> listar() {		
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> listarId(int id) {		
		return (Optional<Producto>) data.findById(id);
	}

}
