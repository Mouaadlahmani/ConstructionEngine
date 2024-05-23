<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/style.css">
    <title>Taches</title>
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
    <div class="btn"><a type="button" href="addTache.html" class="btn btn-warning">Ajouter une tache</a></div>
    <div class="container2">
        <h3 style="color: #4D869C;">Taches</h3>
        <table class="table">
            <thead class="table-dark">
              <tr>
                <th scope="col">Tache Id</th>
                <th scope="col">Date de début</th>
                <th scope="col">Date de fin</th>
                <th scope="col">statut</th>
                <th scope="col">Description</th>
                <th scope="col">ressources</th>
                <th scope="col">Modifier</th>
                <th scope="col">Suprimer</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <th scope="row">1</th>
                <td>2024-05-20</td>
                <td>2024-12-20</td>
                <td>En cours</td>
                <td>This is a task</td>
                <td><a href="ressources.html">Ressources</a></td>
                <td><a type="button" class="btn btn-success mt-1" href="projet.html">
                  <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil-square" viewBox="0 0 16 16">
                  <path d="M15.502 1.94a.5.5 0 0 1 0 .706L14.459 3.69l-2-2L13.502.646a.5.5 0 0 1 .707 0l1.293 1.293zm-1.75 2.456-2-2L4.939 9.21a.5.5 0 0 0-.121.196l-.805 2.414a.25.25 0 0 0 .316.316l2.414-.805a.5.5 0 0 0 .196-.12l6.813-6.814z"></path>
                  <path fill-rule="evenodd" d="M1 13.5A1.5 1.5 0 0 0 2.5 15h11a1.5 1.5 0 0 0 1.5-1.5v-6a.5.5 0 0 0-1 0v6a.5.5 0 0 1-.5.5h-11a.5.5 0 0 1-.5-.5v-11a.5.5 0 0 1 .5-.5H9a.5.5 0 0 0 0-1H2.5A1.5 1.5 0 0 0 1 2.5z"></path>
                  </svg>
                  Modifier
                </a></td>
              </tr>
              <tr>
                <th scope="row">1</th>
                <td>2024-05-20</td>
                <td>2024-12-20</td>
                <td>En cours</td>
                <td>This is a task</td>
                <td><a href="ressources.html">Ressources</a></td>
              </tr>
              <tr>
                <th scope="row">1</th>
                <td>2024-05-20</td>
                <td>2024-12-20</td>
                <td>En cours</td>
                <td>This is a task</td>
                <td><a href="ressources.html">Ressources</a></td>
              </tr>
              <tr>
                <th scope="row">1</th>
                <td>2024-05-20</td>
                <td>2024-12-20</td>
                <td>En cours</td>
                <td>This is a task</td>
                <td><a href="ressources.html">Ressources</a></td>
              </tr>
              <tr>
                <th scope="row">1</th>
                <td>2024-05-20</td>
                <td>2024-12-20</td>
                <td>En cours</td>
                <td>This is a task</td>
                <td><a href="ressources.html">Ressources</a></td>
              </tr>
            </tbody>
          </table>
    </div>
</body>
</html>