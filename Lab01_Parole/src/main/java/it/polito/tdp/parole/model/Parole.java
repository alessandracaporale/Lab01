package it.polito.tdp.parole.model;

import java.util.*;

public class Parole {
	
	List<String> listaparole;
		
	public Parole() {
		listaparole= new LinkedList<String>();
	}
	
	public void addParola(String p) {
		listaparole.add(p);
	}
	
	public List<String> getElenco() {
		LinkedList<String> elenco = new LinkedList<String>(listaparole);
		elenco.sort(new ComparatoreParolePerOrdineAlfabetico());
		return elenco;
	}
	
	public void reset() {
		listaparole.removeAll(listaparole);
	}
	
	public void cancellaParola (String p) {
		listaparole.remove(p);
	}

}
