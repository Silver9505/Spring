package com.example.demo.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlador {
	
	@GetMapping ("/titulo")
	public String tituloJuego() {
		return "hola";
	}
	
	@GetMapping ("/genero")
	public String descripcionSitio() {
		return "hola2";
	}


}
