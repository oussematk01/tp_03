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
            <th>Nom et Prenom</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="adherant" items="${listeadherant}">
            <tr>
                <td>${adherant.id}</td>
                <td>${adhrant.titre}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/adherantemprunt/${adherant.id}">Liste des emprunts</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<a href="${pageContext.request.contextPath}/addlivre">Ajouter un livre</a>
<a href="${pageContext.request.contextPath}/enregistrerempreint">Enregister un empreint</a>
<a href="${pageContext.request.contextPath}/listeadherant">Liste des adhérants</a>
</body>
</html>