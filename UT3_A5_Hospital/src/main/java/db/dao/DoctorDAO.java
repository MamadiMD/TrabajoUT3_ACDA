package db.dao;

import db.model.Doctor;

public class DoctorDAO extends GenericDAOImpl<Doctor, Integer>{
    public DoctorDAO() {
        super(Doctor.class);
    }
}
