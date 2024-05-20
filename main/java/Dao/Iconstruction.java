package Dao;

import java.util.List;

import metier.projet;
import metier.ressource;
import metier.tache;

public interface Iconstruction {
	public projet saveProject(projet p);
	public List<projet> afficherProject();
	public projet getProject(int id);
	public projet updateProject(projet p);
	public void deleteProject(int id);
	
	public tache saveTache(tache t);
	public List<tache> afficherTache();
	public tache getTache(int id);
	public tache updateTache(tache t);
	public void deleteTache(int id);
	
	public ressource saveRessource(ressource r);
	public List<ressource> afficherRessource();
	public ressource getRessource(int id);
	public ressource updateRessource(projet p);
	public void deleteRessource(int id);
}
