package model.utils;

public class QueryStore {
	// Query for add book
	public static final String ADD_BOOK = "INSERT INTO bookStore(idBook, nameBook, yearOfPublish, priceBook, authorOfBook) VALUES (?, ?, ?, ?, ?);";
	// Query for show list  of book
	public static final String GET_ALL_BOOK = "SELECT * FROM bookStore;";
	// Query for delete element
	public static final String DELETE_BOOK = "DELETE FROM bookStore WHERE idBook = ?;";
}
