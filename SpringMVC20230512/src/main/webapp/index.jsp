<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<ul>
		<li><a href="./mvc/hello/welcome">Welcome</a></li>
		<li><a href="./mvc/hello/sayhi?name=John&age=18">SayHi</a></li>
		<li><a href="./mvc/hello/bmi?h=170.0&w=60.0">BMI</a></li>
		<li><a href="./mvc/hello/age?age=18&age=19&age=24">Age</a></li>
		<li><a href="./mvc/hello/exam?score=80&score=100&score=50">Scores</a></li>
		<li><a href="./mvc/hello/person?name=John&score=90&age=18&pass=true">getPerson1</a></li>
		<li><a href="./mvc/hello/person?name=Mary&score=40&age=17&pass=false">getPerson2</a></li>
		<li><a href="./mvc/hello/user?name=John&score=90&age=18&pass=true">getUser1</a></li>
		<li><a href="./mvc/hello/user?name=Mary&score=40&age=17&pass=false">getUser2</a></li>
		<li>${ param.name }</li>
		
	</ul>
	
		Session09:<p>
	<ul>
		<li><a href="./mvc/lotto/">/mvc/lotto/</a></li>
	</ul>
	
			Session10:<p>
	<ul>
		<li><a href="./mvc/product/rest/">/mvc/product/rest/</a></li>
	</ul>
	
			Session11:<p>
	<ul>
		<li><a href="./mvc/session11/user/">/mvc/session11/user/</a></li>
	</ul>
	
			Session13:<p>
	<ul>
		<li><a href="./mvc/session13/person/">/mvc/session13/person/</a></li>
	</ul>	
	
			Session14:<p>
	<ul>
		<li><a href="./mvc/session14/stock/">/mvc/session14/stock/</a></li>
	</ul>
	
			Session15:<p>
	<ul>
		<li><a href="./mvc/session15/employee/">/mvc/session15/employee/</a></li>
	</ul>
	
			Session17:<p>
	<ul>
		<li><a href="./mvc/session17/division/">./mvc/session17/division/</a></li>
		<li><a href="./mvc/session17/book_author/">./mvc/session17/book_author/</a></li>
	</ul>

</body>
</html>