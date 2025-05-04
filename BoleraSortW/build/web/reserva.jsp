<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reserva - Bolera Sport</title>
</head>
<body>
    <h1>Formulario de Reserva - Bolera Sport</h1>
    <form action="reserva" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" required><br><br>

        <label for="fecha">Fecha de la reserva:</label>
        <input type="date" name="fecha" required><br><br>

        <label for="hora">Hora:</label>
        <input type="time" name="hora" required><br><br>

        <input type="submit" value="Reservar">
    </form>
</body>
</html>
