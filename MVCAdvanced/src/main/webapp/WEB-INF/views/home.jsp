<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

                                <!-- CSS PART -->

<!-- Bootstrap/Jquery CSS -->

<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">

<!-- MVC Static content CSS -->
                       
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">

<!-- Standalone CSS -->

<style>
.container {
	width: 30%;
}
</style>


                                 <!-- Javascript Part -->


<!-- Script Bootstrap, Jquery -->

<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker").datepicker({
			changeMonth : true,
			changeYear : true
		});
	});
</script>

<!-- MVC static Resources Js -->

<script type="text/javascript" src="<c:url value="/resources/js/script.js"/>"></script>







</head>
<body>
	<div class="container mt-5">
		<h3 class="text-center">Registration Form</h3>


<%-- <img alt="my image" src="<c:url value="/resources/image/pic.jpg"/>"> We can Add Image using the Tag..
First declare mvc:resources in config and provide path mapping --%>
		<div class="card mt-5 mx-auto" style="width: 100%">

			<div class="card-body">

				<form action="saveform1" method="post">

					<div class="alert alert-danger" role="alert">
					
					
					<!--To get the errors of Auto-binding form-data>>@modelattribute, Use jsp Spring-form taglib
					Provide as path="user" which is the name of the @ModelAttribute of the Form handler -->
					<form:errors path="user.*"></form:errors>
					
					
					
					
					
					
					</div>

					<div class="form-group">
						<label for="exampleInputPassword1">Name</label> <input type="text"
							class="form-control" name="name1" placeholder="Name">
					</div>

					<div class="form-group">
						<label for="exampleInputEmail1">Email address</label> <input
							type="email" class="form-control" name="email"
							aria-describedby="emailHelp" placeholder="Enter email">
					</div>


					<div class="form-group">
						<label for="exampleInputPassword1">Date Of Birth</label>
						<input type="date" class="form-control" name="dateOfBirth" placeholder=""> 
					
					</div>

					<div class="form-group">
						<label for="exampleInputPassword1">Courses <span
							style="font-size: 13px">(You Can select Multiple using
								Ctrl)</span>
						</label>
						<p></p>
						<select class="form-select" name="courses" style="width: 100%"
							size="3" multiple aria-label="multiple select example">
							<option value="Java"
								style="font-family: serif; font-style: italic;">Java</option>
							<option value="DotNET"
								style="font-family: serif; font-style: italic;">DotNET</option>
							<option value="Hibernate"
								style="font-family: serif; font-style: italic;">Hibernate</option>
							<option value="Python"
								style="font-family: serif; font-style: italic;">Python</option>
							<option value="Django"
								style="font-family: serif; font-style: italic;">Django</option>
							<option value="SpringBoot"
								style="font-family: serif; font-style: italic;">SpringBoot</option>
						</select>
					</div>

					<div class="form-group">
						<label for="exampleInputPassword1">Student Type</label>
						<p>
							<select class="form-select" name="studentType"
								style="width: 100%" aria-label="Default select example">
								<option selected>Select</option>
								<option value="old">Old Student</option>
								<option value="new">New Student</option>

							</select>
						</p>
					</div>




					<div class="form-group">
						<p>
							<label for="exampleInputPassword1">Gender</label>
						</p>

						<div class="form-check form-check-inline" style="padding-top: 2px">

							<input class="form-check-input" type="radio" name="gender"
								id="inlineRadio1" value="male"> <label
								class="form-check-label" for="inlineRadio1">Male</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="inlineRadio2" value="female"> <label
								class="form-check-label" for="inlineRadio2">Female</label>
						</div>

					</div>


					<div class="form-check" align="center">

						<input type="checkbox" class="form-check-input" name="chk">
						<label class="form-check-label" for="exampleCheck1">Accept
							term and Conditions</label>
					</div>

					<div class="container text-center mt-5">

						<button type="submit" class="btn btn-primary">Sign Up</button>


					</div>

				</form>


			</div>
		</div>

	</div>
</body>
</html>