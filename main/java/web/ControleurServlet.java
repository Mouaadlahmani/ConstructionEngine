package web;

import dao.IprojetDao;
import dao.ProjetDaoImpl;
import metier.entities.Projet;
import dao.SingletonConnection;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import metier.entities.Projet;
@WebServlet(name = "ControleurServlet", value = "/ControleurServlet")
public class ControleurServlet extends HttpServlet {
	private ProjetDaoImpl metier;

	@Override
	public void init() throws ServletException {
		metier = new ProjetDaoImpl();
	}

	@Override
	protected void doGet(HttpServletRequest request,
						 HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		if (path.equals("/home")) {
			List<Projet> projet = metier.afficherProject();
			request.setAttribute("model", projet);
			request.getRequestDispatcher("jsp/projet.jsp").forward(request, response);

		} else if (path.equals("/ajouter")) {
			request.getRequestDispatcher("jsp/ajouter.jsp").forward(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nomProjet = request.getParameter("nomProjet");
		String description = request.getParameter("description");
		String dateDebutStr = request.getParameter("dateDebut");
		String dateFinStr = request.getParameter("dateFin");
		String budgetStr = request.getParameter("budget");

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date dateDebut = dateFormat.parse(dateDebutStr);
			Date dateFin = dateFormat.parse(dateFinStr);
			double budget = Double.parseDouble(budgetStr);

			Projet projet = new Projet();
			projet.setNom(nomProjet);
			projet.setDescription(description);
			projet.setDateDebut(dateDebut);
			projet.setDateFin(dateFin);
			projet.setBudget(budget);

			try (Connection connection = SingletonConnection.getConnection()) {
				ProjetDaoImpl daoProjet = new ProjetDaoImpl();
				daoProjet.saveProject(projet);
			} catch (SQLException e) {
				e.printStackTrace();
			}

			response.sendRedirect("success.html");
		} catch (ParseException | NumberFormatException e) {
			e.printStackTrace();
			response.sendRedirect("error.html");
		}

		String path = request.getServletPath();
		if(path.equals("/ajouter")) {
			request.getRequestDispatcher("jsp/home.jsp").forward(request, response);
		}
	}
}
