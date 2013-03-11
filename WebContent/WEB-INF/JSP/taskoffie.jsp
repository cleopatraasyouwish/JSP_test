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


tr.even {
	color:orange;
}

tr.oneven {
	color: black;	
}
tr.first{
	color:green;
}
tr.last{
	color:blue;
}
</style>
</head>

<body>



<h2>Over een Taskoffie JavaBeans itereren</h2>

<table border=1>

<tr>
<th> Merk Van koffie </th>
<th> Soort Van koffie </th>

</tr>

<c:forEach var="TasKoffie" items="${collectie}">

<tr>
<td> ${TasKoffie.merk} </td>
<td> ${TasKoffie.koffieSoort} </td>

</tr>

</c:forEach>
</table>

<table border='1'>

<c:forEach begin="0" var="TasKoffie"  varStatus="status" items="${collectie}">



<tr class="${status.count % 3 == 0 ? 'even' : 'oneven'}" >


<td> ${TasKoffie.merk} </td>
<td> ${TasKoffie.koffieSoort} </td>



</tr>



</c:forEach>

</table>













</body>

</html>