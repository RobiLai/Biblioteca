package it.test.corsospring.services;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaServiceImpl implements BibliotecaService {

	@Override
	public List<String> getListaLibri() {
		
		List<String> listaLibri = new ArrayList<>();
		
		listaLibri.add(0, "libro 1");
		listaLibri.add(1, "libro 2");
		listaLibri.add(2, "libro 3");
		
		return listaLibri;
	}

}
