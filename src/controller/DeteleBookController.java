package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.BookDAO;

/**
 * Servlet implementation class DeteleBookController
 */
@WebServlet("/delete-book")
public class DeteleBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookDAO bookDao = new BookDAO();

	public DeteleBookController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("idBook"));
		bookDao.deleteMethod(id);	
		response.sendRedirect("book-list");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

}
