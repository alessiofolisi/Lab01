package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole {
		
	
	private List<String> elencoParole = new LinkedList<String>();
	
	public Parole() {
	}
	
	public void removeParola(String p) {
		elencoParole.remove(p);
	}
	
	public void addParola(String p) {
		elencoParole.add(p);
	}
	
	public List<String> getElenco() {
	
		Collections.sort(elencoParole, new Comparator());
		
		return elencoParole;
	}
	
	public void reset() {
		elencoParole.clear();
	}

}
