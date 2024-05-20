package web;

import java.util.ArrayList;
import java.util.List;

import metier.projet;

public class Model {
	private List<projet> projets = new ArrayList<projet>();

	public List<projet> getProjets() {
		return projets;
	}

	public void setProjets(List<projet> projets) {
		this.projets = projets;
	}
	
}
