package com.registro.usuarios.controlador;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.registro.usuarios.interfaceService.IproductoService;
import com.registro.usuarios.modelo.Producto;


@Controller
public class RegistroControlador {

	@Autowired
    private IproductoService service;
	
	/*@GetMapping({"/" , "/index"})
	public String inicio() {
		return "index";
	}*/

	@GetMapping("/login")
	public String iniciarSesion() {
		return "login";
	}

	/*@GetMapping("/signup")
	public String registar() {
		return "signup";
	}*/

	
	@GetMapping({"/" , "/index"})
	public String verPaginaDeInicio(Model model) {
		List<Producto> productos = service.listar();
        model.addAttribute("productos", productos);
        return "index";
	}
}
