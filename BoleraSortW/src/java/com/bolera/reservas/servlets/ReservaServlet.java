package com.bolera.reservas.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

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

        request.setAttribute("nombre", nombre);
        request.setAttribute("fecha", fecha);
        request.setAttribute("hora", hora);

        RequestDispatcher dispatcher = request.getRequestDispatcher("confirmacion.jsp");
        dispatcher.forward(request, response);
    }
}
