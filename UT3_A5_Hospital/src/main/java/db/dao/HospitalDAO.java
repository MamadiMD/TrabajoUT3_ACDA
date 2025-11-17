package db.dao;

import db.connection.HibernateUtil;
import db.model.Doctor;
import db.model.Habitacion;
import db.model.Hospital;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import java.util.List;

public class HospitalDAO extends GenericDAOImpl<Hospital,Integer>{

    public HospitalDAO() {
        super(Hospital.class);
    }

//    public  Hospital findByIdWithHabitaciones(int hospitalID) {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Hospital hospital = session.get(Hospital.class,hospitalID);
//            Hibernate.initialize(hospital.getHabitaciones());
//            return hospital;
//        }
//    }
//
//    public Hospital findByIdWithDoctores(int hospitalID) {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Hospital hospital = session.get(Hospital.class,hospitalID);
//            Hibernate.initialize(hospital.getDoctores());
//            return hospital;
//        }
//    }

    public List<Habitacion> getHabitacionesPorHospital(int hospitalID){
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            return session.createQuery("FROM Habitacion c WHERE c.habitacion.id = :hospitalID",
                    Habitacion.class).setParameter("hospitalID",hospitalID).list();
        }
    }

    public List<Doctor> getDoctoresPorHospital(int hospitalID){
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            return session.createQuery("FROM Doctor WHERE hospitalID = hospitalID",
                    Doctor.class).setParameter("hospitalID",hospitalID).list();
        }
    }
}
