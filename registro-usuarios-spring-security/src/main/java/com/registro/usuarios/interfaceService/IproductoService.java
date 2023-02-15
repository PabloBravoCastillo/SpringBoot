package com.registro.usuarios.interfaceService;

import java.util.List;
import java.util.Optional;

import com.registro.usuarios.modelo.Producto;

public interface IproductoService {
	
	public List<Producto>listar();
	public Optional<Producto>listarId(int id);

}
