/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

public class Reserva {
    private int idReserva;
    private int idCliente;
    private int idPista;
    private Date fecha;
    private int duracionMinutos;

    public Reserva(int idCliente, int idPista, Date fecha, int duracionMinutos) {
        this.idCliente = idCliente;
        this.idPista = idPista;
        this.fecha = fecha;
        this.duracionMinutos = duracionMinutos;
    }

    public Reserva(int idReserva, int idCliente, int idPista, Date fecha, int duracionMinutos) {
        this(idCliente, idPista, fecha, duracionMinutos);
        this.idReserva = idReserva;
    }

    public int getIdReserva() { return idReserva; }
    public int getIdCliente() { return idCliente; }
    public int getIdPista() { return idPista; }
    public Date getFecha() { return fecha; }
    public int getDuracionMinutos() { return duracionMinutos; }
}