<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmación de Reserva</title>
</head>
<body>
    <h1>¡Reserva Realizada con Éxito!</h1>

    <p><strong>Nombre:</strong> <%= request.getAttribute("nombre") %></p>
    <p><strong>Fecha:</strong> <%= request.getAttribute("fecha") %></p>
    <p><strong>Hora:</strong> <%= request.getAttribute("hora") %></p>

    <a href="reserva.jsp">Hacer otra reserva</a>
</body>
</html>
