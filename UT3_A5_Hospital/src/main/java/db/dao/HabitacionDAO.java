package db.dao;

import db.connection.HibernateUtil;
import db.model.Habitacion;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class HabitacionDAO extends GenericDAOImpl<Habitacion, Integer> {

    public HabitacionDAO() {
        super(Habitacion.class);
    }

    public List<Habitacion> findHabitacionesDisponibles() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            String hql = "FROM Habitacion WHERE disponible = :estadoDisponible";
            Query<Habitacion> query = session.createQuery(hql, Habitacion.class);
            query.setParameter("estadoDisponible", true);

            return query.getResultList();
        }
    }

}