package Dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import metier.projet;
import metier.ressource;
import metier.tache;

public class IconstructionImpl implements Iconstruction{

	@Override
	public projet saveProject(projet p) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO projets(project_name, project_description, dateDebut, dateFin, budget) VALUES(?,?,?,?,?)");
			ps.setString(1, p.getProject_name());
			ps.setString(2, p.getProject_description());
			ps.setDate(3, p.getDateDebut());
			ps.setDate(4, p.getDateFin());
			ps.setDouble(5, p.getBudget());
			ps.executeUpdate();
			PreparedStatement ps2=connection.prepareStatement
					("SELECT MAX(project_id) AS MAX_ID FROM projects");
			ResultSet rs=ps2.executeQuery();
			if(rs.next()) {
				p.setProject_id(rs.getInt("MAX_ID"));
			}
			ps.close();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public List<projet> afficherProject() {
		List<projet> projects = new ArrayList<projet>();
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM PROJETS");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				projet p = new projet();
				p.setProject_id(rs.getInt("projet_id"));
				p.setProject_name(rs.getString("nom"));
				p.setDateDebut(rs.getDate("dateDebut"));
				p.setDateFin(rs.getDate("dateFin"));
				p.setProject_description(rs.getString("description"));
				p.setBudget(rs.getDouble("budget"));
				projects.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return projects;
	}

	@Override
	public projet getProject(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public projet updateProject(projet p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProject(int id) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public tache saveTache(tache t) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO TACHES (tache_description,"
					+ " dateDebut, dateFin, statut, ressources) VALUES(?,?,?,?,?)");
			ps.setString(1, t.getTache_description());
			ps.setDate(2, t.getDateDebut());
			ps.setDate(3, t.getDateFin());
			ps.setString(4, t.getStatut());
			ps.setArray(4, (Array) t.getRessources());
			ps.executeUpdate();
			PreparedStatement ps2=connection.prepareStatement
					("SELECT MAX(project_id) AS MAX_ID FROM projects");
			ResultSet rs=ps2.executeQuery();
			if(rs.next()) {
				t.setTache_id(rs.getInt("tache_id"));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public List<tache> afficherTache() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public tache getTache(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public tache updateTache(tache t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteTache(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ressource saveRessource(ressource r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ressource> afficherRessource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ressource getRessource(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ressource updateRessource(projet p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRessource(int id) {
		// TODO Auto-generated method stub
		
	}


}
