<%-- 
    Document   : login
    Created on : 23-01-2025, 14:48:38
    Author     : JOSE DARIO CARTAGENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Incio de sesion</title>
</head>
<body>
    <h1>Iniciar sesión</h1>
    <form action="welcome" method="post">
        <label for="username">Usuario:</label>
        <input type="text" id="username" name="username" required><br>
        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" required><br>
        <button type="submit">Login</button>
    </form>
    <p style="color:red;">
        <%= request.getAttribute("error") != null ? request.getAttribute("error") : "" %>
    </p>
</body>
</html>

