package db.dao;

import db.connection.HibernateUtil;
import db.model.LicenciaProfesional;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class LicenciaProfesionalDAO extends GenericDAOImpl<LicenciaProfesional, Integer>{
    public LicenciaProfesionalDAO(){
        super(LicenciaProfesional.class);
    }
    public List<LicenciaProfesional> findOrganismoOMC() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            String hql = "FROM Habitacion WHERE disponible = :estadoDisponible";
            Query<LicenciaProfesional> query = session.createQuery(hql, LicenciaProfesional.class);
            query.setParameter("estadoDisponible", true);

            return query.getResultList();
        }
    }
}
