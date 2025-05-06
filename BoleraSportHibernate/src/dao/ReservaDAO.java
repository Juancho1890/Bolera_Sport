package dao;

import model.Reserva;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReservaDAO {
    private static final SessionFactory sessionFactory =
        new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Reserva.class).buildSessionFactory();

    public void guardarReserva(Reserva reserva) {
        Transaction tx = null;
        try (Session session = sessionFactory.openSession()) {
            tx = session.beginTransaction();
            session.save(reserva);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}
