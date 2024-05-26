package web;

import dao.IprojetDao;
import dao.ProjetDaoImpl;
import metier.entities.Projet;
import dao.SingletonConnection;
import jakarta.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import metier.entities.Projet;
@WebServlet
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
		} else if (path.equals("/ajouterProjet") && (request.getMethod().equals("POST"))) {
			String nom = request.getParameter("nom");
	        String description = request.getParameter("description");
	        Date dateDebut = Date.valueOf(request.getParameter("dateDebut"));
	        Date dateFin = Date.valueOf(request.getParameter("dateFin"));
	        double budget = Double.parseDouble(request.getParameter("budget"));

	        Projet newProject = new Projet(nom, description, dateDebut, dateFin, budget);
	        metier.saveProject(newProject);
	        request.getRequestDispatcher("/home").forward(request, response);
		} else if (path.equals("/suprimer")) {
			int id = Integer.parseInt(request.getParameter("id"));
			metier.deleteProject(id);
			response.sendRedirect("home");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
