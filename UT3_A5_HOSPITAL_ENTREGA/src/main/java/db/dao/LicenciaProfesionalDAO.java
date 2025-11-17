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

            String hql = "FROM LicenciaProfesional WHERE organismo = :org";
            Query<LicenciaProfesional> query = session.createQuery(hql, LicenciaProfesional.class);
            query.setParameter("org", "OMC");

            return query.getResultList();
        }
    }
}