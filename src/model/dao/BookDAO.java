package model.dao;

import model.dbContext.ConnectDB;
import model.entity.*;
import model.utils.QueryStore;

import java.sql.*;

import model.dbContext.*;
import java.util.*;

public class BookDAO {
	// When the method return ResultSet, we use pst.executeQuery(), normal we can use pst.executeUpdate()
	// Add book method
	public int addBook(Book book) {
		// Create DB connect
		ConnectDB db = ConnectDB.getInstance();
		int result = 0;
		try {
			// Connect with DB
			Connection con = db.openConnection();
			// Query from class QueryStore
			String query = QueryStore.ADD_BOOK;
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, book.getIdBook());
			pst.setString(2, book.getNameBook());
			pst.setInt(3, book.getYearOfPublish());
			pst.setDouble(4, book.getPrice());
			pst.setString(5, book.getAuthorOfBook());
			System.out.println(pst);
			result = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	// Method Show List
	public List<Book> showList() {
		List<Book> bookList = new ArrayList<>();

		ConnectDB db = ConnectDB.getInstance();

		try {
			// Connect with DB
			Connection con = db.openConnection();
			// Create Query
			String query = QueryStore.GET_ALL_BOOK;
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int yearPublish = rs.getInt(3);
				double price = rs.getDouble(4);
				String authorOfBook = rs.getString(5);
				Book book = new Book(id, name, yearPublish, price, authorOfBook);
				// For Debug
				System.out.println(book);
				bookList.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bookList;
	}
	
	// Delete Method
	public int deleteMethod(int idBook) {
		int result = 0;
		ConnectDB db = ConnectDB.getInstance();
		
		try {
			Connection con = db.openConnection();
			String query = QueryStore.DELETE_BOOK;
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1,idBook);
			result = pst.executeUpdate();
			System.out.println(pst);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
