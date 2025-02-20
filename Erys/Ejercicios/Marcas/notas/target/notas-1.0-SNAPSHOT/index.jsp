<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page session="true" %>

<%
    List<String> notes = (List<String>) session.getAttribute("notes");
    if (notes == null) {
        notes = new ArrayList<>();
        session.setAttribute("notes", notes);
    }
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Notas</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-5">
    <h2>Gestor de Notas</h2>
    
    <!-- Formulario para agregar nota -->
    <form action="AddNoteServlet" method="post" class="mb-3">
        <div class="input-group">
            <input type="text" name="note" class="form-control" placeholder="Escribe una nota..." required>
            <button type="submit" class="btn btn-primary">Añadir</button>
        </div>
    </form>

    <!-- Lista de notas -->
    <ul class="list-group">
        <% for (String note : notes) { %>
            <li class="list-group-item d-flex justify-content-between">
                <%= note %>
                <form action="DeleteNoteServlet" method="post" style="display:inline;">
                    <input type="hidden" name="note" value="<%= note %>">
                    <button type="submit" class="btn btn-danger btn-sm">Eliminar</button>
                </form>
            </li>
        <% } %>
    </ul>
</body>
</html>
