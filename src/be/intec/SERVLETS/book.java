package be.intec.SERVLETS;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import be.intec.ENTITIES.Bookmark;

/**
 * Servlet implementation class book
 */
@WebServlet("/book")
public class book extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VIEW = "WEB-INF/JSP/bookmark.jsp";   
    /**
     * @see HttpServlet#HttpServlet()
     */
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher(VIEW);
		Bookmark bookmark1 = new Bookmark("google", "http://www.google.com", "search", 5);
		Bookmark bookmark2 = new Bookmark("yahoo", "http://www.yahoo.com", "search", 4);
		Bookmark bookmark3 = new Bookmark("bing", "http://www.bing.com", "search", 2);
		Bookmark bookmark4 = new Bookmark("yahoo", "http://www.yahoo.com", "search", 3);
		ArrayList<Bookmark> hyperlinks = new ArrayList<Bookmark>();
		hyperlinks.add(bookmark1);
		hyperlinks.add(bookmark2);
		hyperlinks.add(bookmark3);
		hyperlinks.add(bookmark4);
		request.setAttribute("hyperlinks", hyperlinks);	
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
