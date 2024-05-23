package web;

import java.util.ArrayList;
import java.util.List;

import metier.entities.Projet;

public class ProjetModel {
	private List<Projet> projets=new ArrayList<Projet>();

	public List<Projet> getProjets() {
		return projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}


}
