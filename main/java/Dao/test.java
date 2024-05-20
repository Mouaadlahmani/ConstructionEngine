package Dao;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import metier.projet;
import metier.tache;

public class test {
	public static void main(String[] args) {
		IconstructionImpl dao = new IconstructionImpl();
		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy"); Date date1 = new
		 * Date(20,05,2024); Date date2 = new Date(2024,10,20);
		 * System.out.println(sdf.format(date1)); String dateFin = sdf.format(date2);
		 */
		/*
		 * projet p1 = dao.saveProject( new projet("FIRST", "Description",
		 * dateDebut,dateFin, 20000.0)); System.out.println(p1.toString());
		 */
		 
		List<projet> proj= dao.afficherProject();
		for(projet p :proj){
			System.out.println(p.toString());
		}
	}
}
