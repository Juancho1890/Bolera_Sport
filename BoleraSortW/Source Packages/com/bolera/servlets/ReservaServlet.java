package com.bolera.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ReservaServlet")
public class ReservaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("reserva.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String fecha = request.getParameter("fecha");
        String hora = request.getParameter("hora");
        String personas = request.getParameter("personas");

        request.setAttribute("nombre", nombre);
        request.setAttribute("fecha", fecha);
        request.setAttribute("hora", hora);
        request.setAttribute("personas", personas);

        request.getRequestDispatcher("confirmacion.jsp").forward(request, response);
    }
}
