<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   
   <header>
    <h1>Liste des Emprunts</h1>
</header>

<p>Adherant:</p> <p>${listeempruntbyuser.adherant.nom} ${listeempruntbyuser.adherant.prenom}</p>
<table border="1">
    <thead>
        <tr>
            <th>id </th>
            <th>livre </th>
            <th>emprunt</th>
            <th>Date Emprunt</th>
                        <th>Action</th>
            
            
        </tr>
    </thead>
    <tbody>
        <c:forEach var="listeemprunt" items="${listeempruntbyuser}">
            <tr>
                <td>${listeemprunt.id}</td>
                <td>${listeemprunt.livre.titre}</td>
                <td>${listeemprunt.livre.date}</td>
                <td>${listeemprunt.dateEmprunt}</td>
             <td> <a href="${pageContext.request.contextPath}/affichelivreasupprimer">supprimer</a></td>
                
                
           
            </tr>
        </c:forEach>
    </tbody>
</table>

<a href="${pageContext.request.contextPath}/listlivre">Liste des Livres</a>
<a href="${pageContext.request.contextPath}/listeadherant">Liste des Adhérants</a>
   
</body>
</html>