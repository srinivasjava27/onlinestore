<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contentRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping -${title}</title>

<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap  readable theme CSS -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">

		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<div class="content">
			<!-- page content -->

			<!-- Loading the Home content-->
			<c:if test="${userClickHome ==true}">
				<%@include file="home.jsp"%>
			</c:if>

			<!-- Loading the About us content-->
			<c:if test="${userClickAbout ==true}">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- Loading the Contact us-->
			<c:if test="${userClickContact ==true}">
				<%@include file="contact.jsp"%>
			</c:if>

			<!-- Loading the view all products-->
			<c:if test="${userClickAllProducts ==true or userClickCategoryproducts == true}">
				<%@include file="listProducts.jsp"%>
			</c:if>
		</div>
		<!-- Footer comes here -->
		<%@include file="./shared/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.min.js"></script>

		<!-- self coded javascript file -->
		<script src="${js}/myapp.js"></script>

	</div>
</body>

</html>
