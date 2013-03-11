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
<title>JSTL Expample</title>
<style type="text/css">


li.groter {
	color:green;
}

li.kleiner {
	color: red;	
}


</style>
</head>

<body>
 <nav>
 	<ul>	
   <c:forEach var="menuItem" items="${hyperlinks}" begin="0">
   		<li  
				class="${menuItem.sterren>=4 ? 'groter' :(( menuItem.sterren<=2)?'kleiner' : '')}">

				
				 <a href="${menuItem.url}">${menuItem.naam}</a>
			
		
		</li>
</c:forEach>
   </ul>
	</nav>













</body>

</html>