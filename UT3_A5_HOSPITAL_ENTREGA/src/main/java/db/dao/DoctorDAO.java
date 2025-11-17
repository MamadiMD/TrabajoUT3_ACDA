package db.dao;

import db.connection.HibernateUtil;
import db.model.Doctor;
import db.model.Habitacion;
import db.model.Paciente;
import org.hibernate.Session;

import java.util.List;

public class DoctorDAO extends GenericDAOImpl<Doctor, Integer>{
    public DoctorDAO() {
        super(Doctor.class);
    }


    public List<Paciente> getPacientesPorDoctor(int doctorID) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {


            String hql = "SELECT a.paciente FROM Doctor d JOIN d.atiende a WHERE d.doctorID = :doctorID";

            return session.createQuery(hql, Paciente.class)
                    .setParameter("doctorID", doctorID)
                    .list();
        }
    }

}
