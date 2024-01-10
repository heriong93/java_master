<%@page import="com.yedam.book.vo.BookVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>90o
<html>
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
	<meta name="description" content="" />
	<meta name="author" content="" />
	<title>Scrolling Nav - Start Bootstrap Template</title>
	<link rel="icon" type="image/x-icon" href="../assets/favicon.ico" />
	<!-- Core theme CSS (includes Bootstrap)-->
	<link href="../layout/styles.css" rel="stylesheet" />
</head>

<body id="page-top">
	<!-- Navigation-->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
		<div class="container px-4">
			<a class="navbar-brand" href="#page-top">Start Bootstrap</a>
			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive"
				aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><span
					class="navbar-toggler-icon"></span></button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ms-auto">
					<li class="nav-item"><a class="nav-link" href="#about">About</a></li>
					<li class="nav-item"><a class="nav-link" href="#services">Services</a></li>
					<li class="nav-item"><a class="nav-link" href="#contact">Contact</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- Header-->
	<header class="bg-primary bg-gradient text-white">
		<div class="container px-4 text-center">
			<h1 class="fw-bolder">Welcome to Scrolling Nav</h1>
			<p class="lead">A functional Bootstrap 5 boilerplate for one page scrolling websites</p>
			<a class="btn btn-lg btn-light" href="#about">Start scrolling!</a>
		</div>
	</header>
	<!-- Services section-->
	<section class="bg-light" id="services">
		<div class="container px-4">
			<div class="row gx-4 justify-content-center">
				<div class="col-lg-8">
					<table class="table">
						<thead>
							<tr>
								<th>책번호</th>
								<th>책이름</th>
								<th>저자</th>
								<th>출판사</th>
								<th>가격</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="vo" items="${bookList}">
								<tr>
									<td>${vo.bookCode}</td>
									<td>${vo.bookName}</td>
									<td>${vo.bookAuthor}</td>
									<td>${vo.bookPress}</td>
									<td>${vo.bookPrice}</td>
								</tr>

							</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</section>
	<!-- Footer-->
	<footer class="py-5 bg-dark">
		<div class="container px-4">
			<p class="m-0 text-center text-white">Copyright &copy; Your Website 2023</p>
		</div>
	</footer>
	<!-- Bootstrap core JS-->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="WEB-INF/layout/scripts.js"></script>
</body>

</html>