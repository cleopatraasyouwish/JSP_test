<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" session="false"%>

<!-- 
 	Dit is een taglib directive : hiermee laat je weten dat je de core 
	tag library van JSTL wilt gebruiken in deze JSP. Je bepaalt hier tevens 
	een zelf gekozen prefix die je in deze JSP gebruikt om aan te duiden
	dat de tag onderdeel is van de core tag library
-->	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/default.css">
<title>Veelvoud</title>
</head>

<body>

<h2> Veelvoud van 2</h2>

<ul>
<c:forEach var="arrayL" items="${arrayList}">

<li>${arrayL}</li>

</c:forEach>
</ul>

</body>

</html>