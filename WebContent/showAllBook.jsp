<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Book</title>
<link rel="stylesheet" href="style/style.css">
</head>
<body>
	<h2>All of Book in Store</h2>
	<a href="addBook.jsp" class="text-link">Add another book in store</a>

	<table class="table">
		<th>
		<td>ID</td>
		<td>Name of Book</td>
		<td>Year Of Publish</td>
		<td>Price</td>
		<td>Author of Book</td>
		</th>
		<c:forEach var="book" items="${book_list}">

			<tr>
				<td><p>Id of Book: ${book.idBook}</p></td>
				<td><p>Name of Book: ${book.nameBook}</p></td>
				<td><p>Year of Publish: ${book.yearOfPublish}</p></td>
				<td><p>Price of Book: ${book.price}</p></td>
				<td><p>Author of Book: ${book.authorOfBook}</p></td>
				<td>
					<form action="delete-book" method="GET">
						<button type="submit" class="btn">
							<a href="delete-book?idBook=${book.idBook}" class="text-link">Delete</a>
						</button>
					</form>
				</td>
				</td>
			</tr>
		</c:forEach>
	</table>




</body>
</html>