package db.dao;

import db.connection.HibernateUtil;
import db.model.Hospital;
import org.hibernate.Hibernate;
import org.hibernate.Session;

public class HospitalDAO extends GenericDAOImpl<Hospital,Integer>{

    public HospitalDAO() {
        super(Hospital.class);
    }

    public  Hospital findByIdWithHabitaciones(int hospitalID) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Hospital hospital = session.get(Hospital.class,hospitalID);
            Hibernate.initialize(hospital.getHabitaciones());
            return hospital;
        }
    }

//    public Hospital findByIdWithDoctores(int hospitalID) {
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//            Hospital hospital = session.get(Hospital.class,hospitalID);
//            Hibernate.initialize(hospital.getDoctores());
//            return hospital;
//        }
//    }
}
