package it.test.corsospring.main;

import java.util.List;

import it.test.corsospring.classes.Biblioteca;

public class BibliotecaView {

	public static void main (String[] args) {
		
		Biblioteca b = new Biblioteca();
		
		List<String> listaLibriVis = b.getListaLibri();
		
		for(String l : listaLibriVis) {
			System.out.println(l);
		}
		
		
	}
}
