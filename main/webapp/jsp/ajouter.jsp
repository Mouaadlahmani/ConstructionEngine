<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 23/05/2024
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <style><%@include file="../css/style.css"%></style>
    <style><%@include file="../css/bootstrap.min.css"%></style>
    <title>Ajouter-Projet</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
    <a class="navbar-brand" href="index.html">
        <img src="img/logo.png" alt="logo" height="36">
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
    </div>
</nav>
<div class="container1">
    <form method="post" action="projet.jsp">
        <!-- 2 column grid layout with text inputs for the first and last names -->
        <div class="row mb-4">
            <div class="col">
                <div data-mdb-input-init class="form-outline">
                    <label class="form-label" for="form6Example1">Nom de projet</label>
                    <input type="text" id="form6Example1" name="nom" class="form-control" />
                </div>
            </div>
            <div class="col">
                <div data-mdb-input-init class="form-outline">
                    <label class="form-label" for="form6Example2">Budget</label>
                    <input type="number" name="budget" id="form6Example2" class="form-control" />
                </div>
            </div>
        </div>

        <!-- Text input -->
        <div data-mdb-input-init class="form-outline mb-4">
            <label class="form-label" for="form6Example3">Date debut</label>
            <input type="date" name="dateDebut" id="form6Example3" class="form-control" />
        </div>

        <!-- Text input -->
        <div data-mdb-input-init class="form-outline mb-4">
            <label class="form-label" for="form6Example4">Date fin</label>
            <input type="date" name="dateFin" id="form6Example4" class="form-control" />
        </div>

        <!-- Message input -->
        <div data-mdb-input-init class="form-outline mb-4">
            <label class="form-label" for="form6Example7">Description</label>
            <textarea class="form-control" name="description" id="form6Example7" rows="4"></textarea>
        </div>

        <!-- Submit button -->
        <button type="button" class="btn btn-warning">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle-fill" viewBox="0 0 16 16">
                <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0M8.5 4.5a.5.5 0 0 0-1 0v3h-3a.5.5 0 0 0 0 1h3v3a.5.5 0 0 0 1 0v-3h3a.5.5 0 0 0 0-1h-3z"></path>
            </svg>
            Ajouter
        </button>
    </form>
</div>
</body>
</html>
