package it.test.corsospring.classes;

import java.util.List;

import it.test.corsospring.services.BibliotecaService;
import it.test.corsospring.services.BibliotecaServiceImpl;

public class Biblioteca {

	private BibliotecaService service;
	
	public Biblioteca() {
		service = new BibliotecaServiceImpl();
	}
	
	public List<String> getListaLibri(){
		
		return service.getListaLibri();
		
	}
	
}
