<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <style><%@include file="../css/style.css"%></style>
    <style><%@include file="../css/bootstrap.min.css"%></style>
    <title>Ajouter-Projet</title>
    <style>
        .error {
            border-color: red;
        }
        .error-message {
            color: red;
            font-size: 0.875em;
        }
    </style>
    <script>
        function validateForm() {
            let isValid = true;

            const nom = document.getElementById('form6Example1');
            const budget = document.getElementById('form6Example2');
            const dateDebut = document.getElementById('form6Example3');
            const dateFin = document.getElementById('form6Example4');
            const description = document.getElementById('form6Example7');

            clearErrors();

            if (nom.value.trim() === '') {
                showError(nom, 'Nom de projet is required');
                isValid = false;
            }

            if (budget.value.trim() === '' || isNaN(budget.value) || Number(budget.value) <= 0) {
                showError(budget, 'Please enter a valid budget');
                isValid = false;
            }

            if (dateDebut.value.trim() === '') {
                showError(dateDebut, 'Date debut is required');
                isValid = false;
            }

            if (dateFin.value.trim() === '') {
                showError(dateFin, 'Date fin is required');
                isValid = false;
            }

            if (dateDebut.value.trim() !== '' && dateFin.value.trim() !== '' && new Date(dateDebut.value) > new Date(dateFin.value)) {
                showError(dateDebut, 'Date debut cannot be after Date fin');
                showError(dateFin, 'Date fin cannot be before Date debut');
                isValid = false;
            }

            if (description.value.trim() === '') {
                showError(description, 'Description is required');
                isValid = false;
            }

            return isValid;
        }

        function showError(element, message) {
            element.classList.add('error');
            const errorDiv = document.createElement('div');
            errorDiv.className = 'error-message';
            errorDiv.innerText = message;
            element.parentNode.appendChild(errorDiv);
        }

        function clearErrors() {
            const errorElements = document.querySelectorAll('.error');
            errorElements.forEach(element => element.classList.remove('error'));

            const errorMessages = document.querySelectorAll('.error-message');
            errorMessages.forEach(message => message.remove());
        }
    </script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
    <a class="navbar-brand" href="home">
        <img src="img/logo.png" alt="logo" height="36">
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
    </div>
</nav>
<div class="container1">
    <form action="ajouterProjet" method="post" onsubmit="return validateForm()">
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
        <button type="submit" class="btn btn-warning">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-plus-circle-fill" viewBox="0 0 16 16">
                <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0M8.5 4.5a.5.5 0 0 0-1 0v3h-3a.5.5 0 0 0 0 1h3v3a.5.5 0 0 0 1 0v-3h3a.5.5 0 0 0 0-1h-3z"></path>
            </svg>
            Ajouter
        </button>
    </form>
</div>
</body>
</html>
