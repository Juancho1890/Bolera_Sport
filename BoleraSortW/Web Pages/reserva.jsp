<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Reserva - Bolera Sport</title>
</head>
<body>
    <h2>Formulario de Reserva - Bolera Sport</h2>
    <form action="ReservaServlet" method="post">
        Nombre: <input type="text" name="nombre" required><br><br>
        Fecha: <input type="date" name="fecha" required><br><br>
        Hora: <input type="time" name="hora" required><br><br>
        Cantidad de Personas: <input type="number" name="personas" min="1" required><br><br>
        <input type="submit" value="Reservar">
    </form>
</body>
</html>
