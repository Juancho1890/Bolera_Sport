<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Reserva Exitosa</title>
</head>
<body>
    <h2>¡Reserva Confirmada!</h2>
    <p>Gracias, <strong><%= request.getAttribute("nombre") %></strong></p>
    <p>Fecha: <%= request.getAttribute("fecha") %></p>
    <p>Hora: <%= request.getAttribute("hora") %></p>
    <p>Personas: <%= request.getAttribute("personas") %></p>
</body>
</html>
