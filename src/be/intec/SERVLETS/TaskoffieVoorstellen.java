package be.intec.SERVLETS;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.intec.ENTITIES.TasKoffie;


/**
 * Servlet implementation class TaskoffieVoorstellen
 */
@WebServlet("/TaskoffieVoorstellen")
public class TaskoffieVoorstellen extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "WEB-INF/JSP/taskoffie.jsp";   
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher(VIEW);
		
		
			List<String> soort =  Arrays.asList("capucciono","soort2","soort3","soort4","soort5","soort6","soort7","soort8","soort9","soort10");
			
			
			
			List<String> merk =  Arrays.asList("edgbert","merk2","merk3","merk4","merk5","merk6","merk7","merk8","merk9","merk10");
			ArrayList<TasKoffie> collectie = new ArrayList<TasKoffie>();
			
			for(int i=0; i<10; i++){
				
				collectie.add(new TasKoffie(soort.get(i), merk.get(i)));
				
				
			}
		System.out.println(collectie.get(0));
		
		request.setAttribute("collectie", collectie);	
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
