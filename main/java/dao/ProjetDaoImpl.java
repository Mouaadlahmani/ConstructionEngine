package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.SingletonConnection;

import java.sql.Date;
import metier.entities.Projet;

public class ProjetDaoImpl implements IprojetDao {

	@Override
	public Projet saveProject(Projet p) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO projets(nom, description, dateDebut, dateFin, budget) VALUES(?,?,?,?,?)");
			ps.setString(1, p.getProject_name());
			ps.setString(2, p.getProject_description());
			ps.setDate(3, p.getDateDebut());
			ps.setDate(4, p.getDateFin());
			ps.setDouble(5, p.getBudget());
			ps.executeUpdate();
			PreparedStatement ps2=connection.prepareStatement
					("SELECT MAX(projet_id) AS MAX_ID FROM projets");
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
	public List<Projet> afficherProject() {
		List<Projet> projects = new ArrayList<Projet>();
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM PROJETS");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Projet p = new Projet();
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
	public Projet getProject(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Projet updateProject(Projet p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProject(int projet_id) {
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("DELETE FROM PROJETS WHERE projet_id=?");
			ps.setInt(1, projet_id);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
