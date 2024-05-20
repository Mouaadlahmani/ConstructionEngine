package metier;

import java.sql.Date;
import java.util.List;

import metier.ressource;

public class tache {
	private int tache_id;
	private String tache_description;
	private Date dateDebut;
	private Date dateFin;
	private String statut;
	private List<ressource> ressources;
	public tache() {
		super();
	}
	public tache(String tache_description, Date dateDebut, Date dateFin, String statut,
			List<ressource> ressources) {
		super();
		this.tache_description = tache_description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.statut = statut;
		this.ressources = ressources;
	}
	public int getTache_id() {
		return tache_id;
	}
	public void setTache_id(int tache_id) {
		this.tache_id = tache_id;
	}
	public String getTache_description() {
		return tache_description;
	}
	public void setTache_description(String tache_description) {
		this.tache_description = tache_description;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public List<ressource> getRessources() {
		return ressources;
	}
	public void setRessources(List<ressource> ressources) {
		this.ressources = ressources;
	}
	
}
