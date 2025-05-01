/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


import dao.ReservaDao;
import model.Reserva;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReservaDao reservaDao = new ReservaDao();

        // Insertar
        Reserva nuevaReserva = new Reserva(1, 2, new Date(), 90);
        reservaDao.insertReserva(nuevaReserva);

        // Consultar
        Reserva consulta = reservaDao.getReservaById(1);
        if (consulta != null) {
            System.out.println("Reserva encontrada - Cliente ID: " + consulta.getIdCliente());
        }

        // Actualizar
        Reserva actualizada = new Reserva(1, 1, 2, new Date(), 120);
        reservaDao.updateReserva(actualizada);

        // Eliminar
        reservaDao.deleteReserva(3);

        // Listar todas
        List<Reserva> todas = reservaDao.getAllReservas();
        todas.forEach(r -> System.out.println("Reserva ID: " + r.getIdReserva()));
    }
}