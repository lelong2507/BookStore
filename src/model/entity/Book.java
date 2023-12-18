package model.entity;

public class Book {
	private int idBook;
	private String nameBook;
	private int yearOfPublish; 
	private double price;
	private String authorOfBook;
	
	public Book() {
		
	}

	public Book(int idBook, String nameBook, int yearPublish, double price,String authorOfBook) {
		super();
		this.idBook = idBook;
		this.nameBook = nameBook;
		this.yearOfPublish = yearPublish;
		this.price = price;
		this.authorOfBook = authorOfBook;
	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public String getNameBook() {
		return nameBook;
	}

	public void setNameBook(String nameBook) {
		this.nameBook = nameBook;
	}

	public int getYearOfPublish() {
		return yearOfPublish;
	}

	public void setYearOfPublish(int yearPublish) {
		this.yearOfPublish = yearPublish;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

	public String getAuthorOfBook() {
		return authorOfBook;
	}

	public void setAuthorOfBook(String authorOfBook) {
		this.authorOfBook = authorOfBook;
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", nameBook=" + nameBook + ", yearOfPublish=" + yearOfPublish + ", price="
				+ price + "authorOfBook= " + authorOfBook + "]";
	}
	
}
