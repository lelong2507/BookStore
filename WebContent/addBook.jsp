<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Add Book here</title>
<link rel="stylesheet" href="style/style.css">
<style>
.form-group{
	width:500px;
	height:330px;
}
</style>
</head>


<body>

	<div class="container">
		<h1 class="text-heading">Add Book Space</h1>
		<div class="form-group">
			<form action="add-book" method="post" class="form">
				<span>ID of Book: <input type="text" name="idBook" placeholder="Id of Book"></span>
				<span>Name of Book: <input type="text" placeholder="Enter Name" name="nameBook" placeholder="Id of Book"></span> 
				<span>Year of Publish: <input type="number" placeholder="Enter Year of Publish" name="yearOfPublish"></span>
				<span>Price of Book: <input type="text" placeholder="Enter Price" name="priceBook"></span>
				<span>Author of Book: <input type="text" name="authorOfBook" placeholder="Author of Book"></span>
				<input type="submit" value="Submit" class="btn">
			</form>
		</div>

	</div>

</body>

</html>