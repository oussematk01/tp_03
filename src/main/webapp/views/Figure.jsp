<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Liste des Livres</title>
</head>
<body>
<header>
    <h1>Liste des Livres</h1>
</header>

<table border="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>Titre</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="livre" items="${listelivre}">
            <tr>
                <td>${livre.id}</td>
                <td>${livre.titre}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/livre/${livre.id}">Liste des emprunts</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<a href="${pageContext.request.contextPath}/addMatiere">Ajouter un livre</a>

</body>
</html>
