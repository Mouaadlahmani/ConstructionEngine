package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.Iconstruction;
import Dao.IconstructionImpl;
import metier.projet;

public class ControlleurServlet extends HttpServlet{
	private Iconstruction metier;
	@Override
	public void init() throws ServletException {
		metier=new IconstructionImpl();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		if(path.equals("/home.java")){
			request.getRequestDispatcher("jsp/home.jsp").forward(request, response);
		}else {
			response.sendError(response.SC_NOT_FOUND);
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(request, response);
	}
}
