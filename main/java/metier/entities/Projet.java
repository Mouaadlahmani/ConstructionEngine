package metier.entities;

import java.sql.Date;

public class Projet {
	
	private int projet_id;
	private String nom;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	private double budget;
	public Projet() {
		super();
	}
	public Projet(String nom, String description, Date dateDebut, Date dateFin, double budget) {
		super();
		this.nom = nom;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.budget = budget;
	}
	public int getProjet_id() {
		return projet_id;
	}
	public void setProjet_id(int projet_id) {
		this.projet_id = projet_id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "Projet [projet_id=" + projet_id + ", nom=" + nom + ", description=" + description + ", dateDebut="
				+ dateDebut + ", dateFin=" + dateFin + ", budget=" + budget + "]";
	}
	
	
	
}
