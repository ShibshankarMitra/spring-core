<!doctype html>
<html lang="en">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<link rel="stylesheet" href="<c:url value="/resources/css/style1.css"/>">

<script>
	function openForm() {
		document.getElementById("myForm").style.display = "block";
	}

	function OpenPopUp() {

		document.getElementById("deletePopUp").style.display = "block";
	}

	function closeForm() {
		document.getElementById("myForm").style.display = "none";
	}

	function closeDeleteForm() {
		document.getElementById("myDeleteForm").style.display = "none";
	}
</script>

<title>home</title>
</head>
<body class=bg-dark>

	<h1 class="text-center" style="padding-top: 2%; color: white;">Welcome
		to Product App</h1>

	<h3 class="text-center" style="padding-top: 1%; color: white;">${msg }
	</h3>




	<div class="container-fluid mt-2"
		style="padding-top: 2%; text-align: center; width: 93%">

		<div class="card" style="width: 100%; align-content: center;">


			<div class="card-body">
				<p class="card-text">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Product ID</th>
							<th scope="col">Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Additional Information</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="product" items="${products }">


							<tr>
								<th scope="row"><c:out value="${product.id }"></c:out></th>
								<td><c:out value="${product.name }"></c:out></td>
								<td><c:out value="${product.description }"></c:out></td>
								<td><c:out value="${product.price }"></c:out></td>
								<td><c:out value="${product.details }"></c:out>
									</td>
								<td>
									<!-- <button class="open-button" onclick="OpenPopUp()">Delete</button> -->
									<form method="post"
										action="delete/${product.id}">
										
										<button type="submit" class="btn btn-primary">Delete</button>
										</form>
								</td>
							</tr>

						</c:forEach>
					</tbody>







				</table>

				<button class="open-button" onclick="openForm()">Add
					Product</button>
			</div>

			<div class="form-popup" id="myForm">


				<form class="form-container" action="add" method="post">

					<h1>Add Product</h1>
					<div class="form-group">
						<label for="exampleFormControlInput1">Name</label> <input
							type="text" class="form-control" id="exampleFormControlInput1"
							placeholder="sample product" name="name">
					</div>



					<div class="form-group">
						<label for="exampleFormControlTextarea1">Description</label>
						<textarea class="form-control" id="exampleFormControlTextarea1"
							rows="3" name="description"></textarea>
					</div>

					<div class="form-group">
						<label for="exampleFormControlInput1">Price(Indian Rupees)</label>
						<input type="number" class="form-control"
							id="exampleFormControlInput1" placeholder="In INR" name="price">
					</div>

					<div class="form-group">
						<label for="exampleFormControlSelect1">Example select</label> <select
							class="form-control" id="exampleFormControlSelect1"
							name="avilabilityStatus">
							<option value="Available">Available</option>
							<option value="Not Avaible">Not Available</option>
						</select>
					</div>

					<button type="submit" class="btn btn-dark">Add Product</button>
					<button type="button" class="btn cancel" onclick="closeForm()">Close</button>


				</form>



			</div>

			<div class="form-popup-delete" id="deletePopUp">


				<form class="form-container" method="post"
					action="delete/${product.id}">

					<h3>Confirm Delete</h3>

					<button type="submit" class="btn btn-danger">Delete</button>
					<button type="button" class="btn cancel"
						onclick="closeDeleteForm()">Close</button>


				</form>



			</div>





		</div>


	</div>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>