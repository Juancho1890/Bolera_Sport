/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DatabaseConnection;
import model.Reserva;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservaDao {

    public boolean insertReserva(Reserva reserva) {
        String sql = "INSERT INTO reservas (id_cliente, id_pista, fecha, duracion) VALUES (?, ?, ?, ?)";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, reserva.getIdCliente());
            statement.setInt(2, reserva.getIdPista());
            statement.setTimestamp(3, new Timestamp(reserva.getFecha().getTime()));
            statement.setInt(4, reserva.getDuracionMinutos());

            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println("Error al insertar reserva: " + e.getMessage());
            return false;
        }
    }

    public Reserva getReservaById(int idReserva) {
        String sql = "SELECT * FROM reservas WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, idReserva);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                return new Reserva(
                    result.getInt("id"),
                    result.getInt("id_cliente"),
                    result.getInt("id_pista"),
                    result.getTimestamp("fecha"),
                    result.getInt("duracion")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener reserva: " + e.getMessage());
        }
        return null;
    }

    public List<Reserva> getAllReservas() {
        List<Reserva> reservas = new ArrayList<>();
        String sql = "SELECT * FROM reservas";
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement()) {

            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                reservas.add(new Reserva(
                    result.getInt("id"),
                    result.getInt("id_cliente"),
                    result.getInt("id_pista"),
                    result.getTimestamp("fecha"),
                    result.getInt("duracion")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Error al listar reservas: " + e.getMessage());
        }
        return reservas;
    }

    public boolean updateReserva(Reserva reserva) {
        String sql = "UPDATE reservas SET id_cliente = ?, id_pista = ?, fecha = ?, duracion = ? WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, reserva.getIdCliente());
            statement.setInt(2, reserva.getIdPista());
            statement.setTimestamp(3, new Timestamp(reserva.getFecha().getTime()));
            statement.setInt(4, reserva.getDuracionMinutos());
            statement.setInt(5, reserva.getIdReserva());

            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al actualizar reserva: " + e.getMessage());
            return false;
        }
    }

    public boolean deleteReserva(int idReserva) {
        String sql = "DELETE FROM reservas WHERE id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, idReserva);
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error al eliminar reserva: " + e.getMessage());
            return false;
        }
    }
}