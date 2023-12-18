package controller;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.*;
import model.entity.Book;

@WebServlet("/add-book")
public class AddBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookDAO bookDAO = new BookDAO();
	public AddBookController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("addBook.jsp");
		dispatcher.forward(request, response);
		response.sendRedirect("book-list");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idBook = Integer.parseInt(request.getParameter("idBook"));
		String nameBook = request.getParameter("nameBook");
		int yearOfPublish = Integer.parseInt(request.getParameter("yearOfPublish"));
		double priceOfBook = Double.parseDouble(request.getParameter("priceBook"));
		String authorOfBook = request.getParameter("authorOfBook");
		Book book = new Book();
		book.setIdBook(idBook);
		book.setNameBook(nameBook);
		book.setYearOfPublish(yearOfPublish);
		book.setPrice(priceOfBook);
		book.setAuthorOfBook(authorOfBook);
		bookDAO.addBook(book);
	}
}
