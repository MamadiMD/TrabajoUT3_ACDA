package db.dao;

import db.connection.HibernateUtil;
import db.model.Doctor;
import db.model.Paciente;
import org.hibernate.Session;

import java.util.List;

public class PacienteDAO extends GenericDAOImpl<Paciente, Integer>{
    public PacienteDAO() {
        super(Paciente.class);
    }

    public List<Doctor> getDoctoresPorPaciente(int pacienteID) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            String hql = "SELECT a.doctor FROM Paciente p JOIN p.atiende a WHERE p.pacienteID = :pacienteID";

            return session.createQuery(hql, Doctor.class)
                    .setParameter("pacienteID", pacienteID)
                    .list();
        }
    }
}
