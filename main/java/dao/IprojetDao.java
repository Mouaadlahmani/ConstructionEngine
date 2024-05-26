package dao;

import java.util.List;

import metier.entities.Projet;

public interface IprojetDao {
	public Projet saveProject(Projet p);
	public List<Projet> afficherProject();
	public Projet getProject(int id);
	public Projet updateProject(int id,Projet p);
	public void deleteProject(int projet_id);
}