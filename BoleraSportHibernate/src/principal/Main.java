package principal;

import dao.ReservaDAO;
import model.Reserva;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Reserva reserva = new Reserva();
        reserva.setNombreCliente("Juan Pérez");
        reserva.setFecha(LocalDate.now());
        reserva.setHora(LocalTime.of(18, 30));
        reserva.setPistaId(2);

        ReservaDAO dao = new ReservaDAO();
        dao.guardarReserva(reserva);

        System.out.println("✅ Reserva guardada correctamente.");
    }
}
