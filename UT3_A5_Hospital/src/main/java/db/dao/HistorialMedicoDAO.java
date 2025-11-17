package db.dao;

import db.connection.HibernateUtil;
import db.model.HistorialMedico;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class HistorialMedicoDAO extends GenericDAOImpl<HistorialMedico, Integer> {
    public HistorialMedicoDAO(){
        super(HistorialMedico.class);
    }

    public List<HistorialMedico> findDiabeticPeople(String enfermedad) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            String hql = "FROM HistorialMedico WHERE enfermedad  LIKE :enfermedad";
            Query<HistorialMedico> query = session.createQuery(hql, HistorialMedico.class);
            query.setParameter("enfermedad","%"+ enfermedad+"%");
            return query.getResultList();
        }
    }
}
