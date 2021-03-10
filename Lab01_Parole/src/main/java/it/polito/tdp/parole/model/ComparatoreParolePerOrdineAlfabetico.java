package it.polito.tdp.parole.model;

import java.util.*;

public class ComparatoreParolePerOrdineAlfabetico implements Comparator<String> {

	@Override
	public int compare (String s1, String s2) {
		return s1.toUpperCase().compareTo(s2.toUpperCase());
	}
}
