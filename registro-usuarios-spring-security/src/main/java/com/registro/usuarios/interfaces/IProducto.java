package com.registro.usuarios.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.registro.usuarios.modelo.Producto;

@Repository
public interface IProducto extends CrudRepository<Producto, Integer>{

}
