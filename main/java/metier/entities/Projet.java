package metier.entities;

import java.sql.Date;

public class Projet {
	
	private int project_id;
	private String project_name;
	private String project_description;
	private Date dateDebut;
	private Date dateFin;
	private double budget;
	public Projet() {
		super();
	}
	public Projet(String project_name, String project_description, Date dateDebut, Date dateFin,
			double budget) {
		super();
		this.project_name = project_name;
		this.project_description = project_description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.budget = budget;
	}
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getProject_description() {
		return project_description;
	}
	public void setProject_description(String project_description) {
		this.project_description = project_description;
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
		return "projet [projet_id=" + project_id + ", nom=" + project_name + ", description="
				+ project_description + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", budget=" + budget
				+ "]";
	}
	
	 
}
